pipeline {
  agent {
    docker {
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
        sh '''echo $JAVA_HOME
echo $MAVEN_HOME
mvn clean'''
      }
    }

  }
}