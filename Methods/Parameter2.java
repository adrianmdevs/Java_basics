public class Parameter2 {
    static void empMethod( String empName, String emprole, int salary) //Multiple parameters in one Method
    {
        System.out.println("Hello"+" "+empName+", "+"You are a"+" "+emprole+" "+"and your salary is"+" "+salary);
    }
    public static void main(String[] args) {
        empMethod("Charles", "developer", 70000);
        empMethod("Jackline", "Call-Center Agent", 45000);
        empMethod("Mike", "technical Enginner", 40000);
    }
}
