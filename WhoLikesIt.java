public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        if(names.length == 0) return "no one likes this";
        else if(names.length == 1) return names[0] + " likes this";
        else{
            String s = names[0];
            for (int i = 1; i < names.length; i++) {
                if(i==2 && names.length>3){
                    s += " and " + (names.length-i) + " others like this";
                    break;
                }       
                if(i == names.length-1 && names.length<=3) s += " and " + names[i] + " like this";
                else s += ", " + names[i];
            }   
            return s;    
        }
    }
    public static void main(String[] args) {
        System.out.println(WhoLikesIt.whoLikesIt(new String[]{"Miguel", "Sebastian", "Gabriel", "Juan", "Sebastian"}));
    }
}
