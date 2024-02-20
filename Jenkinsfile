pipeline { 
  agent any
  environment {
    PATH = "${env.PATH}:/usr/bin" 
    // Update the PATH to include the directory of cmd.exe 
    GIT_CREDENTIALS = credentials('punAnish')
  }

  stages { 
    stage('Checkout') {
      steps {
        git branch: 'main', credentialsId: 'punAnish', url: 'https://github.com/punAnish/FarToCel.git'
      } 
    }

    stage('Test') {
      steps{
        sh 'mvn test'
      }
      post {
        success {
          // Publish JUnit test results
          junit '**/target/surefire-reports/TEST-*.xml' 
          // Generate JaCoCo code coverage report 
          jacoco(execPattern: '**/target/jacoco.exec')
        } 
      }
    }
  }
}
    
