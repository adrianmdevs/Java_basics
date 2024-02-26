public class IfElse {
    public static void main(String[] args) {
        int setTimeout = 45;
        if(setTimeout > 55){
            System.out.println("The session duration is too long");
        } else if(setTimeout <55&&setTimeout>40){
            System.out.println("The Session Timeout is good");
        } else{
            System.out.println("Please Calibrate the System again");
        }
    }
}
