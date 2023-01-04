pipeline {
    // master executor should be set to 0
    agent any
    stages {
        stage('Build Jar') {
            steps {
                //sh
                bat "mvn clean package -DskipTests"
            }
        }
        stage('Build Image') {
            steps {
                //sh
                bat "docker build -t='dockerfarheen/selenium-docker' ."
            }
        }
        stage('Push Image') {
            steps {
			    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'admin', usernameVariable: 'windocker')]) {
                    //sh
			        bat "docker login --username=${user} --password=${pass}"
			        bat "docker push dockerfarheen/selenium-docker:latest"
			    }                           
            }
        }
    }
}