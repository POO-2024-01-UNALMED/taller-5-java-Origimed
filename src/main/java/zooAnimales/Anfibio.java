package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal{
    
    private Anfibio[] listado;
    private String colorPiel;
    private boolean venenoso;
    private static int total = 0; //1;

    static public int ranas ;
    static public int salamandras;

    public String movimiento = "saltar";

    public Anfibio( String nombre, int edad, String habitat, String genero,
    
    String colorPiel,
    boolean venenoso) {

        super(nombre, edad, habitat, genero);
        
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        total ++;

        
    }
    public Anfibio(){

        total ++;
        
    }

    public Anfibio[] getListado() {
        return listado;
    }

    public void setListado(Anfibio[] listado) {
        this.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public static int getRanas() {
        return ranas;
    }

    public static void setRanas(int ranas) {
        Anfibio.ranas = ranas;
    }

    public static int getSalamandras() {
        return salamandras;
    }

    public static void setSalamandras(int salamandras) {
        Anfibio.salamandras = salamandras;
    }

    public static int cantidadAnfibios() {
        return Anfibio.salamandras + Anfibio.ranas + total;
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        Anfibio rana = new Anfibio();
        rana.colorPiel = "rojo";
        rana.venenoso = true;
        rana.habitat = "selva";
        rana.nombre = nombre;
        rana.edad = edad;
        rana.genero = genero;
        rana.ranas ++;
        //Animal.totalAnimales ++;
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        Anfibio salamandra = new Anfibio();
        salamandra.colorPiel = "negro y amarillo";
        salamandra.venenoso = false;
        salamandra.habitat = "selva";
        salamandra.nombre = nombre;
        salamandra.edad = edad;
        salamandra.genero = genero;
        salamandra.salamandras ++;
        //Animal.totalAnimales ++;
        return salamandra;
        
    }

    public String movimiento(){
        return movimiento;
    }
}
