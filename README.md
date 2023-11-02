# Freshreview-assignment

Tools Used: 
Spring Tool Suite (SpringBoot), SQLyog(MySQL), POSTMAN(Testing) 

Dependencies used:-
1. Spring Data JPA  2. Spring Boot Dev Tools  3. Spring Web Services  4. MySQL Driver  5. Lombok

Successfully implemented REST API endpoint "/books" for both POST and GET methods. 
For loose coupling have divided packages into Repository, DTO(Data Transfer Object), DAO(Data Access Object), Service, and Controller, and have injected using @Autowired.

Have incorporated ResponseStructure and ResponseEntity, in order to have proper HTTP Responses(201-CREATED, 202-ACCEPTED in this case)

Have fully verified these endpoints in POSTMAN with 100% success rate.

How could have I made this better?
Could have incorporated @ControllerAdvice and handle all the exceptions, could have created custom exceptions that can be used in the global exception handler.
