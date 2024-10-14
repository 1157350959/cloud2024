## SpringCloud learning progress
Part 1: Official SpringCloud chains, including Consul, Gateway, CircuitBreaker(Resilience4J implementation), Micrometer Tracing, OpenFeign, LoadBalancer  
Part 2: SpringCloud Alibaba chains, inlcuding Nacos, Seata, Sentinel  

The three final microservices(port number 2001, 2002, 2003) utilized   
* Nacos as server registration and configuration center
* Seata as distributed transaction management platform

The 8401 microservice utilized  
* Sentinel as the flow controller to achieve: flow control, concurrency limiting, circuit breaking, adaptive system protection

The 9001, 83, 3377 microservices utilized
* Nacos as server registration and configuration center
* RestTemplate to communicate microservices

The 8001, 8002, feign80, 80 microservices utilized
* Consul as server registration and configuration center
* RestTemplate(in 80) or OpenFeign(in feign80) to communicate microservices
* LoadBalancer(in 80) or OpenFeign(in feign80) for load balancing

The 9527 microservice utilized
* Gateway as component for routing APIs, and also path rewriting and rate limiting

The cloud-api-commons contains common packages including 
* common classes
* global exception handler
* APIs used in OpenFeign
