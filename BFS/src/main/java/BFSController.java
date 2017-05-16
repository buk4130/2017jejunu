import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by samsung on 2017-05-15.
 */
public class BFSController {

    static ArrayList<ArrayList<Integer>> ad;
    static  boolean[] visit;
    static  int Ne, Nv;

    public static void bfs(int i){
        Queue <Integer> q = new <Integer>LinkedList<Integer>();
        HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>();

        q.offer(i);

        while(!q.isEmpty()) {
            int temp = q.poll();
            visit[temp] = true;
            System.out.print(temp);

            for(int j : ad.get(temp)) {
                if(visit[j] == false && !hash.containsKey(j)){
                    q.offer(j);
                    hash.put(j, true);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Nv = scan.nextInt();
        Ne = scan.nextInt();

        ad = new <ArrayList<Integer>> ArrayList(Nv+1);
        visit = new boolean[Nv+1];
    }
}
