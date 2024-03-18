package zooAnimales;

import gestion.Zona;

public class Ave extends Animal{
    
    private Ave[] listado;
    static public int halcones;
    static public int aguilas;
    private String colorPlumas;

    public Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona,
    Ave[] listado,
    int halcones,
    int aguilas,
    String colorPlumas) {

        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.colorPlumas = colorPlumas;
        
    }
    public Ave(){}

    public static Ave crearHalcon(String nombre, int edad, String genero){

        Ave halcon = new Ave();

        halcon.colorPlumas = "café glorioso";
        halcon.habitat = "montanas";
        halcon.nombre = nombre;
        halcon.edad = edad;
        halcon.genero = genero;
        halcon.halcones =+ 1;
        return halcon;
    }

    public static Ave crearAguila(String nombre, int edad, String genero){

            Ave aguila = new Ave();
    
            aguila.colorPlumas = "blanco y amarillo";
            aguila.habitat = "selva";
            aguila.nombre = nombre;
            aguila.edad = edad;
            aguila.genero = genero;
            aguila.aguilas =+ 1;
    
            return aguila;


    }

    static public int cantidadAves(){

        return Ave.aguilas + Ave.halcones;
    }

}
