import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();

    map.put("동글이", 100);
    map.put("지구", 90);
    map.put("우유", 85);
    map.put("막내", 80);
    System.out.println("총 entry 수 : " + map.size());

    System.out.println("지구 : " + map.get("지구"));
    System.out.println();

    Set<String> keySet = map.keySet();
    Iterator<String> keyIter = keySet.iterator();

    while (keyIter.hasNext()) {
      String key = keyIter.next();
      Integer value = map.get(key);
      System.out.println(key + " : " + value);
    }

    System.out.println();

    map.remove("막내");
    System.out.println("총 entry 수 : " + map.size());

    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();

    while (entryIter.hasNext()) {
      Map.Entry<String, Integer> entry = entryIter.next();
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println(key + " : " + value);
    }

    System.out.println();

    map.clear();
    System.out.println("총 entry 수 : " + map.size());
  }
}
