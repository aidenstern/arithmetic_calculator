//**************************************************************************************************************
// CLASS: Operator
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall Session B 2019
// Project Number: 4
//
// AUTHOR: Aiden Stern, amstern3, amstern3@asu.edu
//**************************************************************************************************************

/**
 * Operator is the superclass of all binary and unary operators.
 */
public abstract class Operator extends Token {

    public Operator() { }

    /**
     * Returns type of Operator - false if Unary, true if Binary.
     */
    public abstract boolean isBinaryOperator();

    /**
     * Returns the normal precedence level of this operator.
     */
    public abstract int precedence();

    /**
     * Returns the precedence level of this operator when it is on the operator stack.
     */
    public abstract int stackPrecedence();
}
