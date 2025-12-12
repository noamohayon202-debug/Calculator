📌 Java Console Calculator

A simple and friendly Java console-based calculator that performs basic arithmetic operations, power calculations, square roots, circle area, averages, and more!
Designed for beginners learning Java methods, user input, and console menus.

🎯 Features

This calculator currently supports:

➕ Basic Arithmetic

Addition

Subtraction

Multiplication

Division

🧮 Advanced Math

Power (a^b)

Square Root

Circle Area (π × r²)

📊 Extra

Average of multiple numbers

(Early attempt) Pythagorean theorem (currently uses a*2 + b*2—may be updated later)

📝 How It Works

When you run the program, it displays a menu of operations:

1.add
2.subtract
3.multi
4.divide
5.power
6.square root
7.circle area


You simply enter the number of the operation you want, and the program will ask you to enter the required value(s).
All inputs use Scanner, and each operation is handled by its own method.

💻 Code Structure

All methods are inside the App class

Scanner is declared as a static instance for easy reuse

Each math function:

Prompts user for input

Calculates the result

Prints it to the console

Some key methods include:

add();        // performs addition  
subtract();   // performs subtraction  
multi();      // multiplies two numbers  
divide();     // divides two numbers  
power();      // a raised to b  
sqt();        // square root  
circlearea(); // πr²  
avrage();     // calculates average of N numbers  

🚀 How to Run

Make sure you have Java installed (JDK 8 or newer).

Compile the program:

javac App.java


Run it:

java App

📂 Project Purpose

This project is ideal for anyone learning:

Java basics

Methods

Scanner input

Simple math operations

Building console applicati
