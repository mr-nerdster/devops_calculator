pipeline {
    environment { 
        registry = "nerdster/devops_calculator" 
        registryCredential = 'docker-jenkins' 
        dockerImage = '' 
        
    }

    agent any

    stages {
        stage('Git pull') {
            steps {
                git branch: 'main', url: 'https://github.com/mr-nerdster/devops_calculator'
            }
        }
        
         stage('Build Executable Jar'){
            steps {
             sh 'mvn clean test package'
            }
        }
        
        stage('Building Docker image') { 
            steps { 
                script { 
                    dockerImage = docker.build registry + ":$BUILD_NUMBER" 
                }
            } 
        }
        
            stage('Push image to DockerHub') { 
            steps { 
                script { 
                    docker.withRegistry('', registryCredential ) { 
                        dockerImage.push() 
                        
                    }
                } 
            }
        }
    }
}
