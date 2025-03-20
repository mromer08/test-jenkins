pipeline {
    agent any

    environment {
        APP_NAME = "my-springboot-app"
        JAR_NAME = "myapp.jar"
        REPO_URL = "git@github.com:tu-org/tu-repo-privado.git"
        DEPLOY_PATH = "/home/ubuntu/deploy" // Ruta en tu EC2
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: "development", credentialsId: "github-ssh-key", url: "${REPO_URL}"
            }
        }

        stage('Build Application') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Deploy Application') {
            steps {
                script {
                    sh """
                        echo "🔹 Deteniendo proceso anterior..."
                        pkill -f "${JAR_NAME}" || true
                        
                        echo "🔹 Moviendo el nuevo JAR a ${DEPLOY_PATH}..."
                        mv target/*.jar ${DEPLOY_PATH}/${JAR_NAME}
                        
                        echo "🔹 Exportando variables de entorno..."
                        export DB_HOST=${DB_HOST}
                        export DB_USER=${DB_USER}
                        export DB_PASSWORD=${DB_PASSWORD}

                        echo "🚀 Iniciando la nueva versión..."
                        nohup java -jar ${DEPLOY_PATH}/${JAR_NAME} > ${DEPLOY_PATH}/app.log 2>&1 &
                    """
                }
            }
        }
    }
}
