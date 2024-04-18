pipeline {
         agent any
         stages {
                 stage('One') {
                 steps {
                     echo 'Hi, welcome to pipeline demo...'
                 }
                 }
                 stage('Two') {
                 steps {
                    echo('Sample testing of Stage 2')
                 }
                 }
                 stage('Three') {
                
                 steps {
                deploy adapters: [tomcat9(credentialsId: '8fcfe447-fbef-40e3-8166-b20bbfa233fa', path: '', url: 'http://localhost:3000/')], contextPath: null, war: '**/*war'
                 }
                 }
              }
}
