pipeline {
  agent {
    docker {
      image 'maven:3.8.4-openjdk-11-slim'
    }

  }
  stages {
    stage('INIT') {
      steps {
        echo 'init pipeline for cineteka'
      }
    }

    stage('version mvn') {
      steps {
        sh 'mvn -version'
      }
    }

  }
}