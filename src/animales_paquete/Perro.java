/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 * Clase Perro que cuenta con 1 atributo (colorCollar) y hereda los atributos (extends) de la clase AnimalTerrestre
 * @author Silvia Jamile Rojas Nava 
 */
public class Perro extends AnimalTerrestre{
    private String colorCollar;

/**
 * Constructor vacio, inicializa todos los atributos en 0 para int 
 */
    public Perro() {
    }
  
/**
 * Constructor lleno
 * @param colorCollar color del collar del perro
 */
    public Perro(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
/**
 * Se crea una nueva instancia de Perro
 * Este constructor inicializa un nuevo perro con su propio atributo (color del collar) y los
 * atributos heredados de la clase AnimalTerrestre (numeroPatas)
 * @param colorCollar color del collar del perro
 * @param numeroPatas número de patas del perro
 */
    public Perro(String colorCollar, int numeroPatas) {
        super(numeroPatas);
        this.colorCollar = colorCollar;
    }
    
/**
 * Se crea una nueva instancia de Perro
 * Este constructor inicializa un nuevo perro con su propio atributo (color del collar) y los atributos heredados
 * de la clase AnimalTerrestre(numeroPatas) y de la clase Animal (nombre, lugarorigen y color)
 * @param colorCollar color del collar del perro
 * @param numeroPatas número de patas del perro
 * @param nombre nombre del perro
 * @param lugarorigen lugar de origen del perro
 * @param color color del perro
 */
    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarorigen, String color) {
        super(numeroPatas, nombre, lugarorigen, color);
        this.colorCollar = colorCollar;
    }
    
/**
 * Métodos de servicio. Se regresa el color del collar del perro
 * @return regresa una variable colorCollar
 */
    public String getColorCollar() {
        return colorCollar;
    }

/**
 * Se accede al valor del colorCollar y se modifica asignando un color del collar al objeto
 * @param colorCollar asigna el nuevo valor al atributo colorCollar del objeto 
 */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }

/**
 * Método de acción. Imprime un mensaje que simula que el perro está haciendo trucos
 */
    public void hacerTrucos(){
        System.out.println("Hacerse el muerto");
    }
    
/**
 * Método de sobreescritura. Devuelve una cadena de un perro, incluyendo su color de collar 
 * @return regresa una cadena de caracteres que representa al objeto perro
 */
    @Override
    public String toString() {
        return super.toString() + "Perro{" + "colorCollar=" + colorCollar + '}';
    }
    
    
    
}