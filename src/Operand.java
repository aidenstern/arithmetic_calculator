//**************************************************************************************************************
// CLASS: Operand
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall Session B 2019
// Project Number: 4
//
// AUTHOR: Aiden Stern, amstern3, amstern3@asu.edu
//**************************************************************************************************************

/**
 * An operand is a numeric value represented as a Double.
 */
public class Operand extends Token {
    private Double mValue;

    public Operand(double pValue) {
        mValue = pValue;
    }

    public Double getValue() {
        return mValue;
    }

    public void setValue(double pValue) {
        mValue = pValue;
    }
}
