public class recursion {
    public static void printsum(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printsum(n-1);
        
    }
    public static void main(String[] args) {
        int n=5;
        printsum(n);
    }
}
