/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 * Clase AnimalTerrestre que cuenta con 1 atributo (número de patas) y hereda los atributos (extends) de la clase Animal
 * @author Silvia Jamile Rojas Nava 
 */
public class AnimalTerrestre extends Animal{
    private int numeroPatas;

/**
 * Constructor vacio, inicializa todos los atributos en 0 para int 
 */
    public AnimalTerrestre() {
    }

/**
 * Constructor lleno
 * @param numeroPatas número de patas del animal terrestre
 */
    public AnimalTerrestre(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

/**
 * Se crea una nueva instancia de AnimalTerrestre
 * Este constructor inicializa un nuevo animal terrestre con los detalles proporcionados,
 * incluyendo sus propios atributos (número de patas) y los atributos heredados de la clase Animal
 * (nombre, lugar de origen y color)
 * @param numeroPatas
 * @param nombre
 * @param lugarorigen
 * @param color 
 */
    public AnimalTerrestre(int numeroPatas, String nombre, String lugarorigen, String color) {
        super(nombre, lugarorigen, color);
        this.numeroPatas = numeroPatas;
    }
 
/**
 * Métodos de servicio. Se regresa un número de patas del animal terrestre
 * @return regresa una variable numeroPatas
 */
    public int getNumeroPatas() {
        return numeroPatas;
    }

/**
 * Se accede al valor del numeroPatas y se modifica asignando un número de patas al objeto
 * @param numeroPatas asigna el nuevo valor al atributo numeroPatas del objeto 
 */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
/**
 * Método de acción. Imprime un mensaje que simula que el animal terrestre está corriendo
 */
    public void correr(){
        System.out.println("Estoy corriendo, ¡correle gordo!, ¡correle gordo!");
    }

/**
 * Método de sobreescritura para imprimir que el animal está comiendo
 */ 
    @Override
    public void comer(){
        System.out.println("Estoy comiendo, pero soy un animal terrestre");
    }

/**
 * Método de sobreescritura. Devuelve una cadena de un animal terrestre, incluyendo su número de patas
 * @return regresa una cadena de caracteres que representa al objeto AnimalAcuatico
 */
    @Override
    public String toString() {
        return super.toString() + "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + '}';
    }
       
    
    
}