package gestion;

import java.time.Period;
import java.util.ArrayList;

import zooAnimales.Anfibio;
import zooAnimales.Ave;
import zooAnimales.Mamifero;
import zooAnimales.Pez;
import zooAnimales.Reptil;

public class Zoologico{

    private static int total;
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = zonas;


    }
    public Zoologico(){}

    public int cantidadTotalAnimales(){

        // devolver la cantidad total de animales
        return Anfibio.cantidadAnfibios() + Ave.cantidadAves() + Mamifero.cantidadMamiferos() + Pez.cantidadPeces() + Reptil.cantidadReptiles();
    }

    public void agregarZonas(Zona zona){
        zonas.add(zona);
    }

    public ArrayList<Zona>   getZona(){

        return zonas;
    }

}