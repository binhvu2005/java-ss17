import java.util.HashSet;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        HashSet <String> hs = new HashSet <>();
        hs.add("Java");
        hs.add("Python");
        hs.add("C++");
        hs.add("JavaScript");


        System.out.println("nhập ngôn ngữ:");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        for (String L : hs){
            if (L.equals(n)){
                System.out.println("có ngôn ngữ "+L);
            }
        }
        if (!hs.contains(n) ){
            System.out.println("không có trong set");
        }
    }
}
