package work.oscarramos.ejemplos.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        String[] consolas = {"PlayStation","Xbox","Nintendo","Snes","Xbox","Nes","Atari","Nintendo","Saturno"};

        Set<String> unicos = new HashSet<>();
        for(String consol: consolas){
            if(!unicos.add(consol)){
                System.out.println("Elemento duplicado : " + consol);

            }
        }

        System.out.printf(unicos.size() + " elementos no duplicados : " + unicos);

    }
}
