public class Numberfun {
    public static long findNextSquare(long sq){
        if((double)(Math.sqrt(sq)) - Math.floor(Math.sqrt(sq)) != 0) return -1;           //Checks if number is not a perfect square
        long temp = (long)Math.sqrt(sq) + 1;
        return temp*temp;
    }
    public static void main(String[] args) {
        System.out.println(findNextSquare(121));     
    }
}
