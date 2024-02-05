**Part 1: Input Methods Menu (Assignment1Part1)**

_Overview:_

The Input Methods Menu program demonstrates a versatile approach to accepting user input for calculating factorials in Java. The program supports multiple input methods, providing users with flexibility in how they provide input for the factorial calculation.

_Classes and Functions:_

Input1:
The main class that orchestrates the selection of input methods and triggers the factorial calculation based on user preferences.
Supports Command Line Arguments, Scanner, BufferedReader, DataInputStream, and Console for input.
Utilizes the FactorialCalculator class to perform the factorial calculation.
FactorialCalculator:
A helper class containing a recursive method to calculate the factorial of a non-negative integer.
Ensures the computation adheres to the mathematical definition of factorial.


**Part 2: Simple Calculator (Assignment1Part2)**

_Overview:_

The Simple Calculator program showcases a menu-driven calculator with various operations, including basic arithmetic, power, mean, and square root. Users can interactively choose an operation from the menu, input required values, and receive the result.

_Classes and Functions:_

1. Calculator:
    Central class that encapsulates all calculator operations.
    Utilizes the Input class to obtain numeric input for operations.
    Provides methods for addition, subtraction, multiplication, division, power, mean, and square root.
    The mean operation continuously reads numbers from the keyboard until the user enters "end" and then calculates the average.
2. Input:
    A helper class that assists in obtaining a pair of numeric inputs for calculator operations.
    Used by the Calculator class to collect numeric values.
3. Operations:
    The main execution class that allows users to choose a calculator operation from the menu.
    Instantiates the Calculator class and displays the result of the selected operation.
