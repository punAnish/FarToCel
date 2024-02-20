pipeline { 
  agent any

  environment {
    PATH = "${env.PATH}:/usr/bin" 
    // Update the PATH to include the directory of cmd.exe 
    GIT_CREDENTIALS = credentials('anishPun')
  }

  stages { 
    stage('Checkout') {
      steps {
        git branch: 'main', credentialsId: 'punAnish', url: 'https://github.com/punAnish/FarToCel.git'
      } 
    }
  }
}
    
