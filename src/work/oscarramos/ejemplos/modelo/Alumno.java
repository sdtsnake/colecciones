package work.oscarramos.ejemplos.modelo;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Integer nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + ", nota : " + nota;
    }

    @Override
    public int compareTo(Alumno a) {
        /*
        Este es el codigo en caso de el tipo de dato fuese int primitivo

        if(this.nota> a.nota){
            return 0;
        }else if(this.nota>a.nota){
            return 1;
        }else{
            return -1;
        }

         */

        if (a == null) {
            return 0;
        }
        /*
        en los comparables no se pude tener si no un solo atributo de comparacion
         */
        //return this.nombre.compareTo(a.nombre);
        return this.nota.compareTo(a.nota);
    }
}
