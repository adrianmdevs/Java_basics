public class Vote {
    public static void main(String[] args) {
        int promptAge = 18;
        int votingAge = 18;
        if (promptAge >= votingAge) {
            System.out.println("You are Eligible to Vote");
        } else{
            System.out.println("Not old enough to Vote");
        }

    }
}
