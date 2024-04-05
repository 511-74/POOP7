/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 * Clase Pajaro que cuenta con 1 atributo (tipoPico) y hereda los atributos (extends) de la clase AnimalAereo
 * @author Silvia Jamile Rojas Nava 
 */
public class Pajaro extends AnimalAereo{
    private String tipoPico;

/**
 * Constructor vacio, inicializa todos los atributos en 0 para int 
 */
    public Pajaro() {
    }

/**
 * Constructor lleno
 * @param tipoPico tipo de pico del pajaro
 */
    public Pajaro(String tipoPico) {
        this.tipoPico = tipoPico;
    }

/**
 * Se crea una nueva instancia de Pajaro
 * Este constructor inicializa un nuevo pajaro con su propio atributo (tipo de pico) y los
 * atributos heredados de la clase AnimalAereo (numeroAlas)
 * @param tipoPico
 * @param numeroAlas 
 */
    public Pajaro(String tipoPico, int numeroAlas) {
        super(numeroAlas);
        this.tipoPico = tipoPico;
    }

/**
 * Se crea una nueva instancia de Pajaro
 * Este constructor inicializa un nuevo pajaro con su propio atributo (tipo de pico) y los atributos heredados
 * de la clase AnimalAereo(numeroAlas) y de la clase Animal (nombre, lugarorigen y color)
 * @param tipoPico
 * @param numeroAlas
 * @param nombre
 * @param lugarOrigen
 * @param color 
 */
    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }

/**
 * Métodos de servicio. Se regresa el tipo de pico del pajaro
 * @return regresa una variable tipoPico
 */
    public String getTipoPico() {
        return tipoPico;
    }

/**
 * Se accede al valor del tipoPico y se modifica asignando un tipo de pico al objeto
 * @param tipoPico asigna el nuevo valor al atributo tipoPico del objeto 
 */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
/**
 * Método de acción. Imprime un mensaje que simula que el pajaro está recolectando ramas
 */
    public void recolectarRamas(){
        System.out.println("Recolectando ramas para el nido");
    }
    
/**
 * Método de sobreescritura. Devuelve una cadena de un pajaro, incluyendo su tipo de pico
 * @return regresa una cadena de caracteres que representa al objeto pajaro
 */
    @Override
    public String toString() {
        return super.toString() + "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
    
    
    
}