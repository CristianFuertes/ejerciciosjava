package libreria;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Libros L1 = new Libros("ciencia", 25);
        System.out.println(L1.MostrarDatos());
        Libros L2 = new Libros("arte", 15);
        System.out.println(L2.MostrarDatos());
        Libros L3 = new Libros("novelas", 5);
        System.out.println(L3.MostrarDatos());
        Libros L4 = new Libros("reflexion", 35);
        System.out.println(L4.MostrarDatos());
        Libros L5 = new Libros("deporte", 35);
        System.out.println(L5.MostrarDatos());


    }
}
