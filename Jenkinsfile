pipeline {
    agent any

    environment {
        APP_NAME = "library-cunoc"
        JAR_NAME = "library_cunoc.jar"
        REPO_URL = "https://github.com/mromer08/test-jenkins.git"
        DEPLOY_PATH = "/home/manu/Documents/dev" // Ruta en tu EC2
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: "main", credentialsId: "github_PAT", url: "${REPO_URL}"
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
                        export SUPER_SECRET=${SUPER_SECRET}

                        echo "🚀 Iniciando la nueva versión..."
                        nohup java -jar ${DEPLOY_PATH}/${JAR_NAME} > ${DEPLOY_PATH}/app.log 2>&1 &
                    """
                }
            }
        }
    }
}
