
Tracking Number Generator API - README
Overview
This API generates unique tracking numbers for parcels. Built using Spring Boot, it is designed to be scalable, efficient, and capable of handling high concurrency.

Features
Endpoint: GET /next-tracking-number
Response: Returns tracking_number and created_at.
Tracking Number Format: Alphanumeric (1-16 characters), unique.
Scalable: Optimized for horizontal scalability and high concurrency.
Setup Instructions
Clone the repository: Download or clone the project to your local machine.

Build the application:

Ensure Java 17 and Spring Boot 3.4.1 are used.
mvn clean install
Run the application locally: Use the following command to start the application:

mvn spring-boot:run

Access the API: Once the application is running, the API can be accessed at:
http://localhost:8080/next-tracking-number?origin_country_id=MY&destination_country_id=ID&weight=1.234&created_at=2018-11-20T19:29:32+08:00&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBox%20Logistics&customer_slug=redbox-logistics


You can use below url to test Get Service which deployed on cloud enviornment.
http://parceltrackingnumbergenerator-production-27fb.up.railway.app/next-tracking-number?origin_country_id=MY&destination_country_id=ID&weight=1.234&created_at=2018-11-20T19:29:32+08:00&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBox%20Logistics&customer_slug=redbox-logistics
