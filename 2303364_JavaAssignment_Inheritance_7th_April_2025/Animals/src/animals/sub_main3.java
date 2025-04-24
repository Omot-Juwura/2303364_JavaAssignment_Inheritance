/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animals;

/**
 *
 * @author HP
 */
//Multi-level Inheritance: sub_main3 to sub_main2 to Animals
public class sub_main3 extends sub_main2{
    public void DomesticBird(){
        animal = "Chicken";
        System.out.println(animal+ " is a domestic bird");
    }
    
    public static void main(String[]args){
        sub_main3 obj = new sub_main3();
        obj.Mammal();
        obj.Fish();
        obj.Bird();
        obj.DomesticBird();
                
    }
}
