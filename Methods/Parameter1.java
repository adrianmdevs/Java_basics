public class Parameter1 {
    static void myMethod(String employeeRole) //employee Role passed as a single parameter
    {
        System.out.println( employeeRole +" "+"devs");
    }
    public static void main(String[] args) {
        myMethod("Ken");
        myMethod("Paul");
        myMethod("Athanus");
    }
}
