/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 * Clase Ballena que cuenta con 1 atributo (largo) y hereda los atributos (extends) de la clase AnimalAcuatico
 * @author Silvia Jamile Rojas Nava 
 */
public class Ballena extends AnimalAcuatico {
    private int large;

/**
 * Constructor vacio, inicializa todos los atributos en 0 para int 
 */
    public Ballena() {
    }

/**
 * Contructor lleno
 * @param large largo de la ballena
 * @param numAletas número de aletas de la ballena
 * @param nombre nombre de la ballena
 * @param lugarorigen lugar de origen de la ballena
 * @param color color de la ballena
 */
    public Ballena(int large, int numAletas, String nombre, String lugarorigen, String color) {
        super(numAletas, nombre, lugarorigen, color);
        this.large = large;
    }

/**
 * Métodos de servicio. Se regresa el largo de la ballena
 * @return regresa una variable large
 */
    public int getLarge() {
        return large;
    }

/**
 * Se accede al valor del large y se modifica asignando un largo al objeto
 * @param large asigna el nuevo valor al atributo large del objeto 
 */
    public void setLarge(int large) {
        this.large = large;
    }
   
/**
 * Método de acción. Imprime un mensaje que simula que la ballena está peleando
 */
    public void pelearConPinocho(){
        System.out.println("Peleando");
    }
    
/**
 * Mètodo comer que se sobreescribe en ballena, esto porque las ballenas comen crill y este es 
 * un componente fundamental de su dieta
 */
    @Override
    public void comer() {
        super.comer(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Comiendo crill");
    }
  
/**
 * Método de sobreescritura. Devuelve una cadena de una ballena, incluyendo su largo 
 * @return regresa una cadena de caracteres que representa al objeto ballena
 */ 
    @Override
    public String toString() {
        return "Ballenaa{" + "large=" + large + '}';
    }
    
    
    
}
    

