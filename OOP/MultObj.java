public class MultObj {
    int salary = 400000;
    String role = "Developer";

    public static void main(String[] args) {
        MultObj salaryOne = new MultObj(); //Object one
        MultObj salaryTwo = new MultObj(); //Object Two

        System.out.println(salaryOne.salary);
        System.out.println(salaryOne.role);

        System.out.println(salaryTwo.salary);
        System.out.println(salaryTwo.role);
    }
 
}
