import java.util.ArrayList;
import java.util.Collections;
public class HighAndLow {
    public static String highAndLow(String numbers){
        ArrayList<Integer> l = new ArrayList<>();
        String tmp = "";
        char[] c = numbers.toCharArray();
        for (int i=0; i<c.length; i++) {
            if(!Character.isWhitespace(c[i])) tmp += c[i];
            if(i==c.length-1 || Character.isWhitespace(c[i+1])){
                l.add(Integer.parseInt(tmp));
                tmp = "";
            }
        }
        Collections.sort(l);
        return l.get(l.size()-1) + " " + l.get(0);
    }
    public static void main(String[] args) {
        System.out.println(HighAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
