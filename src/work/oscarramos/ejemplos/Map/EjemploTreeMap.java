package work.oscarramos.ejemplos.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {
        Map<String,Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());

        persona.put("nombre","Oscar");
        persona.put("apellido","Ramos");
        persona.put("email","oscar.ramos@oscarramos.work");
        persona.put("edad","39");
        persona.put("pagina","oscarramos.work");

        Map<String,String> direccion = new TreeMap<>();

        direccion.put("Pais","Colombia");
        direccion.put("Departamento","Valle");
        direccion.put("Ciudad","Cali");
        direccion.put("Calle","Cuarta norte");
        direccion.put("Numero","31 b 33");
        persona.put("direccion",direccion);

        System.out.println("persona = " + persona);


    }
}
