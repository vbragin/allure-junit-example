pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                withAllureUpload(serverId: 'localhost', projectId: '1', results: [[path: 'target/allure-results']]) {
                                sh './mvnw -Dmaven.test.failure.ignore=true clean verify'
                }

            }
        }
        stage("Reports") {
            steps {
                allure results: [[path: 'target/allure-results']]
            }
        }
    }
    post {
        always {
            deleteDir()
        }
    }
}
