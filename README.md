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
