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
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
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
