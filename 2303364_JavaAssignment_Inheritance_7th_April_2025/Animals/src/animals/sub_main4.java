/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animals;

/**
 *
 * @author HP
 */
//Multiple Inheritance
public class sub_main4 extends Animals,sub_main3{
    public static void main(String[]args){
        sub_main4 obj= new sub_main4();
        obj.Fish();
        obj.Mammal();
        obj.Insect();
        obj.Bird();
        obj.domesticBird();
    }
}
