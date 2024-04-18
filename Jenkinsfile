pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Add any build steps here if needed
            }
        }

        stage('Deploy') {
            steps {
                // Download and extract Tomcat
                sh 'wget http://mirror.nexcess.net/apache/tomcat/tomcat-9/v9.0.61/bin/apache-tomcat-9.0.61.tar.gz'
                sh 'tar -xvf apache-tomcat-9.0.61.tar.gz'

                // Start Tomcat server
                sh './apache-tomcat-9.0.61/bin/startup.sh'

                // Add any other deployment steps here
            }
        }

        stage('Test') {
            steps {
                // Add any testing steps here
            }
        }

        stage('Cleanup') {
            steps {
                // Stop Tomcat server
                sh './apache-tomcat-9.0.61/bin/shutdown.sh'

                // Clean up extracted files
                sh 'rm -rf apache-tomcat-9.0.61 apache-tomcat-9.0.61.tar.gz'
            }
        }
    }
}
