//**************************************************************************************************************
// CLASS: NegOperator
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall Session B 2019
// Project Number: 4
//
// AUTHOR: Aiden Stern, amstern3, amstern3@asu.edu
//**************************************************************************************************************

/**
 * Represents the negation operator which is a specific type of unary operator.
 */
public class NegOperator extends UnaryOperator {

    public NegOperator() {

    }

    /**
     * Called to evaluate the operator.
     */
    @Override
    public Operand evaluate(Operand pOperand) {
        return new Operand(0 - (pOperand.getValue()));
    }

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    public int precedence() {
        return 4;
    }

    /**
     * Returns the precedence level of this operator when it is on the operator stack.
     */
    public int stackPrecedence() {
        return 4;
    }
}