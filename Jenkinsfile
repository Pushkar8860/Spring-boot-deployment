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
                script{
                    bat 'docker build -t pushkarlearndocker/spring-boot-automation.jar .'
                }
            }
        }
        stage('Push Image to Docker hub') {
            steps {
                script{
                    withCredentials([string(credentialsId: 'docker-hub-new-id', variable: 'docker-hub-new')]) {
                        bat 'docker login -u pushkarlearndocker -p ${docker-hub-new}'
                        bat 'docker push pushkarlearndocker/spring-boot-automation.jar'
                    }
                }    
            }
        }
    }
}

