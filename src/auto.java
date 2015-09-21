import java.util.HashSet;
import java.util.Set;

/**
 * Created by apple on 15/9/17.
 */
public class auto {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<Integer>();
        set.add(1);
        set.add(1);
        System.out.println(set);
        String test="abcd";
        String a=test.substring(0,2)+test.substring(3,4);
        System.out.println(a);
    }
}
