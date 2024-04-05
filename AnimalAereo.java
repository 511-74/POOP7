/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 * Clase AnimalAereo que cuenta con 1 atributo (número de alas) y hereda los atributos (extends) de la clase Animal
 * @author Silvia Jamile Rojas Nava 
 */
public class AnimalAereo extends Animal{
    private int numeroAlas;
    
/**
 * Constructor vacio, inicializa todos los atributos en 0 para int 
 */
    public AnimalAereo() {
    }

/**
 * Constructor lleno
 * @param numeroAlas número de alas del animal aéreo
 */
    public AnimalAereo(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

/**
 * Se crea una nueva instancia de AnimalAereo
 * Este constructor inicializa un nuevo animal aereo con los detalles proporcionados,
 * incluyendo sus propios atributos (número de alas) y los atributos heredados de la clase Animal
 * (nombre, lugar de origen y color)
 * @param numeroAlas número de alas del animal aéreo
 * @param nombre nombre del animal aéreo
 * @param lugarOrigen lugar de origen del animal aéreo
 * @param color color del animal aéreo
 */
    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

/**
 * Métodos de servicio. Se regresa un número de alas del animal aéreo
 * @return regresa una variable numeroAlas
 */    
    public int getNumeroAlas() {
        return numeroAlas;
    }

/**
 * Se accede al valor del numeroAlas y se modifica asignando un número de alas al objeto
 * @param numeroAlas asigna el nuevo valor al atributo numeroAlas del objeto 
 */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    
/**
 * Método de acción. Imprime un mensaje que simula que el animal aéreo está volando
 */
    public void volar(){
        System.out.println("I believe I can fly.... osea estoy volando");
    }
    
/**
 * Método de sobreescritura para imprimir que el animal está comiendo
 */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo, pero soy un animal aereo");
    }

/**
 * Método de sobreescritura. Devuelve una cadena de un animal aéreo, incluyendo su número de alas
 * @return regresa una cadena de caracteres que representa al objeto AnimalAereo
 */
    @Override
    public String toString() {
        return super.toString() + "AnimalAereo{" + "numeroAlas=" + numeroAlas + '}';
    }
    
    
    
}