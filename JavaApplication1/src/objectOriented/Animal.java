/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOriented;

/**
 *
 * @author Naseer
 */
public class Animal {
    
    
    String name; // data type string
    
    String color;
    int age;
    String type;
public Animal(String color,int age, String name, String type){ 
    this.color= color; //contructor it is not a regular class constructor we defined constructor now all object will be create in this particular style we need to give parameter when we creating objects.
    this.name= name;
    this.type= type;
    this.age= age;
    
}
    

public void walk(){
    System.out.println("Walking....");
    
}
public void eats(){
    System.out.println("Eating....");
    
}
public void sleep(){
    System.out.println("Sleeping.....");
    
    
}

      
}

