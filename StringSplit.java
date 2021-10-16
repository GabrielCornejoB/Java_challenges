import java.util.ArrayList;
public class StringSplit {
    public static String[] solution(String s){
        ArrayList<String> al = new ArrayList<>();
        String aux = "";
        for (int i = 0; i < s.length(); i++) {  
            aux += s.charAt(i);
            if(i==s.length()-1 && aux.length()==1){
                aux += "_";
                al.add(aux);
            }      
            else if(i%2!=0){
                al.add(aux);
                aux = "";
            }
        }
        return al.toArray(new String[al.size()]);
    }
    public static void main(String[] args) {
        for (String s : StringSplit.solution("LovePizza")) {
            System.out.println(s);
        }  
    }
}
