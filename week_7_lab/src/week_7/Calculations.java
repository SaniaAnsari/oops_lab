package week_7;

public class Calculations {
    public RationalNums add(RationalNums r1, RationalNums r2 ){
    int newNum = r1.getNumerator() * r2.getDenominator() + r2.getNumerator() * r1.getDenominator();
    int newDen = r1.getDenominator() * r2.getDenominator();
    return new RationalNums(newNum, newDen);
}
    //Function of subtraction
    public RationalNums sub(RationalNums r1, RationalNums r2){
        int newNum = r1.getNumerator() * r2.getDenominator() - r2.getNumerator() * r1.getDenominator();
        int newDen = r1.getDenominator() * r2.getDenominator();
        return new RationalNums(newNum, newDen);
    }
    //Function of multiplication
    public RationalNums multi(RationalNums r1, RationalNums r2){
        int newNum = r1.getNumerator() * r2.getNumerator();
        int newDen = r1.getDenominator() * r2.getDenominator();
        return new RationalNums(newNum, newDen);
    }
    //Function for division
    public RationalNums div(RationalNums r1, RationalNums r2){
        int newNum = r1.getNumerator() * r2.getDenominator();
        int newDen = r1.getDenominator() * r2.getNumerator();
        return new RationalNums(newNum, newDen);
    }
}
