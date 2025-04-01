# Phamnguyentrivinh Thigk1 Project

This project is a Spring Boot application designed to manage topics and students. It features a dashboard layout that allows users to navigate between different sections of the application.

## Project Structure

The project is organized as follows:

- **src/main/java/thigk/ntu64132994/phamnguyentrivinh_thigk1**
  - **controllers**
    - `DashboardController.java`: Handles requests related to the dashboard layout.
    - `StudentController.java`: Manages requests for student-related operations.
    - `TopicController.java`: Handles requests for topic-related operations.
  - **models**
    - `Student.java`: Represents the student entity with properties such as id, name, and groupId.
    - `Topic.java`: Represents the topic entity with properties such as id, topicName, topicDescription, supervisorId, and topicType.
  - `PhamnguyentrivinhThigk1Application.java`: The main entry point of the Spring Boot application.

- **src/main/resources**
  - `application.properties`: Configuration properties for the Spring Boot application.
  - **static**: Directory for static resources like CSS, JavaScript, and images.
  - **templates**
    - **fragments**
      - `header.html`: HTML for the header fragment used in the layout.
      - `sidebar.html`: HTML for the sidebar fragment used in the layout.
      - `footer.html`: HTML for the footer fragment used in the layout.
    - `dashboard.html`: HTML layout for the dashboard page.
    - `student.html`: HTML layout for the student page.
    - `topic.html`: HTML layout for the topic page.

- **src/test/java/thigk/ntu64132994/phamnguyentrivinh_thigk1**
  - `PhamnguyentrivinhThigk1ApplicationTests.java`: Test cases for the application.

## Getting Started

To run the application, ensure you have Maven installed and execute the following command in the project root directory:

```
./mvnw spring-boot:run
```

## Dependencies

This project uses the following dependencies:

- Spring Boot Starter Web
- Spring Boot Starter Thymeleaf
- Spring Boot Starter Test

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue for any suggestions or improvements.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.