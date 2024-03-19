package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal{
    private Mamifero[] listado;
    private boolean pelaje;
    private int patas;

    static public int caballos;
    static public int leones;
    private static int total = 0;//1;
    public String movimiento = "desplazarse";

    public Mamifero( String nombre, int edad, String habitat, String genero,
    
    boolean pelaje, int patas) {

        super(nombre, edad, habitat, genero);
        
        this.pelaje = pelaje;
        this.patas = patas;
        total ++;
        
    }
    public Mamifero(){

        total ++;
        
    }

    public Mamifero[] getListado() {
        return listado;
    }

    public void setListado(Mamifero[] listado) {
        this.listado = listado;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public static int getCaballos() {
        return caballos;
    }

    public static void setCaballos(int caballos) {
        Mamifero.caballos = caballos;
    }

    public static int getLeones() {
        return leones;
    }

    public static void setLeones(int leones) {
        Mamifero.leones = leones;
    }

    public static int cantidadMamiferos() {
        return Mamifero.caballos + Mamifero.leones + total;
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        Mamifero caballo = new Mamifero();
        caballo.pelaje = true;
        caballo.patas = 4;
        caballo.habitat = "pradera";
        caballo.nombre = nombre;
        caballo.edad = edad;
        caballo.genero = genero;
        caballo.caballos += 1;
        //Animal.totalAnimales ++;
        return caballo;
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        Mamifero leon = new Mamifero();
        leon.pelaje = true;
        leon.patas = 4;
        leon.habitat = "selva";
        leon.nombre = nombre;
        leon.edad = edad;
        leon.genero = genero;
        leon.leones += 1;
        //Animal.totalAnimales ++;
        return leon;
    }

    public String movimiento(){
        return movimiento;
    }
}
