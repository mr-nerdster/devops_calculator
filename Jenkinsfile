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
    }
}
