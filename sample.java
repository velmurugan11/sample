class calc{
    public long add (long N1 , long N2){
        return N1 + N2;
    }
    public long sub (long N1 , long N2){
        return N1 - N2;
    }
}
// Advanced Calculator: AdvCalc extends Calc
class AdvCalc extends calc {
    public long mul(long N1,long N2) {
        return N1 * N2;
    }
    public long div(long N1,long N2) {
        if (N2 == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return N1 / N2;
    }
}
public class sample {
    public static void main(String[] args) {
        // System.out.println("Hello From the calculator version 1.");
        // calc op = new calc();
        System.out.println("Hello From the calculator version 2.");
        AdvCalc op = new AdvCalc();
        System.out.println("Multiplication: " + op.mul(29,11));
        System.out.println("Division: " + op.div(29,11));
        System.out.println("addition: " + op.add(29,11)); //40
        System.out.println("Subtraction: " + op.sub(29,11)); //18
    }
}