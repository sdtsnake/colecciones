package work.oscarramos.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {

        String[] consolas = {"PlayStation","Xbox","Nintendo","Snes","Xbox","Nes","Atari","Nintendo","Saturno"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for(String consol: consolas){
            if(!unicos.add(consol)){
                duplicados.add(consol);
            }
        }

        unicos.removeAll(duplicados);

        System.out.println("Unicos : " + unicos);
        System.out.println("Duplicados : " + duplicados);


    }
}
