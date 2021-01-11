pipeline {
   agent any

   stages {
      stage('Test Build') {
         steps {
            bat 'move target\registration-0.0.1-SNAPSHOT.war D:\my-money\TOOLS\jboss-eap-6.1\standalone\deployments'
         }
      }
   }
}
