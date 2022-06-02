pipeline {
  agent none
  stages {
    stage('INIT') {
      steps {
        echo 'init pipeline for cineteka'
      }
    }

    stage('Clean') {
      steps {
        sh '''java -version
mvn clean'''
      }
    }

  }
}