pipeline {
  agent any
  stages {
    stage('Git checkout') {
      steps {
        git(url: 'https://github.com/andrey-denisov/kubernetes-learn.git', branch: 'master', credentialsId: 'andrey-denisov')
      }
    }

    stage('Maven build') {
      steps {
        sh 'mvn release:prepare release:perform -Prelease -X'
      }
    }

  }
}