# Spring-data-jpa-tutorial

### Define Entity
* `@Entity` annotation on a class indicates it's a JPA entity. It means this class is mapped to a table in the database.
* `@Id` annotation indicates it's object Id or primary key in the database table. 
* `@GeneratedValue` indicates that the `Id` is automatically generated. 

### Defining a repository
* Define a interface e.g. `CustomerRepository` extends `CRUDRepository` which provides serveral default methods for saving, getting, updating and deleting the entity.
* You just define the interfae and Spring Data JPA creates an implementation when you run the application.

### Create an application 
* `@SpringBootApplication` - Mark application class with this annotation and it consists of servral other annotation.
  * `@Configuration`: Tags the class as a source of bean definitions for the application context.
  * `@EnableAutoConfiguration`: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
  * `@ComponentScan`: Tells Spring to look for other components, configurations, and services in the e.g. `com/example` package, letting it find the controllers.

## Reference 
[Spring Tutorials - Accessing Data JPA](https://spring.io/guides/gs/accessing-data-jpa/)
