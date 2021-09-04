package libreria;

public class Libros{
    /*Construir un programa Java que permita registrar los libros que
    ingresan a una librería teniendo en cuenta que sus estantes solo tienen
    capacidad para 100 libros*/
   
    private String genero;
    private int num;

    private static int capacidad = 100;


    public Libros (String genero, int num){
        this.genero = genero;
        this.num = num;

        capacidad -= this.num;

        
    }
    public String MostrarDatos(){

        return "Genero: "+this.genero+"\nCantidad de libros ha ingresar: "+this.num+"\nCapacidad de los estantes hasta el momento: "+capacidad;
    }


}