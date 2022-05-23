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
        sh '''export PATH=$PATH:/var/jenkins_home/apache-maven-3.8.5/bin
mvn release:prepare release:perform -Prelease -X'''
      }
    }

  }
}