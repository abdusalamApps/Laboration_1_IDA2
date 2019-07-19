import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Hassan", 39);
        map.put("Sawsan", 3);
        map.put("Safia", 55);
        map.put("Khadija", 11);

        System.out.println(map.containsKey("Oma"));
    }
}
