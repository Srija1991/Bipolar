This Project is about the Application development and Deployment using AWS as Cloud Platform.<br />
Here is the Algorithm for the Application Development.<br />


Step 1: A java application is developed using Maven Project to Display "Hello World!" and the same is verified by configuring Tomcat sever and application is available on localhost:8080.<br />
Step 2: Now using AWS Cloud , EC2 is selected as Linux Machine.<br />
Step 3 : This Linux virtual machine is installed with JAVA, MAVEN,Docker,Jenkins,Prometheus and Grafana.<br />
Step 4: Now CI/CD pipeline project is implemented using Jenkins.Following are the stages involved in Jenkins file.<br />

            1. Git Checkout from Public repo " https://github.com/Srija1991/Bipolar"
            2. Package the application into jar file , Since application is developed in JAVA.
            3. Then Build a Docker image using the jar file.
            4. The application is deployed by running docker container.
            
  Step 5: The monitoring part is done using prometheus and Grafana. 


#A Step 1: A java application is developed using Maven Project to Display "Hello World!" and the same is verified by configuring Tomcat sever and application is available on localhost:8080.
![image](https://github.com/Srija1991/Bipolar/assets/120301491/9bb67f90-45c6-4523-b9ac-175404b8a3d2)<br />
![image](https://github.com/Srija1991/Bipolar/assets/120301491/d36d3ec1-a514-4909-bc2c-e43bf381f920) <br />

