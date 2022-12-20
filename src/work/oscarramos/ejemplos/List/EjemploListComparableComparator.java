package work.oscarramos.ejemplos.List;

import work.oscarramos.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();

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

        /*
            El ide dice que es mas optimo usar sort de la lista
            en vez de usar el de la clase Collections
         */
        //Collections.sort(sa,(a,b)->b.getNombre().compareTo(a.getNombre()));
        //sa.sort((a,b)->a.getNombre().compareTo(b.getNombre()));
        sa.sort(Comparator.comparing(Alumno::getNombre).reversed());

        System.out.println("======================================");
        System.out.println("Iterando usando Stream forEach");
        System.out.println("======================================");

        sa.forEach(System.out::println);

    }
}
