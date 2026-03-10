# Skill 5: Spring @Autowired Annotation - Quick Start Guide

## What You'll Learn

This project demonstrates **Spring Dependency Injection using @Autowired**, a core Spring Framework feature that allows automatic injection of dependencies.

## The Problem It Solves

Without Spring:
```java
public class Student {
    private Certification certification;
    
    public Student() {
        this.certification = new Certification();  // Manual creation
    }
}
```

With Spring @Autowired:
```java
@Component
public class Student {
    @Autowired
    private Certification certification;  // Automatic injection by Spring!
}
```

## Quick Start (5 Minutes)

### 1. Download Spring JARs (2 minutes)

Download 6 JAR files to the `lib/` folder:
- spring-core-6.1.0.jar
- spring-beans-6.1.0.jar
- spring-context-6.1.0.jar
- spring-aop-6.1.0.jar
- spring-jcl-6.1.0.jar
- commons-logging-1.2.jar

### 2. Run the Project (1 minute)

**Windows**:
```batch
run-demo.bat
```

**Linux/Mac**:
```bash
./build.sh
```

### 3. See It Work (2 minutes)

The script will:
1. ✓ Compile your Java code
2. ✓ Run XML-based configuration demo
3. ✓ Run Annotation-based configuration demo
4. ✓ Display Student info with injected Certification

## Code Overview

### Certification.java
```java
@Component  // Spring creates a bean for this class
public class Certification {
    private int id;
    private String name;
    private String dateOfCompletion;
}
```

### Student.java
```java
@Component  // Spring creates a bean for this class
public class Student {
    @Autowired  // Spring injects Certification automatically
    private Certification certification;
}
```

### Two Ways to Run

#### 1. Annotation Configuration (Modern)
```java
ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
```

#### 2. XML Configuration (Traditional)
```java
ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
```

## Learning Objectives

After completing this skill, you should understand:

1. ✓ What @Component annotation does
2. ✓ What @Autowired annotation does
3. ✓ How Spring creates and manages beans
4. ✓ How dependency injection works
5. ✓ Difference between XML and annotation-based configuration
6. ✓ How to retrieve beans from Spring container

## Key Concepts

| Concept | Definition |
|---------|-----------|
| **Bean** | An object managed by Spring |
| **@Component** | Marks a class as a Spring bean |
| **@Autowired** | Tells Spring to inject a dependency |
| **IoC Container** | Spring's object management system |
| **Component Scan** | Spring's search for @Component classes |
| **Dependency Injection** | Providing objects instead of creating them |

## Project Files

```
skill-5-autowiring/
├── src/main/java/com/example/
│   ├── model/
│   │   ├── Certification.java   ← Model class with @Component
│   │   └── Student.java         ← Model class with @Autowired
│   ├── config/
│   │   └── AppConfig.java       ← Java configuration
│   ├── AnnotationConfigMain.java ← Run annotation demo
│   └── XMLConfigMain.java       ← Run XML demo
├── src/main/resources/
│   └── applicationContext.xml   ← XML configuration
├── lib/                          ← Spring JAR files (download)
├── run-demo.bat                  ← Windows script
├── build.sh                      ← Linux/Mac script
└── README.md                     ← Detailed documentation
```

## Troubleshooting

**Problem**: "ClassNotFoundException"
- **Solution**: Download Spring JARs to lib/ folder

**Problem**: "NoClassDefFoundError: org/springframework/aop/TargetSource"
- **Solution**: Make sure spring-aop-6.1.0.jar is in lib/ folder

**Problem**: "No qualifying bean of type Certification"
- **Solution**: Ensure @Component is on Certification class

## Next Steps

1. Run the demo and see the output
2. Read the detailed README.md for in-depth explanation
3. Modify Student and Certification with new fields
4. Experiment with different injection types (constructor, setter)
5. Create multiple Certification objects and use @Qualifier

## Important Notes

- Java 17+ required
- Spring 6.1.0 libraries needed
- Both XML and annotation configs work the same way
- @Autowired injects by type, not by name

Happy Learning! 🚀
