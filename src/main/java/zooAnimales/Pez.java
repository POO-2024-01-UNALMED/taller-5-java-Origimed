package zooAnimales;

import gestion.Zona;

public class Pez extends Animal{
    private Pez[] listado;
    static public int salmones;
    static public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona,
    Pez[] listado,
    int salmones,
    int bacalaos,
    String colorEscamas, int cantidadAletas) {

        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        
    }
    public Pez(){}

    public static Pez crearSalmon(String nombre, int edad, String genero){

        Pez Salmones = new Pez();

        Salmones.colorEscamas = "rojo";
        Salmones.cantidadAletas = 6;
        Salmones.habitat = "oceano";
        Salmones.nombre = nombre;
        Salmones.edad = edad;
        Salmones.genero = genero;
        Salmones.salmones =+ 1;
        return Salmones;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero){

            Pez bacalao = new Pez();
    
            bacalao.colorEscamas = "gris";
            bacalao.cantidadAletas = 6;
            bacalao.habitat = "oceano";
            bacalao.nombre = nombre;
            bacalao.edad = edad;
            bacalao.genero = genero;
            bacalao.bacalaos =+ 1;
    
            return bacalao;


    }

    static public int cantidadPeces(){

        return Pez.bacalaos + Pez.salmones;
    }
}
