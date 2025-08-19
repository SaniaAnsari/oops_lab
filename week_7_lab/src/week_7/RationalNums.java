package week_7;

public class RationalNums {
    private int numerator;
    private int denominator;

    //Constructor
    public RationalNums(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Enter num except zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    //Getter for numerator
    public int getNumerator() {
        return numerator;
    }

    //Getter for denominator
    public int getDenominator() {
        return denominator;
    }

    //Setter for numerator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    //Setter for denominator
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // Simplify the fraction
    public void simplify() {
        int a = numerator;
        int b = denominator;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcdValue = a;
        numerator /= gcdValue;
        denominator /= gcdValue;
    }
    public String toString(){
        return numerator+"/"+denominator;
    }



}

