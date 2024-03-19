package zooAnimales;

import gestion.Zona;

public class Pez extends Animal{
    private Pez[] listado;
    private String colorEscamas;
    private int cantidadAletas;

    static public int salmones;
    static public int bacalaos;
    private static int total = 0;//1;
    public String movimiento = "nadar";

    public Pez( String nombre, int edad, String habitat, String genero, 
    
    String colorEscamas, int cantidadAletas) {

        super(nombre, edad, habitat, genero);
        
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        total ++;
    }

    public Pez(){

        total ++;
        
    }

    public Pez[] getListado() {
        return listado;
    }

    public void setListado(Pez[] listado) {
        this.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public static int getSalmones() {
        return salmones;
    }

    public static void setSalmones(int salmones) {
        Pez.salmones = salmones;
    }

    public static int getBacalaos() {
        return bacalaos;
    }

    public static void setBacalaos(int bacalaos) {
        Pez.bacalaos = bacalaos;
    }

    static public int cantidadPeces() {
        return Pez.bacalaos + Pez.salmones + total;
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        Pez salmon = new Pez();
        salmon.colorEscamas = "rojo";
        salmon.cantidadAletas = 6;
        salmon.habitat = "oceano";
        salmon.nombre = nombre;
        salmon.edad = edad;
        salmon.genero = genero;
        salmon.salmones += 1;
        //Animal.totalAnimales ++;
        return salmon;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        Pez bacalao = new Pez();
        bacalao.colorEscamas = "gris";
        bacalao.cantidadAletas = 6;
        bacalao.habitat = "oceano";
        bacalao.nombre = nombre;
        bacalao.edad = edad;
        bacalao.genero = genero;
        bacalao.bacalaos += 1;
        //Animal.totalAnimales ++;
        return bacalao;
    }

    public String movimiento(){
        return movimiento;
    }
}
