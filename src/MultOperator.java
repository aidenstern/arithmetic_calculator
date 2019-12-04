//**************************************************************************************************************
// CLASS: MultOperator
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall Session B 2019
// Project Number: 4
//
// AUTHOR: Aiden Stern, amstern3, amstern3@asu.edu
//**************************************************************************************************************

/**
 * Represents the multiplication operator which is a specific type of binary operator.
 */
public class MultOperator extends BinaryOperator {

    public MultOperator() {

    }

    /**
     * Returns the multiplication of the left-hand side operand and the right-hand side operand.
     */
    @Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
        return new Operand(pLhsOperand.getValue() * pRhsOperand.getValue());
    }

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    public int precedence() {
        return 3;
    }

    /**
     * Returns the precedence level of this operator when on it is on the operator stack.
     */
    @Override
    public int stackPrecedence() {
        return 3;
    }
}