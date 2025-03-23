import java.util.HashSet;

public class Bai3 {
    public static void main(String[] args) {
        HashSet <Integer> num = new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(10);

        num.removeIf(num1 -> num1%2 ==0);
        for (Integer i : num) {
            System.out.println(i);
        }
    }
}
