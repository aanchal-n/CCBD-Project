**THIS IS A SPRING BOOT APPLICATION USING JAVA**

**INTRODUCTION**<br>
This application consists of two microservices:
1.a microservice to check if a number is odd or even
2.a microservice to find sum of two numbers

**MICROSERVICE 1**<br>
this microservice takes input from url , and returns a string which is either "EVEN" or "ODD".

**MICROSERVICE 2**<br>
this microservice takes two numbers as input from url , return a string , which says " the sum is = ".

**LINKING THE TWO APPLICATIONS**<br>
->the two applicatons are linked using RESTTEMPLATE.<br>
->the two microservices communicate through http protocol. <br>
->the application is designed in such a way that, microservice 2 calls 
microservice 1.<br>
->Also the two microservices can be deployed independently.<br>
->the two microservices communicate synchronously.<br>

