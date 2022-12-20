package work.oscarramos.ejemplos.set;

import work.oscarramos.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();

        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("esta vacia = " + enlazada.size());

        enlazada.add(new Alumno("Oscar", 9));
        enlazada.add(new Alumno("Paola", 8));
        enlazada.add(new Alumno("Sebastian", 10));
        enlazada.add(new Alumno("Juan", 6));
        enlazada.add(new Alumno("Mauricio", 7));
        enlazada.add(new Alumno("Roberto", 2));
        enlazada.add(new Alumno("Carlos", 1));
        enlazada.add(new Alumno("Roberto", 4));

        System.out.println(enlazada + ", size = " + enlazada.size());

        //Se añade al inicio de la lista
        enlazada.addFirst(new Alumno("David",3));
        //Se añade al final de lista
        enlazada.addLast(new Alumno("Lucero",4));

        System.out.println(enlazada + ", size = " + enlazada.size());

        /*
            Con este se consulta el primer registro de la lista se usa peek porque este
            controla si la lista esta vacia con el metodo getFirst se tiene que controlar
            cuando la lista esta vacia porque arroja null pointer exception.
        */
        System.out.println("Primero = " + enlazada.peekFirst());
        System.out.println("Ultimo = " + enlazada.peekLast());

        // Se optierne el indice especifico
        System.out.println("Indice  5 = " + enlazada.get(5));

        /*
            Se elimina el ultimo con el pollLast para controlar si la lista esta vacia
            el removeLast se elimina el ultimo pero si la lista esta vacia saca null pointer exception
         */

        enlazada.pollLast();
        System.out.println(enlazada + ", size = " + enlazada.size());

        //Se elimina el primero.
        enlazada.pop();
        System.out.println(enlazada + ", size = " + enlazada.size());

        //Se elimina un objeto especifico.
        enlazada.remove(new Alumno("Carlos",1));
        System.out.println(enlazada + ", size = " + enlazada.size());

        //Se añade un alumno
        Alumno a = new Alumno("Hector",9);

        enlazada.addLast(a);
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("Indice de Oscar = " + enlazada.indexOf(a));

        enlazada.remove(6);
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.set(5, new Alumno("Gonzalo",10));
        System.out.println(enlazada + ", size = " + enlazada.size());

        ListIterator<Alumno> li = enlazada.listIterator();
        System.out.println("========================================");
        System.out.println("Desde el incio");
        System.out.println("========================================");

        while (li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println("========================================");
        System.out.println("Desde el final");
        System.out.println("========================================");

        while (li.hasPrevious()){
            System.out.println(li.previous());
        }







    }
}
