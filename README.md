This repository is about the Application development and Deployment using AWS as Cloud Platform.
Here is the Algorithm for the Application Development.
**Step 1**: A java application is developed using Maven Project to Display "Hello World!" and the same is verified by configuring Tomcat sever and application is available on localhost:8080.
**Step 2**: Now using AWS Cloud , EC2 is selected as Linux Machine.
**Step 3** : This Linux virtual machine is installed with JAVA, MAVEN,Docker,Jenkins,Prometheus and Grafana.
**Step 4**: Now CI/CD pipeline project is implemented using Jenkins.Following are the stages involved in Jenkins file.

            1. Git Checkout from Public repo " https://github.com/Srija1991/Bipolar"
            2. Package the application into jar file , Since application is developed in JAVA.
            3. Then Build a Docker image using the jar file.
            4. The application is deployed by running docker container.
            
  Step 5: The monitoring part is done using prometheus and Grafana. 
