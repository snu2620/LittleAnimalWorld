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
public class fish extends Animal{

    public fish(String color, int age, String name, String type) {
        super(color, age, name, type);
    }
   
    
    public void swim(){
        System.out.println("swimming....");
        
    }
    
}
