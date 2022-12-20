package work.oscarramos.ejemplos.set;

import work.oscarramos.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();

        System.out.println(al + ", size = " + al.size());
        System.out.println("esta vacia = " + al.size());

        al.add(new Alumno("Oscar", 9));
        al.add(new Alumno("Paola", 8));
        al.add(new Alumno("Sebastian", 10));
        al.add(2, new Alumno("Juan", 6));
        al.set(3,new Alumno("Mauricio", 7));
        al.add(new Alumno("Lucero", 5));
        al.add(new Alumno("Roberto", 2));
        al.add(new Alumno("Carlos", 1));
        al.add(new Alumno("Roberto", 4));
        al.add(new Alumno("Sebastian", 10));


        System.out.println(al + ", size = " + al.size());

        al.remove(new Alumno("Oscar", 9));
        al.remove(0);

        System.out.println(al + ", size = " + al.size());

        boolean b = al.contains(new Alumno("Juan", 6));

        System.out.println("La lista contiene a Juan = " + b);

        Object a[] = al.toArray();

        for (int i = 0; i < a.length; i++) {
            System.out.println("Desde el arreglo = " + a[i]);
        }
    }
}
