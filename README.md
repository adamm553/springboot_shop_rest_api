### Bread Shop REST API

This project is a simple RESTful API for managing bread products in a bread shop. It's built using Java with the Spring Boot framework. The API allows users to perform CRUD (Create, Read, Update, Delete) operations on bread products.

### Features

- **View Products**: Users can retrieve information about available bread products.
- **View Product Details**: Detailed information about a specific bread product can be retrieved using its ID.
- **Search by Price Range**: Users can search for bread products within a specified price range.
- **Add Product**: Users can add new bread products to the inventory.
- **Update Product**: Existing bread products' information can be updated.
- **Delete Product**: Products that are no longer available can be removed from the inventory.

### Technologies Used

- **Java**: The core programming language used for backend development.
- **Spring Boot**: Framework for building the RESTful API quickly and with minimal configuration.
- **Maven**: Dependency management tool used for building and managing the project.
- **RESTful API**: Follows the principles of REST architecture for communication between client and server.
- **JSON**: Data interchange format used for sending and receiving data.
- **JUnit**: Testing framework for unit testing Java applications.
- **Git**: Version control system used for collaboration and managing project history.

### Project Structure

- **`KlasaMain.java`**: Main class responsible for running the Spring Boot application.
- **`Kontroler.java`**: Controller class defining REST endpoints for managing bread products.
- **`Pieczywo.java`**: Class representing a bread product with its properties.
- **`PieczywoStatyczne.java`**: Singleton class managing the collection of bread products.

### How to Use

1. Clone the repository to your local machine.
2. Ensure you have Java and Maven installed.
3. Navigate to the project directory and run `mvn spring-boot:run` to start the application.
4. Access the API endpoints using a REST client such as Postman or cURL.

### API Endpoints

- `GET /chleb`: Retrieve information about a specific bread product.
- `GET /chleby`: Retrieve a list of all bread products.
- `GET /chleb/{id}`: Retrieve details of a bread product by its ID.
- `GET /chleb/szukajcena?cenaOd={cenaOd}&cenaDo={cenaDo}`: Search for bread products within a price range.
- `POST /chleb/dodaj`: Add a new bread product to the inventory.
- `PUT /chleb/zmien/{id}`: Update details of an existing bread product.
- `DELETE /chleb/usun/{id}`: Remove a bread product from the inventory.

### Contributors

- Adam Piątek

### License

This project is licensed under the [MIT License](LICENSE).

### Acknowledgments

Special thanks to [Spring Boot](https://spring.io/projects/spring-boot) for providing a robust framework for building web applications in Java.
