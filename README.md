#This repository is intended for basic Java practice, containing solutions to several questions.

LAB:1

a.	Write Java Program to print sum of N natural numbers using Scanner class
b.	Write a Java program to print the area of triangle. Save it with name TriArea.java in your folder.
c.	Write a java Program to check the number is Prime or not.
d.	Write a java program that takes a number as input from the user and prints the corresponding day of the week (using Switch statement)

LAB 2 Replica: 
a.	Write a java program to print sum of Odd natural numbers using Scanner class.
b.	Write a Program to print the area of Rectangle. Save it with name RecArea.java in your folder.
c.	Write a java Program to check the number is ODD or EVEN.
d.	Write a java program that takes a number as input from the user and prints the corresponding month of the year (using Switch statement)

LAB 3: 
a.	Create a Car class with the following attributes: make, model, year, and color. Include a method displayInfo() that prints out the 	details of the car.
b.	Create a Person class with attributes name, age, and address. Implement a method sayHello() that prints a greeting message 	including the person's name.
c.	Create a Rectangle class with attributes length and width. Include methods to calculate the area and perimeter of the rectangle.

LAB 3 Replica:
a.	Design a Book class with attributes title, author, and numberOfPages. Include a method displayBookInfo() to print out the book 	details.
b.	Develop a Person class with attributes name, gender, and age. Implement a method isAdult() that returns true if the person is 18 or older, otherwise false.
c.	Create a Circle class with attribute radius. Implement methods to calculate the area and circumference of the circle.

LAB 4: 
 a.	Implement a Student class with attributes name, age, grade. Include a method displayStudentInfo() that prints the student's information.
b.	Create a Dog class with attributes name, breed, and age. Implement a method bark() that prints a message representing the dog's bark.

LAB5:
a.	Write a program to create a class Student with data ‘name, city and age’ along with method printData to display the data. Create the two objects s1 ,s2 to declare and access the values.
b.	Develop a Java program to determine the total marks and percentage of a student. The program should prompt the user to input marks for 5 subjects using the Scanner class. Afterward, it should use if-else statements to categorize the student's performance and display the corresponding grade or division.

LAB5 Replica:

a.	Write a program to create a class Book with data ‘book_title, author and publication’ along with method printData to display the data. Create the two objects b1 ,b2 to declare and access the values.
b.	Develop a Java program to compute the gross salary of an employee along with the associated income tax. Prompt the user to input the basic salary, and calculate the gross salary using the formula: Gross Salary = Basic Salary + DA + HRA, where DA is 60% of the basic salary and HRA is 25% of the basic salary. Determine the income tax based on the annual salary range:
•	If the gross salary is between 3 Lakh to 5 Lakh, income tax is 10% of the annual salary.
•	If the gross salary is between 5 Lakh to 10 Lakh, income tax is 15% of the annual salary.
For gross salary exceeding 10 Lakh, income tax is 25% of the annual salary.

LAB 6:
a.	Create a Java program that demonstrates the use of an array of objects. Define a class named Student with attributes name (String) and age (int). Implement a constructor to initialize these attributes. In the main class, create an array of three Student objects, populate them with sample data, and then print out the information (name and age) of each student.
b.	Create a new Java class named Book. Add attributes (title and author), Implement a constructor to initialize these attributes. In the main class, create an array of Seven Book objects, populate them with sample data, and then print out the information title and author of each book
c.	Write a JAVA program to create a class Student with data ‘name, city and age’ along with method printData to display the data. Create the two objects s1, s2 to declare and access the values.

LAB 6 Replica:
a.	Create a class named Product with attributes pro_name (String) and pro_id (int). Implement a constructor to initialize these attributes. In the main class, create an array of five product objects, populate them with sample data, and then print out the information (name and id) of each product.
b.	Create a new Java class named Movie. Add attributes title, genre, and release year of a movie. Implement a constructor to initialize these attributes. In the main class, create an array of 3 Movie objects, populate them with sample data, and then print out the information title, genre, and release year of each Movie
c.	Write a Java Program to create a class Employee with Emp_name, Emp_code and Emp_sal as a data member. Write a method getdata to accept the data of E1 and E2. and display the data of the Employee using printdata method.

LAB 7 
a.	Define a Java program comprising three classes: Animal, Dog, and Cat. Establish a hierarchical relationship among these classes, with Animal serving as the superclass and Dog and Cat functioning as its subclasses. Implement a method named sound() within each class, which displays a message of its sound.
b.	Create a Java program featuring three classes: Shape, Circle, and Rectangle. Establish a superclass-subclass relationship, with Shape acting as the superclass and Circle and Rectangle as its subclasses. Implement a method named draw() within each class, In the Shape class, define draw() to display "I am parent shape class". Define draw() method in Circle and Rectangle class which prints some message. Implement the concept of inheritance and overriding.
c.	Develop a Java program illustrating the usage of the super keyword to access superclass members within a subclass method. Define two classes: Vehicle and Car, wherein Car extends Vehicle. Implement a method named display() in the Car class to demonstrate the usage of the super keyword. Inside the display() method, utilize the super keyword to access the speed variable of the superclass Vehicle.


LAB 8:

a.	Create a Java program to illustrate the concept of abstract classes and subclasses in the context of geometric shapes. The program should include an abstract class Shape, with an abstract method area() to calculate the area of a shape and a regular method display() to print a message indicating that it's a shape. Implement two concrete subclasses of Shape: Rectangle and Circle. Rectangle should have attributes length and width, and should implement the area() method to calculate the area of a rectangle. Circle should have attribute radius, and should implement the area() method to calculate the area of a circle. In the main() method: 
•	Create an object of class Rectangle with length 5 and width 3. 
•	Create an object of class Circle with radius 4. 
•	Display the information about each shape using the display() method. 
•	Calculate and display the area of each shape using the area() method.
b.	Develop a Java program to manage employee records. Define an abstract class Employee with the following attributes and methods:
Attributes: name (String), employeeId (integer), salary (double)
Methods: Abstract method calculateBonus() to calculate the bonus for the employee. Method displayDetails() to display the name, employee ID, salary, and bonus. Implement two concrete subclasses of Employee: Manager and Worker. Manager should have an additional attribute department (String) and should implement the calculateBonus() method to calculate bonus based on a percentage of the salary. Worker should have an additional attribute hoursWorked (integer) and should implement the calculateBonus() method to calculate bonus based on overtime hours worked.
In the main() method: 
•	Create an object of class Manager with name "John Smith", employee ID 101, salary $5000, department "Sales".
•	Create an object of class Worker with name "Emily Johnson", employee ID 102, salary $3000, and hours worked 45.
•	Display the details of each employee using the displayDetails() method.


LAB 8 Replica:

a.	Create a Java program to simulate a basic vehicle management system. Define an abstract class Vehicle with the following attributes and methods: 
Attributes: model (String), year (integer), price (double)
Methods: Abstract method calculateTax() to calculate the tax for the vehicle. Method displayInfo() to display information about the vehicle including model, year, price, and calculated tax.
Implement two concrete subclasses of Vehicle: Car and Motorcycle. Car should have an additional attribute numberOfSeats (integer) and should implement the calculateTax() method to calculate tax based on car's price and number of seats. Motorcycle should have an additional attribute engineCapacity (double) and should implement the calculateTax() method to calculate tax based on motorcycle's engine capacity.
In the main() method:
•	Create an object of class Car with model "Toyota Camry", year 2022, price 25000, and number of seats 5.
•	Create an object of class Motorcycle with model "Honda CB500F", year 2021, price 8000, and engine capacity 500.
•	Display the information about each vehicle using the displayInfo() method.
b.	Develop a Java program to simulate a bank account management system. Define an abstract class Account with the following attributes and methods:
Attributes: accountNumber (integer), accountHolder (String), balance (double)
Methods: Abstract method calculateInterest() to calculate the interest for the account. Method    displayInfo() to display the account information including account number, account holder, balance, and calculated interest.
         Implement two concrete subclasses of Account: SavingsAccount and CheckingAccount.
•	SavingsAccount should have an additional attribute interestRate (double) and should implement the calculateInterest() method to calculate interest based on the balance and interest rate.
•	CheckingAccount should have an additional attribute overdraftLimit (double) and should implement the calculateInterest() method to calculate interest based on the balance and a fixed rate.
       In the main() method:
•	Create an object of class SavingsAccount with account number 1001, account holder "Alice", balance $5000, and interest rate 0.05.
•	Create an object of class CheckingAccount with account number 1002, account holder "Bob", balance $3000, and overdraft limit $500.
•	Display the information about each account using the displayInfo() method.


LAB 9:
a.	Create a directory named geometry in your project directory. Inside the geometry directory, create a Java file named Circle.java which includes method to find area and circumference of the circle. create another Java file outside the geometry directory or in some other package which will use the Circle class and its methods from the geometry package
b.	Create a directory named datetime in your project directory. Inside the datetime directory, create a Java file named DateTimeUtils.java which includes getCurrentDate() and formatCustomDate(). Create another Java file outside the datetime directory, which will use the DateTimeUtils class from the datetime package


LAB 9:
a.	Write a program that will generate exceptions of type NullPointerException, NegativeArraySizeException, and IndexOutOfBoundsException. Record the catch of each exception by displaying the message stored in the exception object.
b.	Write a Java program that prompts the user to enter two integers representing the numerator and denominator of a fraction. Ensure that the denominator is not zero. If the denominator is zero, throw a custom exception called DivideByZeroException with an appropriate error message. Then, compute and display the result of dividing the numerator by the denominator. Your program should handle the DivideByZeroException by displaying the error message and asking the user to input the denominator again until a non-zero value is provided.


LAB 9 Replica: 
a.	Write a program that calls a method that throws an exception of type ArithmeticException at a random iteration in the for loop. Catch the exception in the method and pass the iteration count when the exception occurred to the calling method by using an object of an exception class you define.
b.	Write a Java program that reads an integer from the user representing the size of an array. Ensure that the user enters a positive integer. If the user enters a non-positive integer, throw a custom exception called InvalidSizeException with an appropriate error message. Then, create an array of the specified size and fill it with random integers between 1 and 100. Finally, print the array. Your program should handle the InvalidSizeException by displaying the error message and asking the user to input the size again until a valid positive integer is provided.
