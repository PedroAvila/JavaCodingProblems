import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java - Coding - Problems");

        var duplicates = countDuplicateCharacters("Programming");
        System.out.println("duplicates = " + duplicates);
    }

    /*
        Map en Java es una interfaz que representa una colección de pares clave-valor.
        Cada clave se asocia con exactamente un valor. Las claves deben ser únicas, pero los valores pueden repetirse.
        Algunas implementaciones comunes de Map incluyen HashMap, TreeMap y LinkedHashMap.
    * */
    private static Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }
}