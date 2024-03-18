package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal{
    
    private Anfibio[] listado;
    static public int ranas;
    static public int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona,
    Anfibio[] listado,
     int ranas,
    int salamandras,
    String colorPiel,
    boolean venenoso) {

        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        
    }
    public Anfibio(){}


    public static Anfibio crearRana(String nombre, int edad, String genero){

        Anfibio rana = new Anfibio();

        rana.colorPiel = "rojo";
        rana.venenoso = true;
        rana.habitat = "selva";
        rana.nombre = nombre;
        rana.edad = edad;
        rana.genero = genero;
        rana.ranas =+ 1;
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){

            Anfibio salamandra = new Anfibio();

            salamandra.colorPiel = "negro y amarillo";
            salamandra.venenoso = false;
            salamandra.habitat = "selva";
            salamandra.nombre = nombre;
            salamandra.edad = edad;
            salamandra.genero = genero;
            salamandra.salamandras =+ 1;
    
            return salamandra;


    }

    static public int cantidadAnfibios(){

        return Anfibio.salamandras + Anfibio.ranas;
    }

    

}
