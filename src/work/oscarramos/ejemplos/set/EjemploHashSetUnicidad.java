package work.oscarramos.ejemplos.set;

import work.oscarramos.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        /*
            Esto aplica tanto para HashSet como para TreeSet
            La diferencia con las lista radica en estas estan
            en orden de ingresos de los datos mientras que el
            TreeSet ordena por defecto al igual HashSet
         */
        //Set<Alumno> sa = new HashSet<>();
        //Set<Alumno> sa = new TreeSet<>();

        //List<Alumno> sa = new ArrayList<>();
        List<Alumno> sa = new LinkedList<>();


        sa.add(new Alumno("Oscar", 9));
        sa.add(new Alumno("Paola", 8));
        sa.add(new Alumno("Sebastian", 10));
        sa.add(new Alumno("Juan", 6));
        sa.add(new Alumno("Mauricio", 7));
        sa.add(new Alumno("Lucero", 5));
        sa.add(new Alumno("Roberto", 2));
        sa.add(new Alumno("Carlos", 1));
        sa.add(new Alumno("Roberto", 4));
        sa.add(new Alumno("Sebastian", 10));

        System.out.println("======================================");
        System.out.println("impresion de objeto");
        System.out.println("======================================");
        System.out.println(sa);

        System.out.println("======================================");
        System.out.println("Iterando usando un foreach");
        System.out.println("======================================");

        for (Alumno a: sa){
            System.out.println(a);
        }

        System.out.println("======================================");
        System.out.println("Iterando usando un while y el iterator");
        System.out.println("======================================");

        Iterator<Alumno> it = sa.iterator();

        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a);
        }
        System.out.println("======================================");
        System.out.println("Iterando usando Stream forEach");
        System.out.println("======================================");

        sa.forEach(System.out::println);

        System.out.println("===========================================");
        System.out.println("Usando un for normal solo sirve para listas");
        System.out.println("===========================================");

        for (int i=0; i < sa.size(); i++) {
            Alumno a = sa.get(i);
            System.out.println(a);
        }
    }
}
