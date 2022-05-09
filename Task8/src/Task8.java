import java.util.ArrayList;
import java.util.List;

public class Task8 {

    public static List<String> sortList(List<String> stringList) {
        stringList.sort(String.CASE_INSENSITIVE_ORDER);
        return stringList;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("Lime");
        stringList.add("lemon");
        stringList.add("Beetroot");
        stringList.add("banana");
        stringList.add("Apricot");
        System.out.println(stringList);
        sortList(stringList);
        System.out.println(stringList);
    }
}
