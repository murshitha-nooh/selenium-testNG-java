🚀 Selenium Automation Framework
A robust and scalable Selenium WebDriver automation framework built using Java, TestNG, and Maven, following the Page Object Model (POM) design pattern. It supports data-driven testing, parallel execution, custom exception handling, and integrates ChainTest Reports for rich, interactive test reporting.
🧰 Tech Stack
      •	Language: Java
      •	Automation Tool: Selenium WebDriver
      •	Testing Framework: TestNG
      •	Build Tool: Maven
      •	Design Pattern: Page Object Model (POM)
      •	Reporting: ChainTest Report
      •	Execution: Parallel via TestNG XML
      •	Data Source: Excel (Apache POI)
      •	CI/CD: Ready for Jenkins or GitHub Actions
📦 Features
      •	✅ Page Object Model for clean separation of UI and logic
      •	📊 ChainTest Report integration for real-time dashboards and analytics2
      •	📁 Data-Driven Testing using Excel sheets
      •	⚙️ Parallel Execution via TestNG suite configuration
      •	🛠️ Custom Exception Listeners for enhanced error tracking
      •	📸 Screenshot Capture on test failure
      •	🔄 Reusable Utilities for browser setup, waits, and logging
      •	🔐 Configurable Properties for environment and credentials
📂 Project Structure
This framework follows the Maven standard directory layout and is designed for scalability, maintainability, and clarity.
    seleniumProject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.actions       # Encapsulates user actions and interactions
│   │   │   ├── com.constants     # Stores constant values like URLs, timeouts, etc.
│   │   │   ├── com.managers      # Manages WebDriver, configuration, and page object instances
│   │   │   ├── com.page          # Page Object classes representing UI elements and behaviors
│   │   │   └── com.utils         # Utility classes for logging, waits, browser setup, etc.
│   │   └── resources/
│   │       ├── chaintest.properties  # Configuration for ChainTest reporting
│   │       └── config.properties     # General test configuration (e.g., environment, credentials)
│   └── test/
│       ├── java/
│       │   ├── com.listeners     # Custom TestNG listeners for logging and error handling
│       │   └── com.tests         # Test classes containing actual test cases
│       └── resources/
│           ├── AdBlock_6.21.1.0.crx  # Chrome extension used during test runs
│           └── demo-qa.xml          # TestNG suite configuration for parallel execution


 
🚀 Getting Started
bash
# Clone the repo
git clone https://github.com/yourusername/selenium-automation-suite.git

# Navigate to project folder
cd selenium-automation-suite

# Run tests
mvn clean test
📸 Reporting with ChainTest
ChainTest provides:
•	Real-time execution dashboards
•	Historical test data tracking
•	Interactive charts and logs
•	Screenshot embedding on failure
•	Easy sharing with stakeholders
