package work.oscarramos.ejemplos.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String,Object> persona = new HashMap<>();
        System.out.println("Contiene elementos = " + !persona.isEmpty());
        persona.put("nombre","Oscar");
        persona.put("apellido","Ramos");
        persona.put("email","oscar.ramos@oscarramos.work");
        persona.put("edad","39");
        persona.put("pagina","oscarramos.work");

        Map<String,String> direccion = new HashMap<>();

        direccion.put("Pais","Colombia");
        direccion.put("Departamento","Valle");
        direccion.put("Ciudad","Cali");
        direccion.put("Calle","Cuarta norte");
        direccion.put("Numero","31 b 33");
        persona.put("direccion",direccion);

        System.out.println("persona = " + persona);

        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);

        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        String valorApellido = (String) persona.remove("apellido");
        System.out.println("valorApellido eliminado = " + valorApellido);

        Map<String,String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("Pais");
        String ciudad = direccionPersona.get("Ciudad");
        String barrio = direccionPersona.getOrDefault("Barrio", "La playa");

        System.out.println("El pais de "+ nombre + " es " + pais);
        System.out.println("La ciudad de "+ nombre + " es " + ciudad);
        System.out.println("El barrio de "+ nombre + " es " + barrio);

        boolean eliminarEdad =  persona.remove("edad","39");
        System.out.println("Se elimino la edad = " + eliminarEdad);

        System.out.println("persona = " + persona);
        
        boolean consultaLlave = persona.containsKey("apellido");
        System.out.println("consultaLlave apellido = " + consultaLlave);

        boolean consultaValor = persona.containsValue("oscar.ramos@oscarramos.work");
        System.out.println("consultaValor oscar.ramos@oscarramos.work = " + consultaValor);

        Collection<Object> valores = persona.values();
        System.out.println("========================================");
        System.out.println("Recorremos el map con Collection valores");
        System.out.println("========================================");
        valores.forEach(System.out::println);

        Set<String> llaves = persona.keySet();
        System.out.println("====================================");
        System.out.println("Recorremos el map con set las llaves");
        System.out.println("====================================");
        llaves.forEach(System.out::println);

        System.out.println("====================================");
        System.out.println("Recorremos el map entry");
        System.out.println("====================================");
        persona.entrySet().forEach(p -> System.out.println(p.getKey() + " --> " + p.getValue()));

        System.out.println("=========================================");
        System.out.println("Recorremos el map keyset y accdemos valor");
        System.out.println("=========================================");
        for (String llave : persona.keySet()) {
            Object valor = persona.get(llave);
            if(valor instanceof Map){
                Map<String,String> direccionMap =  (Map<String, String>) valor;
                for(Map.Entry<String,String> parDir:direccionMap.entrySet()){
                    System.out.println(parDir.getKey() + " --> " + parDir.getValue());
                }
            }else{
                System.out.println(llave + " => " + valor);
            }
        }
        System.out.println("=========================================");
        System.out.println("Recorremos el map Java 8");
        System.out.println("=========================================");

        persona.forEach((llave, valor) ->{
            System.out.println(llave + " ==> " + valor);
        });
        System.out.println("=========================================");
        System.out.println("Contiene elementos = " + !persona.isEmpty());
        System.out.println("=========================================");
        System.out.println("Total de elementos : " + persona.size());

        persona.replace("nombre","Andres");
        System.out.println("persona = " + persona);

        boolean b3 = persona.replace("nombre","xavier","Gustavo");
        System.out.println("Pudo reemplazar = " + b3);

        System.out.println("persona = " + persona);

        b3 = persona.replace("nombre","Andres","Gustavo");
        System.out.println("Pudo reemplazar = " + b3);

        System.out.println("persona = " + persona);





    }
}
