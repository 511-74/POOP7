/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 * Clase Animal que cuenta con 3 atributos: nombre, lugarorigen y color
 * @author Silvia Jamile Rojas Nava 
 */
public class Animal extends Object {
    private String nombre, lugarorigen, color;

/**
 * Constructor vacio, inicializa todos los atributos en null para String
 */
    public Animal() {
    }
    
/**
 * Constructor lleno
 * @param nombre nombre del animal
 * @param lugarorigen lugar de origen del animal
 * @param color color del animal
 */        
    public Animal(String nombre, String lugarorigen, String color) {
        this.nombre = nombre;
        this.lugarorigen = lugarorigen;
        this.color = color;
    }
       
/**
 * Métodos de servicio. Se regresa un nombre de un animal
 * @return regresa una variable nombre
 */    
    public String getNombre() {
        return nombre;
    }
    
/**
 * Se accede al valor del nombre y se modifica asignando un nombre al objeto
 * @param nombre asigna el nuevo valor al atributo nombre del objeto 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/**
 * Se regresa un lugar de origen de un animal
 * @return regresa una variable lugarorigen
 */
    public String getLugarorigen() {
        return lugarorigen;
    }
/**
 * Se accede al valor del lugar de origen y se modifica asignando un lugar de origen al objeto
 * @param lugarorigen asigna el nuevo valor al atributo lugarorigen del objeto 
 */
    public void setLugarorigen(String lugarorigen) {
        this.lugarorigen = lugarorigen;
    }

/**
 * Se regresa un color de un animal
 * @return regresa una variable color
 */
    public String getColor() {
        return color;
    }
/**
 * Se accede al valor del color y se modifica asignando un color al objeto
 * @param color asigna el nuevo valor al atributo color del objeto 
 */
    public void setColor(String color) {
        this.color = color;
    }
    
/**
 * Se imprime el sonido del animal
 * @param sonido toma una cadena que representa el sonido del animal
 */
    public void sonido(String sonido){
        System.out.println(sonido);   
    }
     
/**
 * Método de acción. Imprime un mensaje que simula que el animal está comiendo
 */    
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    
/**
 * Método de sobreescritura. Devuelve una cadena de un animal, incluyendo su nombre, lugar de origen y color
 * @return regresa una cadena de caracteres que representa al objeto Animal
 */
    @Override
    public String toString() {
        return super.toString() + "Animal{" + "nombre=" + nombre + ", lugarorigen=" + lugarorigen + ", color=" + color + '}';
    }
        
    
   
}

   