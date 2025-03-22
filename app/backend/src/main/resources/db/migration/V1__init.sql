CREATE TABLE Author (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(255) NOT NULL,
    nationality VARCHAR(100),
    birth_date DATE
);
