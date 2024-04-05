/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 * Clase AnimalAcuatico que cuenta con 1 atributo (número de aletas) y hereda los atributos (extends) de la clase Animal
 * @author Silvia Jamile Rojas Nava 
 */
public class AnimalAcuatico extends Animal {
    private int numAletas;

/**
 * Constructor vacio, inicializa todos los atributos en 0 para int 
 */
    public AnimalAcuatico() {
    }

/**
 * Contructor lleno
 * @param numAletas número de aletas del animal acuático
 */
    public AnimalAcuatico(int numAletas) {
        this.numAletas = numAletas;
    }

/**
 * Métodos de servicio. Se regresa un número de aletas del animal acuático
 * @return regresa una variable numAletas
 */
    public int getNumAletas() {
        return numAletas;
    }

/**
 * Se crea una nueva instancia de AnimalAcuatico 
 * Este constructor inicializa un nuevo animal acuático con los detalles proporcionados,
 * incluyendo sus propios atributos (número de aletas) y los atributos heredados de la clase Animal
 * (nombre, lugar de origen y color)
 * @param numAletas número de aletas de un animal acuático
 * @param nombre nombre de un animal acuático
 * @param lugarorigen lugar de origen de un animal acuático
 * @param color color de un aimal acuático
 */
    public AnimalAcuatico(int numAletas, String nombre, String lugarorigen, String color) {
        super(nombre, lugarorigen, color);
        this.numAletas = numAletas;
    }
    
/**
 * Se accede al valor del numAletas y se modifica asignando un número de aletas al objeto
 * @param numAletas asigna el nuevo valor al atributo numAletas del objeto 
 */
    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

/**
 * Método de acción. Imprime un mensaje que simula que el animal acuático está nadando
 */
    public void nadar(){
        System.out.println("Nadademos nadaremos en el mar");
    }
    
/**
 * Método de sobreescritura para imprimir que el animal está comiendo
 */
    @Override
    public void comer(){
        System.out.println("Comeremos jeje");
    }
   
/**
 * Método de sobreescritura. Devuelve una cadena de un animal acuático, incluyendo su número de aletas 
 * @return regresa una cadena de caracteres que representa al objeto AnimalAcuatico
 */
    @Override
    public String toString() {
        return super.toString() + "AnimalAcuatico{" + "numAletas=" + numAletas + '}';
    }
    
    
    
}
    
