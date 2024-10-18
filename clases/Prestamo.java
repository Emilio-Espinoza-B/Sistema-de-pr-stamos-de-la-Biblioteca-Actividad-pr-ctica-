package clases;
import java.util.ArrayList;

public class Prestamo {
    //atributos
    private String nombre;
    private ArrayList<Libro>libros;
    private boolean estatus;

    //constructores
    public Prestamo(){
        this.nombre = "invitado";
        this.estatus = true;
        this.libros = new ArrayList<Libro>();
    }
    public Prestamo(String nombre, boolean estatus){
        this.nombre = nombre;
        this.estatus = estatus;
        this.libros = new ArrayList<Libro>();
    }
    //getters
    public ArrayList<Libro> getLibros() {
        return libros;
    }
    public String getNombre() {
        return nombre;
    }
    public boolean getestatus(){
        return estatus;
    }
    //setters
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    //metodos
    public void agregarlibro(Libro gato){
        libros.add(gato);
    }
    //estatus
    public String retornarestatus(){
        if (estatus) {
            return ("El prestamo esta activo");
        }else{
            return ("El prestamo esta inactivo");
        }
    }
    //detalles
    public String mostrardetalles(){
        return "Nombre de la persona: " + getNombre() + ", Estatus: " + getestatus() + ", Libros: " + getLibros();
    }
    //total
    public double calculartotal(){
        double total = 0;
        for(int i = 0; i < libros.size(); i++){
            total += libros.get(i).getPrecioderemplazo();
        }
        return total;
    }
}
