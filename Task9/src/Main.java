import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> fruits_list = new ArrayList<>();
        fruits_list.add("apple");
        fruits_list.add("lemon");
        fruits_list.add("banana");
        System.out.println(fruits_list);
        System.out.println(fruits_list.contains("apple"));
        System.out.println(fruits_list.contains("peach"));
        System.out.println(fruits_list.get(2));
        System.out.println(fruits_list.indexOf("lemon"));
        System.out.println(fruits_list.lastIndexOf("lemon"));
        System.out.println(fruits_list.set(1, "orange"));
        System.out.println(fruits_list);
        System.out.println(fruits_list.remove("peach"));
        System.out.println(fruits_list.remove("banana"));
        System.out.println(fruits_list);
        System.out.println(fruits_list.isEmpty());
        System.out.println(fruits_list.size());
        fruits_list.clear();
        System.out.println(fruits_list.isEmpty());
        System.out.println("-------------------------------------");
        Set<String> fruits_set = new HashSet<>();
        fruits_set.add("apple");
        fruits_set.add("lemon");
        fruits_set.add("banana");
        fruits_set.add("lemon");
        System.out.println(fruits_set);
        System.out.println(fruits_set.contains("apple"));
        System.out.println(fruits_set.contains("peach"));
        System.out.println(fruits_set.remove("peach"));
        System.out.println(fruits_set.remove("banana"));
        System.out.println(fruits_set);
        System.out.println(fruits_set.isEmpty());
        System.out.println(fruits_set.size());
        fruits_set.clear();
        System.out.println(fruits_set.isEmpty());
        System.out.println("-------------------------------------");
        Queue<String> fruits_queue = new ArrayDeque<>();
        fruits_queue.add("apple");
        fruits_queue.add("lemon");
        fruits_queue.add("banana");
        System.out.println(fruits_queue);
        System.out.println(fruits_queue.element());
        System.out.println(fruits_queue.offer("peach"));
        System.out.println(fruits_queue);
        System.out.println(fruits_queue.remove("banana"));
        System.out.println(fruits_queue);
        System.out.println(fruits_queue.poll());
        System.out.println(fruits_queue.peek());
        System.out.println(fruits_queue);
        System.out.println("-------------------------------------");
        Map<String, String> fruits_map = new HashMap<>();
        fruits_map.put("apple", "sweet");
        fruits_map.put("lemon", "sour");
        fruits_map.put("banana", "neutral");
        System.out.println(fruits_map);
        System.out.println(fruits_map.get("apple"));
        System.out.println(fruits_map.get("peach"));
        System.out.println(fruits_map.isEmpty());
        System.out.println(fruits_map.remove("apple"));
        System.out.println(fruits_map.remove("orange"));
        System.out.println(fruits_map);
    }
}
