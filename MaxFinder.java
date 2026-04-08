public class MaxFinder{
    public static int max(int a, int b, int c){
        return Math.max(a, Math.max(b,c));
    }
    public static void main(String[] args) {
        System.out.println("Biggest of 10, 20, 5: " + max(10,20,5));
    }
}