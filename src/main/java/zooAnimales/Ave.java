package zooAnimales;

import gestion.Zona;

public class Ave extends Animal{
    
    private Ave[] listado;
    private String colorPlumas;

    static public int halcones;
    static public int aguilas;
    private static int total = 0;//2;
    public String movimiento = "volar";

    public Ave( String nombre, int edad, String habitat, String genero,
    
    String colorPlumas) {

        super(nombre, edad, habitat, genero);
        
        this.colorPlumas = colorPlumas;
        
        total ++;
    }
    public Ave(){

        total ++;
        
    }

    public Ave[] getListado() {
        return listado;
    }

    public void setListado(Ave[] listado) {
        this.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public static int getHalcones() {
        return halcones;
    }

    public static void setHalcones(int halcones) {
        Ave.halcones = halcones;
    }

    public static int getAguilas() {
        return aguilas;
    }

    public static void setAguilas(int aguilas) {
        Ave.aguilas = aguilas;
    }

    public static int cantidadAves() {
        return Ave.aguilas + Ave.halcones + total;
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        Ave halcon = new Ave();
        halcon.colorPlumas = "café glorioso";
        halcon.habitat = "montanas";
        halcon.nombre = nombre;
        halcon.edad = edad;
        halcon.genero = genero;
        halcon.halcones += 1;
        //Animal.totalAnimales ++;
        return halcon;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        Ave aguila = new Ave();
        aguila.colorPlumas = "blanco y amarillo";
        aguila.habitat = "selva";
        aguila.nombre = nombre;
        aguila.edad = edad;
        aguila.genero = genero;
        aguila.aguilas += 1;
        //Animal.totalAnimales ++;
        return aguila;
        
    }

    public String movimiento(){
        return movimiento;
    }
}
