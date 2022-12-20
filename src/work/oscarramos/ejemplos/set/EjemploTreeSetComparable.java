package work.oscarramos.ejemplos.set;

import work.oscarramos.ejemplos.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        Set<Alumno> sa = new TreeSet<>((a, b)-> b.getNota().compareTo(a.getNota())) ;

        sa.add(new Alumno("Oscar", 9));
        sa.add(new Alumno("Paola", 8));
        sa.add(new Alumno("Sebastian", 10));
        sa.add(new Alumno("Juan", 6));
        sa.add(new Alumno("Mauricio", 7));
        sa.add(new Alumno("Lucero", 5));
        sa.add(new Alumno("Roberto", 2));
        sa.add(new Alumno("Carlos", 1));

        System.out.println(sa);


    }
}
