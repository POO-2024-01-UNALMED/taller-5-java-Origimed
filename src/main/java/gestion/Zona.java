package gestion;
import zooAnimales.*;

import java.util.ArrayList;;

public class Zona {
    private String nombre;
    private Zoologico[] zoo;
    private ArrayList<Animal> animales;
    
    public Zona(String nombre, Zoologico zoo[], ArrayList<Animal>  animales){

        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;

    }
    public Zona(){}


    public void agregarAnimales(Animal animal){
        animales.add(animal);
    }

        public int cantidadAnimales(){
            // Retornar la cantidad total de animales de las zona

            return Anfibio.cantidadAnfibios() + Ave.cantidadAves() + Mamifero.cantidadMamiferos() + Pez.cantidadPeces() + Reptil.cantidadReptiles();
        }

    public static void main(String args[]){

        System.out.println("ASAsa");
    }


}
