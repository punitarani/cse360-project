# Contributing Guidelines

## Development

### Prerequisites

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (recommended version 19)
- [Apache Maven](https://maven.apache.org/download.cgi) (recommended version 3.8)

### Setup

1. Clone the repository

    ```bash
    git clone https://github.com/punitarani/cse360-project.git
    ```

2. Open the project
   - Preferably, use [IntelliJ IDEA](https://www.jetbrains.com/idea/) to open the project.
   - [Visual Studio Code](https://code.visualstudio.com/) can also be used.
     - Required Extensions: 
       - [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
   - Command line works as well but is not recommended.

### Build and Run

**Use `Maven` IntelliJ IDEA plugin or VS Code extension to build and run the Project.**

`Maven -> Plugins -> javafx -> javafx:run`

Command line instructions are provided for reference:

- Build: `mvn clean package`
- Run: `mvn clean javafx:run`
