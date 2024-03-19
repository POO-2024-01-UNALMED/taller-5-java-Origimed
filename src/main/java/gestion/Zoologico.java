package gestion;

import java.util.ArrayList;

import zooAnimales.Anfibio;
import zooAnimales.Animal;
import zooAnimales.Ave;
import zooAnimales.Mamifero;
import zooAnimales.Pez;
import zooAnimales.Reptil;

public class Zoologico {

    public static int total;
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new ArrayList<>();
        
    }

    public Zoologico() {
        
        this.zonas = new ArrayList<>();  
        
    }

    public int cantidadTotalAnimales() {
        return total ;
    }

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }

    public void setZona(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Zoologico.total = total;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
