pipeline {
  agent any
  stages {
    stage('INIT') {
      parallel {
        stage('INIT') {
          steps {
            echo 'init pipeline for cineteka , build version =  $BUILD_NUMBER   o ${BUILD_NUMBER }'
          }
        }

        stage('Check pom.xml') {
          steps {
            fileExists 'pom.xml'
          }
        }

      }
    }

    stage('CLEAN') {
      steps {
        sh '''mvn -version
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

    stage('Prepare Release') {
      steps {
        sh '''mv ./target/cineteca-*dependencies.jar ./target/cineteca-1.0-${currentBuild.number}.jar
cp ./target/cineteca-1.0-${currentBuild.number}.jar ./freezer/'''
      }
    }

  }
}