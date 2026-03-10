# Spring Autowiring Demo - Project Index

## 📚 Documentation Files

### [README.md](README.md)
Comprehensive guide covering:
- Project overview and key concepts
- Detailed explanation of each class and their roles
- How @Autowired annotation works
- Configuration methods (XML vs Java annotation)
- Building and running instructions
- Expected output and troubleshooting

### [PROJECT_SUMMARY.md](PROJECT_SUMMARY.md)
Quick overview including:
- What is demonstrated in the project
- Project structure and key achievements
- Running instructions
- Learning outcomes

### [QUICK_REFERENCE.md](QUICK_REFERENCE.md)
Quick command reference with:
- Build and run commands
- Key files and their purposes
- @Autowired injection methods
- Spring bean lifecycle
- Common issues and solutions

## 🔧 Build and Run Scripts

### [build.bat](build.bat)
Windows batch script to compile the project using Maven

### [build.sh](build.sh)
Linux/Mac bash script to compile the project using Maven

### [run-xml-demo.bat](run-xml-demo.bat)
Windows script to run the XML configuration demo

### [run-annotation-demo.bat](run-annotation-demo.bat)
Windows script to run the Java configuration demo

## 📦 Maven Configuration

### [pom.xml](pom.xml)
Maven Project Object Model containing:
- Project metadata
- Spring Framework dependencies (5.3.23)
- SLF4J logging dependencies
- Build plugins (compiler, jar, shade)
- Java source/target level (11)

## 💻 Source Code

### Model Classes (Spring Beans)
- [Certification.java](src/main/java/com/example/model/Certification.java)
  - Represents certification details
  - Annotated with @Component
  - Contains: id, name, dateOfCompletion

- [Student.java](src/main/java/com/example/model/Student.java)
  - Represents a student with certification
  - Annotated with @Component and has @Autowired field
  - Contains: id, name, gender, and autowired certification

### Configuration Classes

- [AppConfig.java](src/main/java/com/example/config/AppConfig.java)
  - Java-based Spring configuration
  - Uses @Configuration and @ComponentScan
  - Replaces XML configuration with type-safe Java code

### Main Classes (Entry Points)

- [XMLConfigMain.java](src/main/java/com/example/XMLConfigMain.java)
  - Demonstrates XML-based configuration
  - Loads Spring context using ClassPathXmlApplicationContext
  - Retrieves and displays Student bean with injected Certification

- [AnnotationConfigMain.java](src/main/java/com/example/AnnotationConfigMain.java)
  - Demonstrates Java annotation-based configuration
  - Loads Spring context using AnnotationConfigApplicationContext
  - Retrieves and displays Student bean with injected Certification

## 🗂️ Configuration Resources

- [applicationContext.xml](src/main/resources/applicationContext.xml)
  - XML Spring configuration file
  - Contains component scan directive for automatic bean detection
  - Located in classpath for runtime discovery

## 🎯 Quick Navigation

### To Understand the Concept
1. Start with [README.md](README.md) - "Project Overview" section
2. Read "How @Autowired Works" section in [README.md](README.md)
3. Review [PROJECT_SUMMARY.md](PROJECT_SUMMARY.md)

### To See the Code
1. Check [Student.java](src/main/java/com/example/model/Student.java) - See @Autowired usage
2. Check [Certification.java](src/main/java/com/example/model/Certification.java) - See @Component usage
3. Compare [AppConfig.java](src/main/java/com/example/config/AppConfig.java) with [applicationContext.xml](src/main/resources/applicationContext.xml)

### To Build and Run
1. Read [QUICK_REFERENCE.md](QUICK_REFERENCE.md) - "Quick Start" section
2. Use build scripts or Maven commands
3. Check expected output in [README.md](README.md)

### To Run Examples
```bash
# XML Configuration Demo
mvn exec:java -Dexec.mainClass="com.example.XMLConfigMain"

# Java Configuration Demo
mvn exec:java -Dexec.mainClass="com.example.AnnotationConfigMain"
```

## 📋 Project Checklist

- ✅ Certification class created with @Component
- ✅ Student class created with @Component and @Autowired
- ✅ Component scanning configured (XML method)
- ✅ Component scanning configured (Java method)
- ✅ Spring IoC container loaded and used
- ✅ Student bean retrieved and displayed
- ✅ Certification dependency automatically injected
- ✅ Documentation completed
- ✅ Build scripts provided
- ✅ Run scripts provided

## 🚀 Getting Started

1. **Build the project**
   ```bash
   mvn clean compile
   ```

2. **Run either demo**
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.XMLConfigMain"
   ```
   or
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.AnnotationConfigMain"
   ```

3. **Study the output** to see how Spring automatically injects dependencies

## 📖 Key Concepts Explained

| Concept | Location | Description |
|---------|----------|-------------|
| @Component | [Certification.java](src/main/java/com/example/model/Certification.java), [Student.java](src/main/java/com/example/model/Student.java) | Marks class as Spring-managed component |
| @Autowired | [Student.java](src/main/java/com/example/model/Student.java) | Enables automatic dependency injection |
| @Configuration | [AppConfig.java](src/main/java/com/example/config/AppConfig.java) | Marks class as configuration source |
| @ComponentScan | [AppConfig.java](src/main/java/com/example/config/AppConfig.java) | Specifies packages for component scanning |
| ApplicationContext | [XMLConfigMain.java](src/main/java/com/example/XMLConfigMain.java), [AnnotationConfigMain.java](src/main/java/com/example/AnnotationConfigMain.java) | Spring's IoC container |
| XML Config | [applicationContext.xml](src/main/resources/applicationContext.xml) | Traditional Spring configuration |

## 🔗 Dependencies

```
Spring Framework 5.3.23
├── spring-core
├── spring-context
└── spring-beans

SLF4J 1.7.36 (Logging)
├── slf4j-api
└── slf4j-simple
```

## 💡 Learning Path

1. **Beginner**: Run the project and observe the output
2. **Intermediate**: Study the source code and configuration files
3. **Advanced**: Modify the classes to add more dependencies and practice multiple injection patterns
4. **Expert**: Explore advanced topics like @Qualifier, @Scope, lifecycle callbacks

---

**Project Created**: January 2026
**Spring Version**: 5.3.23
**Java Version**: 11+
**Build Tool**: Maven 3.6.0+
