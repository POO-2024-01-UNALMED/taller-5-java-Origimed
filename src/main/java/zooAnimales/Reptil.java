package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal{
    private Reptil[] listado;
    static public int iguanas;
    static public int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona,
    Reptil[] listado,
     int iguanas,
    int serpientes,
    String colorEscamas, int largoCola) {

        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        
    }
    public Reptil(){}





    public static Reptil crearIguana(String nombre, int edad, String genero){

        Reptil iguana = new Reptil();

        iguana.colorEscamas = "verde";
        iguana.largoCola = 3;
        iguana.habitat = "humedal";
        iguana.nombre = nombre;
        iguana.edad = edad;
        iguana.genero = genero;
        iguana.iguanas =+ 1;
        return iguana;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){

            Reptil serpiente = new Reptil();
    
            serpiente.colorEscamas = "blanco";
            serpiente.largoCola = 1;
            serpiente.habitat = "jungla";
            serpiente.nombre = nombre;
            serpiente.edad = edad;
            serpiente.genero = genero;
            serpiente.serpientes =+ 1;
    
            return serpiente;


    }

    static public int cantidadReptiles(){

        return Reptil.iguanas + Reptil.serpientes;
    }
}
