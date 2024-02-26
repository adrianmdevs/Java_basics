//Two methods defined independently but doing the same task
public class MethodOverload1 {
    static int additionMethodInt( int x, int y){
        return x + y;
    }
    static double additionMethodDouble(double x, double y){
        return x + y;
    }
    public static void main(String[] args) {
        int myNum1 = additionMethodInt(5, 6);
        double myNum2 = additionMethodDouble(2.4, 3.5);
        System.out.println("Int: "+myNum1);
        System.out.println("Double: "+myNum2);
    }
}
