public class ReturnVal1 {
    static int  myMethod(int x){ //Refrain from the "void " keyword when you want the method to return a value
        return 3 + x;
    }
    public static void main(String[] args) {
        System.out.println(myMethod(5));
    }
}
