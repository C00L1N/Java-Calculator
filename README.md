# 🧮 Java Console Calculator
This is a simple console-based calculator written in Java. It supports basic arithmetic operations like
addition, subtraction, multiplication, and division. It also includes input validation to prevent 
crashes when users enter invalid values
---
## 📁 File
- `C00L1N_1.java` - Main Program File
---
## 🚀 How to Run
1. Make sure you have Java installed on your computer
2. Compile the code:
   `javac C00L1N_1.java`
3. Run the program:
   `java C00L1N_1`
---
## ⚙️ Features
- Takes two integer inputs from the user
- Validates non-integer input (e.g., letters, symbols)
- Prevents division by zero
- Offers a memu to choose from four operations:
  - ➕ Addition
  - ➖ Subtraction
  - ✖️ Multiplication
  - ➗ Division
---
## 🧠 What I Learned
- How to use `Scanner` for user input
- Handling input errors with `try-catch` and `InputMismatchException`
- Validating user input through loops
- Structuring a console-based Java program
- Preventing runtime errors (e.g., dividing by zero)
---
## 🔍 Example Output
```
Enter First Number : hello
Must be an integer
Enter First Number : 10
Enter Second Number : 5

Welcome to Calculator 🧮
Please choose the method in which you want to solve
[1️⃣] ➕ Addition ➕
[2️⃣] ➖ Subtraction ➖
[3️⃣] ➗ Division ➗
[4️⃣] ✖️ Multiplication ✖️

Enter Method : 3
10 / 5 = 2
```
