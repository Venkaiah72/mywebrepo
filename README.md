# Selenium Automation Demo for OrangeHRM

## Overview
This project demonstrates automated testing of OrangeHRM using Selenium WebDriver with Java. It includes data-driven testing.

## Requirements
- JDK 8 or higher
- Maven
- Chrome WebDriver/ Any driver you want you've to initialize (@Optional"chrome") to execute in required browser

## Project Structure
- `src/test/java/com/example/tests`: Test classes
- `src/test/resources/README.md`: Instructions and details about the project

## How to Run
1. Clone the repository.
2. Navigate to the project directory.
3. Ensure dependencies are resolved (`mvn clean install`).
4. Run tests: `mvn test`.

## Test Cases
1. **LoginTest**: Validates login functionality with valid credentials.
2. **OtherTests**: Additional test cases can be added here.

## Notes
- Update `Config.properties` for different environments or configurations.
- Extend `BaseTest` for common setup/teardown operations.
