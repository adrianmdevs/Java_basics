//Storing a return value in a variable
public class SumThree {
    static int sumVals(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        int z = sumVals(10, 20, 30);
        System.out.println("The sum of the three numbers is"+": "+z);
    }
}
