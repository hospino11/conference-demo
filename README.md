# conference-demo
Spring Boot - Creating your first Spring Boot application
## Topics covered
- @RestController
- @RequestMapping: Controller and method level.
- @GetMapping
- @ResponseStatus: allows to state the desired HTTP response status code.
- @DeleteMapping
- JpaRepository interface
    - getOne: retrieves the entity by its Id.
    - saveAndFlush: store and flush the data into the database.
    - deleteById: This doesn't allow delete the entity which has children.
- @PutMapping: PUT expects all attributes to be passed in. Missing attributes will be updated to null. If you need to update certain attributes you can use PATCH
- Jackson
    - @JsonIgnore
    - @JsonIgnoreProperties
- Customize Spring Boot application
    - Internal sources
        - application properties file
    - External sources
        - OS environment variables
        - Application properties (spring.profiles)
- custom attributes in application properties file (e.g app.version)
- @Value
- @Configuration
- @Bean
- DataSourceBuilder
- DataSource
        
## Order precedence custom application configuration
1. Command line args
2. SPRING_APPLICATION_JSON args
3. Servlet parameters
4. JNDI
5. Java System Properties
6. OS environment variable
7. Profile properties
8. Application properties
9. @PropertySource annotations
10. Default properties
