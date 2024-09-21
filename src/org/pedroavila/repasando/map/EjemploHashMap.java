package org.pedroavila.repasando.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {

    public static void main(String[] args) {

        /*
            Map en Java es una interfaz que representa una colección de pares clave-valor.
            Cada clave se asocia con exactamente un valor. Las claves deben ser únicas, pero los valores pueden repetirse.
            Algunas implementaciones comunes de Map incluyen HashMap, TreeMap y LinkedHashMap.
        */

        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("email", "john.doe@gmail.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);
    }
}
