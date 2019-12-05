**<h1>Arithmetic Calculator</h1>**

**Arizona State University: Fall Session B 2019**
**CSE205: Object Oriented Programming and Data Structures**

This is my final project for CSE205.

The project implements a GUI calculator which accepts a syntactically correct arithmetic expression written in infix notation and displays the evaluation of said expression.

This calculator will evaluate arithmetic expressions written in infix notation such as:

    (-1 - -2) * -(3 / 5) 
    
Infix notation is the usual algebraic notation that we are all familiar with where a binary operator (a binary operator is an operator that has two operands) is written between the left-hand and right-hand operands. For example, in the expression above, the left-hand operand of the subtraction operator is -1 and the right-hand operand is -2. Some operators, such as the negation operator, are unary operators meaning there is only one operand (uni = one). For negation, the operand is written to the right of the negation operator. Therefore, this expression contains six operators: negation, subtraction, negation, multiplication, negation, and division. 

In the algorithm that evaluates the expression, we also treat a left parenthesis as an operator, which it is not, but during the evaluation we have to push left parentheses onto the operator stack. 

In an infix arithmetic expression, each operator has a precedence level, which for a left parenthesis, is different when it is on the operator stack as opposed to when it is not.

| Operator  | Normal Precedence Level | Stack Precedence Level |
| :-------------: | :------------: | :------------: |
| ( | 5  | 0  |
| -  | 4  | 4  |
| * / | 3  | 3  |
| + -  | 2  | 2  |
| ) | 1  | 1  |

Right parentheses really don't have precedence because they are not pushed on the operator stack, but we assign them a precedence level of 1 for consistency.

