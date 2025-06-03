class calc{
    public long add (long N1 , long N2){
        return N1 + N2;
    }
    public long sub (long N1 , long N2){
        return N1 - N2;
    }
}
public class sample {
    public static void main(String[] args) {
        System.out.println("Hello From the calculator version 1.");
        calc op = new calc();
        System.out.println("addition: " + op.add(29,11)); //40
        System.out.println("Subtraction: " + op.sub(29,11)); //18
    }
}
