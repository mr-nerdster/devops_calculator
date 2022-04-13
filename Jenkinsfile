pipeline {

    agent any

    stages {
        stage('Git pull') {
            steps {
                git branch: 'main', url: 'https://github.com/mr-nerdster/devops_calculator'
            }
        }
    }
}
