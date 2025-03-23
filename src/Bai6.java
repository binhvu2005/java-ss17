import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Bai6 {
    public static void main(String[] args) {
        HashSet<Integer> num1 = new HashSet<>();
        HashSet<Integer> num2 = new HashSet<>();

        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);

        num2.add(30);
        num2.add(40);
        num2.add(50);
        num2.add(60);

        num1.retainAll(num2);
        List <Integer> list = new ArrayList<>();
        list.addAll(num1);
        list.sort((o1, o2) -> o1 - o2	);
        System.out.println(list);
    }
}
