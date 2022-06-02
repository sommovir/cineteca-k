pipeline {
  agent any
  tools { 
      maven 'MAVEN_HOME' 
      jdk 'JAVA_HOME' 
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