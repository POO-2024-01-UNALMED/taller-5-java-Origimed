package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public class Reptil extends Animal {
    private Reptil[] listado;
    private String colorEscamas;
    private int largoCola;

    static public int iguanas;
    static public int serpientes;
    private static int total = 0;//1;
    public String movimiento = "reptar";

    public Reptil( String nombre, int edad, String habitat, String genero,
    
    String colorEscamas, int largoCola) {

        super(nombre, edad, habitat, genero);
        
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        total ++;
    }

    public Reptil() {

        total ++;
        
    }

    public Reptil[] getListado() {
        return listado;
    }

    public void setListado(Reptil[] listado) {
        this.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    public static int getIguanas() {
        return iguanas;
    }

    public static void setIguanas(int iguanas) {
        Reptil.iguanas = iguanas;
    }

    public static int getSerpientes() {
        return serpientes;
    }

    public static void setSerpientes(int serpientes) {
        Reptil.serpientes = serpientes;
    }

    static public int cantidadReptiles() {
        return Reptil.iguanas + Reptil.serpientes + total;
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        Reptil iguana = new Reptil();
        iguana.colorEscamas = "verde";
        iguana.largoCola = 3;
        iguana.habitat = "humedal";
        iguana.nombre = nombre;
        iguana.edad = edad;
        iguana.genero = genero;
        iguana.iguanas += 1;
        //Animal.totalAnimales ++;
        return iguana;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        Reptil serpiente = new Reptil();
        serpiente.colorEscamas = "blanco";
        serpiente.largoCola = 1;
        serpiente.habitat = "jungla";
        serpiente.nombre = nombre;
        serpiente.edad = edad;
        serpiente.genero = genero;
        serpiente.serpientes += 1;
        //Animal.totalAnimales ++;
        return serpiente;
    }

    public static void main(String[] args) {

        new Anfibio();
		new Anfibio();
		new Mamifero();
		new Mamifero();
		new Mamifero();
		new Reptil();
		new Pez();
		new Ave();
		new Ave();

        System.out.println(Animal.totalPorTipo()); 
            //String  comp = "Mi nombre es paloma, tengo una edad de 5, habito en ciudad y mi genero es F";
            
		
    }
    

    public String movimiento(){
        return movimiento;
    }
}


