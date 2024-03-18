package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal{
    private Mamifero[] listado;
    static public int caballos;
    static public int leones;
    private boolean pelaje;
    private int patas;
    

    public Mamifero(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona,
    Mamifero[] listado,
     int caballos,
    int leones,
    boolean pelaje, int patas) {

        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.pelaje = pelaje;
        this.patas = patas;
        
    }
    public Mamifero(){}

    public static Mamifero crearCaballo(String nombre, int edad, String genero){

        Mamifero caballo = new Mamifero();

        caballo.pelaje = true;
        caballo.patas = 4;
        caballo.habitat = "pradera";
        caballo.nombre = nombre;
        caballo.edad = edad;
        caballo.genero = genero;
        caballo.caballos =+ 1;
        return caballo;
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero){

            Mamifero leon = new Mamifero();
    
            leon.pelaje = true;
            leon.patas = 4;
            leon.habitat = "selva";
            leon.nombre = nombre;
            leon.edad = edad;
            leon.genero = genero;
            leon.leones =+ 1;
    
            return leon;


    }

    static public int cantidadMamiferos(){

        return Mamifero.caballos + Mamifero.leones;
    }

}
