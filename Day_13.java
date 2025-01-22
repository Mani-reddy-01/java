public class Day_13 {
    public static void printNumbers(int num){
        if(num>5){
            return;
        }
        System.out.println(num);
        printNumbers(num+1);
    }
    public static void main(String[] args) {
        int num = 1;
        printNumbers(num);
    }
}
