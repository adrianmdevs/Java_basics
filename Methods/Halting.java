public class Halting {
    public static void main(String[] args) {
        int result = sumOfVal(10,2000);
        System.out.println(result);
    }
    public static int sumOfVal(int start, int end){
        if(end > start){
            return end +sumOfVal(start, end - 1);
        } else{
            return end;
        }
    }
}
