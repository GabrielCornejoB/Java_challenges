import java.util.Arrays;
import java.util.Hashtable;
import java.util.Enumeration;

public class FindOdd {
    public static int findIt(int[] a)
    {
        int count = 1;
        Hashtable<Integer, Integer> dic = new Hashtable<Integer, Integer>();
        Arrays.sort(a);
        for(int i=0; i<a.length; i++)
        {
            for(int j = i+1; j<a.length; j++)
            {
                if(a[i] == a[j]) count++;    
            }           
            dic.put(count, a[i]);
            i += count-1;
            count = 1;
        }
        Enumeration<Integer> e = dic.keys();
        int odd = 0;
        while(e.hasMoreElements())
        {
            int key = e.nextElement();
            if(key%2 != 0)
            {
                odd = dic.get(key);
                break;
            }
        }      
        return odd;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{2,2,3,3,3,2,2,5,7,5,3}));
        
        //findIt(new int[]{2,2,3,3,3,2,2,5,7,5,3});
    }
}
