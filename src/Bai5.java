import java.util.HashSet;

public class Bai5 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        hs2.add(4);
        hs2.add(5);
        hs2.add(6);
        hs2.add(7);
        hs2.add(8);

        hs.addAll(hs2);
        for (Integer i : hs) {
            System.out.println(i);
        }


    }
}
