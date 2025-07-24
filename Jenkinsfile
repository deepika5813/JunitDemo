pipeline {
    agent any

    tools {
        maven 'Maven 3.9.11'  // Must match Jenkins tools config
    }

	environment {
		APP_NAME = 'JUnit4-App_Calculator'
	}
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/deepika5813/JunitDemo.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
        stage('Archive JAR'){
			steps {
				archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
			}
		}
    }
    
    post {
		success {
			echo "Build completed successfully!"
		}
		failure {
			echo "Build failed. Please check console logs."
		}
	}
}
