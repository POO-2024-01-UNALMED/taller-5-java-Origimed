package zooAnimales;
import gestion.*;

public class Animal{

    private static int totalAnimales = 0;
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    protected Zona[] zona;

    public Animal(int totalAnimales,
     String nombre,
    int edad,
    String habitat,
    String genero,
    Zona[] zona){

        this.totalAnimales += 1;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;

    }

    public Animal(){}

    public String totalPorTipo(){

        return "Mamiferos:"+ Mamifero.cantidadMamiferos();
    }

    public String toString(){

        return "Mi nombre es #nombre, tengo una edad de #edad, habito en #habitat y mi genero es #genero, la zona en la que me ubico es #zona, en el #zoo";
    }

    public String movimiento(){
        return "Forma de moverser el animal";
    }

}