import java.util.Arrays;
public class PangramChecker {
    public boolean check(String sentence){
        char[] tmp = sentence.toLowerCase().toCharArray();
        Arrays.sort(tmp);       
        short cont = 0;
        for (int i = 0; i < tmp.length; i++) {
            if(Character.isLetter(tmp[i]) && ((i == tmp.length-1) || (tmp[i] != tmp[i+1]))) cont++;
        }
        if(cont == 26) return true;
        else return false;
    }
    public static void main(String[] args) {
        String pangram1 = "wactosykpbufkgrnrhleqixmmufzz j dtv";
        PangramChecker pc = new PangramChecker();
        System.out.println(pc.check(pangram1));
    }
}
