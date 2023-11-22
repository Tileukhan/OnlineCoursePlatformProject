# Online Course Platform

## SE-2210 Group Project


**Team Members:**
- Erzen Arman
- Tileukhan Seifulla

## Table of Contents

- [Project Description](#project-description)
- [Design Patterns](#design-patterns)
  - [Singleton Pattern](#singleton-pattern)
  - [Strategy Pattern](#strategy-pattern)
  - [Adapter Pattern](#adapter-pattern)
  - [Decorator Pattern](#decorator-pattern)
  - [Factory Pattern](#factory-pattern)
  - [Observer Pattern](#observer-pattern)
  
## Project Description

The Online Course Platform is a Java-based application designed to efficiently provide a variety of courses for students. It includes features such as course purchasing (e.g., Calculus, Web Development, Python), a convenient payment system, and the flexibility to choose the course format. The platform caters to both teachers and students, allowing teachers to add students, send welcome messages, and providing the ability to download course descriptions in both txt and html formats. Throughout the development, the team prioritized user convenience for students, parents, and teachers.

## Design Patterns

### Singleton Pattern

In our project, the Singleton pattern is applied to the `UserManager` class, ensuring a singular instance for centralized user management. This design choice establishes a global point for user-related operations, promoting efficiency by preventing unnecessary object instantiation.

### Strategy Pattern

The Strategy pattern is applied to handle payment methods. This design involves an interface, `PaymentStrategy`, defining a common method for payments, and a `PaymentContext` class managing the payment strategy dynamically. Concrete implementations encapsulate specific payment behaviors, allowing users to select and execute different payment strategies during the course enrollment process.

### Adapter Pattern

The Adapter pattern bridges the interface mismatch between `DownloadMaterial` and `HTMLSaver`. The `DownloadMaterialToHtmlAdapter` class acts as an intermediary, adapting the `HTMLSaver` interface to the `DownloadMaterial` interface, facilitating the integration of the HTMLDownloader into the broader structure of the online course platform application.

### Decorator Pattern

The Decorator pattern is utilized to extend the behavior of the `Course` interface without altering its structure. Decorators enhance the original `enroll` method by appending messages indicating the chosen course format, allowing users to dynamically choose different course formats during the enrollment process.

### Factory Pattern

The Factory pattern is employed to facilitate the dynamic creation of different courses within the Online Course Platform. Concrete factories, such as `CalculusCourseFactory`, `PythonCourseFactory`, and `WebDevelopmentCourseFactory`, create instances of the respective courses. This modular and extensible design allows for the addition of new courses and their corresponding factories.

### Observer Pattern

The Observer pattern is utilized to enable communication between the Online Course Platform and its enrolled students. This pattern allows for a loosely coupled design, where the platform can communicate with students without having explicit knowledge of their individual details.

![Platform Image](https://github.com/Tileukhan/OnlineCoursePlatformProject/assets/116358731/5ceadabe-5a58-4eb5-a3bb-9ffaa333e3c7)

