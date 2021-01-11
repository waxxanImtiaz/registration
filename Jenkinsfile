pipeline {
   agent any

   stages {
      stage('Test Build') {
         steps {
            //bat 'move target\\registration-0.0.1-SNAPSHOT.war D:\\my-money\\TOOLS\\jboss-eap-6.1\\standalone\\deployments'
            deploy adapters: [jboss7(credentialsId: '4684a0c2-4fb5-4b5f-9b81-93ee8cf10756', url: 'http://localhost:9990/')], contextPath: 'registration', war: '**/.war'
         }
      }
   }
}
