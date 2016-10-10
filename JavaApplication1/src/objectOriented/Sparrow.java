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
public class Sparrow extends bird implements flyable{
    
    public Sparrow(String color, int age, String name, String type) {
        super(color, age, name, type);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying..");//To change body of generated methods, choose Tools | Templates.
    }
    
}
