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


# Step 1: A java application is developed using Maven Project to Display "Hello World!" and the same is verified by configuring Tomcat sever and application is available on localhost:8080.
![image](https://github.com/Srija1991/Bipolar/assets/120301491/9bb67f90-45c6-4523-b9ac-175404b8a3d2)<br />

![image](https://github.com/Srija1991/Bipolar/assets/120301491/d36d3ec1-a514-4909-bc2c-e43bf381f920) <br />
# Step 2: Now using AWS Cloud , EC2 is selected as Linux Machine.<br />

![image](https://github.com/Srija1991/Bipolar/assets/120301491/6f2438e0-372d-47b3-a17e-f55056aa6862) <br />

# Step 3 : This Linux virtual machine is installed with JAVA, MAVEN,Docker,Jenkins,Prometheus and Grafana.<br />

![image](https://github.com/Srija1991/Bipolar/assets/120301491/69d9a6fd-f510-4272-b557-282d7e4e2c8f)
![image](https://github.com/Srija1991/Bipolar/assets/120301491/fddcf589-bd53-494e-b20c-c7657e0dee3a)<br />

This is the pipeline code for CI/CD using Jenkins <br />

![image](https://github.com/Srija1991/Bipolar/assets/120301491/d7e175dd-00a8-4c04-aabd-c7dc61a8ce8d) <br />

![image](https://github.com/Srija1991/Bipolar/assets/120301491/d2bdbec7-0ecd-4393-ac64-170bc814f19e)<br />

The pipeline is configured to check jenkins file form repo and perform buidl operation.

![image](https://github.com/Srija1991/Bipolar/assets/120301491/3f85bd92-8447-4c00-81de-0d370081c94b) <br />

![image](https://github.com/Srija1991/Bipolar/assets/120301491/39db7689-9efd-4997-b1b3-54426d4ed99e)








