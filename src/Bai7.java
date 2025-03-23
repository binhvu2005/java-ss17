import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đoạn văn bản:");
        String text = sc.nextLine();
        String[] words = text.toLowerCase().split("\\W+");
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (String word : words) {
            set.add(word);
            list.add(word);
        }
        List<String> sortedList = new ArrayList<>(set);
        sortedList.sort(String::compareTo);
        for (String word : sortedList) {
            int count = 0;
            for (String w : list) {
                if (word.equals(w)) {
                    count++;
                }
            }
            System.out.println(word + ": " + count);
        }
    }
}
