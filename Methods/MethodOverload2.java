//Method Overloading >> Same Method name, Different Method parameters.
public class MethodOverload2 {
    static int additionMethod(int x, int y){
        return x + y;
    }
    static double additionMethod(double x, double y){
        return x + y;
    }
    public static void main(String[] args) {
        int sumInt = additionMethod(15, 20);
        double sumDouble = additionMethod(6.89, 7.64);
        System.out.println("Sum of Integers: "+sumInt);
        System.out.println("Sum of Double: "+sumDouble);
    }
}
