//**************************************************************************************************************
// CLASS: Operator
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// http://www.devlang.com
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
