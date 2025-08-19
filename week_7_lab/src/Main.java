import week_7.Calculations;
import week_7.RationalNums;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RationalNums r1 = new RationalNums(9, 6);
        RationalNums r2 = new RationalNums(6, 9);

        System.out.println("r1:" + r1);
        System.out.println("r2:" + r2);

        Calculations calc = new Calculations();

        System.out.println("Addition = " + calc.add(r1, r2));
        System.out.println("Subtraction=" + calc.sub(r1, r2));
        System.out.println("Multiplication=" + calc.multi(r1, r2));
        System.out.println("Division=" + calc.div(r1, r2));
    }
}






