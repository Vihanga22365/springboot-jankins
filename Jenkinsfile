pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Checkout your source code from version control
                checkout scm

                // Build your Spring Boot application using Maven
                sh 'mvn clean package'
            }
        }

        stage('Deploy') {
            steps {
                // Copy the generated WAR file to the Tomcat webapps directory
                sh 'cp target/springbootJenkins.war C:/Program Files/Apache Software Foundation/Tomcat 9.0/webapps'

                // Restart Tomcat to deploy the application
                sh 'C:/Program Files/Apache Software Foundation/Tomcat 9.0/bin/shutdown.sh'
                sh 'C:/Program Files/Apache Software Foundation/Tomcat 9.0/bin/startup.sh'
            }
        }
    }
}
