pipeline{
    agent any
    stages{
       stage('Git checkout') {
            steps {
                git branch: 'second_deployment', url: 'https://github.com/Pushkar8860/Spring-boot-deployment.git'
            }
        }
        stage('Build Spring Boot') {
            steps {
                bat 'mvn clean install -e -DskipTests'
            }
        }
        stage('Build Docker Image') {
            steps {
                bat 'docker build -t .'
            }
        }
    }
}

