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
public class Zoo {
    public static void main(String orgs[]){
        Animal lion=new Animal("brown",24, "Zeus","Carnivore" );
        lion.eats();
         bird coku=new bird("black",3,"cukoo","grain fed");
         
         coku.eats();
         coku.sleep();
         chicken chick=new chicken("white",2,"chickeoo","grain feed");
         chick.eats();
        
        Sparrow finch=new Sparrow("grey",1,"finch","grain");
        finch.fly();
        
        
        
    }
    
}
