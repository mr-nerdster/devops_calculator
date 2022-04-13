pipeline {

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
    }
}
