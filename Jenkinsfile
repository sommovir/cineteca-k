pipeline {
  agent {
    docker {
      args '-v /root/.m2:/root/.m2'
      image 'maven:3.8.5-openjdk-17'
    }

  }
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