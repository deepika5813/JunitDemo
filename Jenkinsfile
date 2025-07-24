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
        stage('Docker Build') {
			steps {
				bat 'docker --version' //Optional : Verifies Docker CLI is working
				bat 'docker build -t junit4-app:latest .'
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
