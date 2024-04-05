/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

//Importación de las clases dentro del paquete animales_paquete
import animales_paquete.Animal;
import animales_paquete.AnimalAcuatico;
import animales_paquete.Ballena;
import animales_paquete.Pajaro;
import animales_paquete.Perro;

/**
 *
 * @author Silvia Jamile Rojas Nava 
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal("Jaguar", "selva de Brasil", "pardo");  //Creamos un objeto Animal
        animal.sonido("Rawww");
        System.out.println(animal);
        System.out.println(animal);
        String a = new String("Hola mundo");  //Creamos un objeto String para imprimir un "Hola mundo"
        System.out.println(a);
        String b = "Hola mundo";  //Imprimimos un "Hola mundo"
        System.out.println(b);
       
        AnimalAcuatico animal1 = new AnimalAcuatico(4);  //Creamos un objeto AnimalAcuatico
        System.out.println(animal);
        animal1.setNombre("Walle");  //Le inflamos un nombre
        animal1.setColor("gris");  //Le inflamos un color
        animal1.setLugarorigen("Antartida");  //Le inflamos un lugar de origen
        System.out.println(animal1);  //Imprimimos el objeto AnimalAcuatico
        AnimalAcuatico animal2 = new AnimalAcuatico(4, "Kriko", "Polo Sur", "azul");  //Creamos otro AnimalAcuatico
        System.out.println(animal2);
        animal2.sonido("aooo");
        animal2.comer();
        
        Ballena ballena = new Ballena(25, 2, "Willy", "Antartida", "Azul");  //Creamos un objeto Ballena
        System.out.println(ballena);
        ballena.comer();
        
        Perro perro = new Perro("Rojo");  //Creamos un objeto Perro
        System.out.println(perro);
        
        Perro perro1 = new Perro("Rojo", 4, "Firulais", "Calle", "Cafe");  //Creamos un objeto Perro con sus atributos
        System.out.println(perro1);
        perro1.hacerTrucos();
        perro1.comer();
        perro1.correr();
        
        Pajaro pajaro = new Pajaro("Achatado", 2, "Cabo", "Madagascar", "Negro");  //Creamos a un animal aereo
        System.out.println(pajaro);
        pajaro.recolectarRamas();
        pajaro.comer();
        pajaro.volar();
    }
        
    
   
}

