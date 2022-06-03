pipeline {
  agent any
  stages {
    stage('INIT') {
      parallel {
        stage('INIT') {
          steps {
            echo 'init pipeline for cineteka , build version =  $BUILD_NUMBER   o ${BUILD_NUMBER} o ${currentBuild.number}'
          }
        }

        stage('Check pom.xml') {
          steps {
            fileExists 'pom.xml'
          }
        }

        stage('echo build number') {
          steps {
            sh 'echo "Build number is ${currentBuild.number}"'
          }
        }

      }
    }

    stage('CLEAN') {
      steps {
        sh '''export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
mvn -version
mvn clean'''
      }
    }

    stage('BUILD') {
      steps {
        sh '''export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
mvn compile'''
      }
    }

    stage('TEST') {
      steps {
        sh '''export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
mvn test'''
      }
    }

    stage('PACKAGE') {
      steps {
        sh '''export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
mvn package'''
      }
    }

    stage('Prepare Release') {
      steps {
        sh '''mv ./target/cineteca-*dependencies.jar ./target/cineteca-1.0-${BUILD_NUMBER }.jar
cp ./target/cineteca-1.0-${BUILD_NUMBER}.jar ./freezer/'''
      }
    }

  }
}