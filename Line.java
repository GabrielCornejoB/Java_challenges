import java.util.Collections;
import java.util.PriorityQueue;
import java.util.ArrayList;
public class Line {
    public static String Tickets(int[] peopleInLine){   
        String s = "";
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : peopleInLine) {
            s = "";
            pq.add(i);
            int change = i-25;
            int cash = 0;
            if(change != 0){
                if(pq.contains(change)){
                    pq.remove(change);
                    s = "YES";
                }
                else if(change==75 && (pq.contains(50) && pq.contains(25))){        
                    pq.remove(50);
                    pq.remove(25);
                    s = "YES";        
                }
                else{                    
                    ArrayList<Integer> al = new ArrayList<>(pq);
                    Collections.sort(al);
                    int size = al.size();
                    for (int j = 0; j < size; j++) {
                        cash += al.remove(0);
                        if((change == 50 && cash == 50) || (change == 75 && cash == 75)){
                            s = "YES";
                            pq = new PriorityQueue<>();
                            pq.addAll(al);
                            break;
                        }
                    }
                    if(s.isEmpty()) break;
                }
            }else if(change == 0) s = "YES"; 
        }
        if(s.isEmpty()) s = "NO";
        return s;
    }
    public static void main(String[] args) {
        System.out.println(Line.Tickets(new int[] {25, 50, 25, 50, 100, 25, 25, 50}));
        
    }
}
