public class MethodScope {
    public static void main(String[] args) {
        
        //Code here cannot use X
        //System.out.println(x); >>Yields an error

        int x = 100;

        //Code here can use X
        System.out.println(x);
    }
}
