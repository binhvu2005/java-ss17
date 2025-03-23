
import java.util.TreeSet;

public class Bai4 {
    public static void main(String[] args) {
       TreeSet<Integer> hs = new TreeSet<>();
       hs.add(45);
       hs.add(12);
       hs.add(78);
       hs.add(34);
       hs.add(23);
       hs.add(89);

       for (Integer i : hs) {
           System.out.println(i);
       }
    }
}
