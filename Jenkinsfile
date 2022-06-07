pipeline {
  agent any
  environment {
      mysqlContainer = "0e03ea1ddb44"
  }
  stages {
    stage('INIT') {
      parallel {
        stage('Start Message') {
          steps {
            echo '''init pipeline for cineteka , build version =  """${BUILD_NUMBER}"""'''
          }
        }

        stage('Check pom.xml') {
          steps {
            fileExists 'pom.xml'
          }
        }

        stage('Check MySQL connection') { 
            def dockerfile = 'Dockerfile.test'
            docker.build("rds-test", "-f ${dockerfile} .")
            def rds_test_image = docker.image('rds-test')

            docker.image('mysql:5.6').withRun('-e MYSQL_ALLOW_EMPTY_PASSWORD=yes') { container ->
            rds_test_image.inside("--link ${container.id}:mysql") {
            sh 'echo "Inside Container"'
    }
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

    stage('CLOVER & TEST') {
      steps {
        sh '''export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
        mvn --batch-mode clover:setup test clover:aggregate clover:clover -s mvn-settings.xml'''
        step([
         $class: 'CloverPublisher',
        cloverReportDir: 'target/site',
        cloverReportFileName: 'clover.xml',
        healthyTarget: [methodCoverage: 70, conditionalCoverage: 80, statementCoverage: 80],
        unhealthyTarget: [methodCoverage: 50, conditionalCoverage: 50, statementCoverage: 50],
        failingTarget: [methodCoverage: 0, conditionalCoverage: 0, statementCoverage: 0]
        ])
      }
    }

    stage('PACKAGE') {
      steps {
        sh '''export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
mvn package -DskipTests -Dmaven.main.skip'''
      }
    }

    stage('Prepare Release') {
      steps {
        sh '''mv ./target/cineteca-*dependencies.jar ./target/cineteca-1.0-build"""${BUILD_NUMBER}""".jar
mkdir -p ../freezer
cp ./target/cineteca-1.0-build"""${BUILD_NUMBER}""".jar ../freezer/cineteca-1.0-build"""${BUILD_NUMBER}""".jar'''
      }
    }

  }
}