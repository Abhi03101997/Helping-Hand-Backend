pipeline {
	agent any
    stages {
         stage('1. Git Pull ') {
            steps {
				 git url: 'https://github.com/divyesh-radadiya/Helping-Hand.git', branch: 'master',
                 credentialsId: 'git-divyesh-radadiya'
            }
        }
        stage('2. Docker Image') {
            steps {
                script {
                    imageName = docker.build "divyeshradadiya/helpinghand-forntend:latest"
                }
            }
        }
        stage('3. Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('', 'jenkins-docker') {
                        imageName.push()
                    }
                }
            }
        }
        stage('4. Git Pull') {
            steps {
				 git url: 'https://github.com/divyesh-radadiya/Helping-Hand-Backend.git', branch: 'master',
                 credentialsId: 'git-divyesh-radadiya'
            }
        }
        stage('5. Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('6. Maven Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('7. Docker Image') {
            steps {
                script {
                    imageName = docker.build "divyeshradadiya/helpinghand-backend:latest"
                }
            }
        }
        stage('8. Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('', 'jenkins-docker') {
                        imageName.push()
                    }
                }
            }
        }

        stage('9. Ansible Deploy') {
            steps {

                ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'ansible/inventory', playbook: 'ansible/playbook.yml'

            }
        }
    }
}