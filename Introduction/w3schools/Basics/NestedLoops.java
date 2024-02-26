public class NestedLoops {
    public static void main(String[] args) {
        int i;
        int j;
        for(i=0; i<=4; i++){
            System.out.println("Outer:" + i);
            for( j=0; j<=6; j++){
                System.out.println( "inner: " + j);
            }
        }
    }
}
