public class Maskify {
    public static String maskify(String str)
    {
        String str2 = "";
      
        if(str.length() <= 4)
        {
            return str;
        }
        else
        { 
            for(int i=0; i<str.length(); i++){ 
                if(i>str.length()-5)
                {
                    str2 = str2 + str.charAt(i);
                }
                else
                {
                    str2 = str2 + "#";
                }
            }
            return str2;       
        }
    }
    public static void main(String[] args) {
        System.out.println(maskify("234276237462897"));
    } 
}
