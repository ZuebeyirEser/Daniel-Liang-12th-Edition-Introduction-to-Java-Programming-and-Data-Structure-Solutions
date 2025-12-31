# Daniel-Liang-12th-Edition-Introduction-to-Java-Programming-and-Data-Structure-Solution
# Introduction to Java Programming - Chapter X Solutions

This repository contains my own solutions to the programming exercises found in Chapter X of the "Introduction to Java Programming and Data Structures" book by Daniel Liang (12th Edition).

## Table of Contents

- [About](#about)
- [Getting Started](#getting-started)
- [Solutions](#solutions)


## About

In this repository, you will find my solutions to the programming exercises presented in Chapter X of the book. These solutions are meant to serve as a reference and learning resource for anyone studying Java programming using this textbook.

Feel free to use these solutions as a guide or reference when working on your own exercises, but I encourage you to try solving the problems independently first to maximize your learning. Because it is reall working if you are trying to solve each problem without looking any answer online.

## Getting Started

To access the solutions, simply navigate to the respective chapter's folder in this repository. Each folder is organized by chapter number, and within each chapter folder, you will find individual Java files named after the exercise number they correspond to.


To run a solution, you will need a Java development environment such as [Eclipse](https://www.eclipse.org/downloads/) or [IntelliJ IDEA](https://www.jetbrains.com/idea/download/). You can also compile and run the Java files using the command line.

```shell
javac ExerciseX.java  # Compile the Java file
java ExerciseX        # Run the compiled program
```
## Running with Maven

This project is also configured as a Maven project so you can build and run exercises from the command line. [web:43]

First, build the project:
```shell
mvn clean package
```

Then run a specific exercise using the Maven exec plugin.  
For example, for Chapter 1, Exercise 1 (`chapter01.Exercise01_01`):

```shell
mvn exec:java -Dexec.mainClass="chapter01.Exercise01"
```
For Chapter 1, Exercise 2 (`chapter1.Exercise01_02`):

```shell
mvn exec:java -Dexec.mainClass="chapter1.Ex1"
```
Change the class name (`Exercise01_01`, `Exercise05_22`, `Exercise09_42`, …) according to the exercise you want to run. Note that number before the  `_`represent the chapter number and after the `_`represents the exercise number
## Solutions
Feel free to explore the solutions by navigating to the specific chapter and exercise you're interested in. You can view the source code and explanations to gain insights into how each problem is solved.
