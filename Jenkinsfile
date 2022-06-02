pipeline {
  agent any
  stages {
    stage('INIT') {
      steps {
        echo 'init pipeline for cineteka'
      }
    }

    stage('Clean') {
      steps {
        sh '''echo $JAVA_HOME
echo $MAVEN_HOME
mvn clean'''
      }
    }

  }
}