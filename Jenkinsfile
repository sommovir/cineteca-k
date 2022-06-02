pipeline {
  agent any
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