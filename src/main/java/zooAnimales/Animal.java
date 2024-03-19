package zooAnimales;

import gestion.Zona;

public class Animal {

    public static int totalAnimales = 0;
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    protected Zona[] zona;
    public String movimiento = "desplazarse";

    public Animal(
                  String nombre,
                  int edad,
                  String habitat,
                  String genero){

        Animal.totalAnimales += 1;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;

    }

    public Animal(){}

    public static String totalPorTipo() {
        return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
               "Aves: " + Ave.cantidadAves() + "\n" +
               "Reptiles: " + Reptil.cantidadReptiles() + "\n" +
               "Peces: " + Pez.cantidadPeces() + "\n" +
               "Anfibios: " + Anfibio.cantidadAnfibios();
    }

    String  comp = "Mamiferos: 4\n" + 
				"Aves: 4\n" + 
				"Reptiles: 2\n" + 
				"Peces: 2\n" + 
				"Anfibios: 3";

    public String toString(){

        return "Mi nombre es " + this.getNombre() +  ", tengo una edad de "+ this.getEdad() + ", habito en " + this.getHabitat()+ " y mi genero es " + this.getGenero() ;
    }

    public String movimiento(){
        return movimiento;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona[] getZona() {
        return zona;
    }

    public void setZona(Zona[] zona) {
        this.zona = zona;
    }
}
