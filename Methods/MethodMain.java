public class MethodMain {
    //Create a CheckAge()Method with age as the parameter
    static void CheckAge( int age){
        //Deny access for less than 18 years
        if (age <= 18) {
            System.out.println("Access denied - You are underage!");
        } else{
            System.out.println("Access granted - You are old enough!");
        }   
    }
    public static void main(String[] args) {
        CheckAge(17);
    }
}
