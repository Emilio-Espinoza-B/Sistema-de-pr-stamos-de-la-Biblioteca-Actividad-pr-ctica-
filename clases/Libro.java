package clases;

public class Libro {
    //atributos
    private String titulo;
    private String autor;
    private double precioderemplazo;

    //contructor
    public Libro(String titulo, String autor, double precioderemplazo){
        this.titulo = titulo;
        this.autor = autor;
        this.precioderemplazo = precioderemplazo;
    }

    //getters
    public String getAutor() {
        return autor;
    }
    public double getPrecioderemplazo() {
        return precioderemplazo;
    }
    public String getTitulo() {
        return titulo;
    }
    //setters
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setPrecioderemplazo(double precioderemplazo) {
        this.precioderemplazo = precioderemplazo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + ", autor: " + getAutor() + ", precio: " + getPrecioderemplazo();
    }
}
