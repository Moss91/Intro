/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8.Animal;
import java.util.*;

/**
 *
 * @author TiehoM
 */
public class TestMyAnimalList {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();
        list.add(d);
        list.add(c);
        list.add(l);
        
        ArrayList<Hippo> myArrayList = new ArrayList<Hippo>();
        Hippo h = new Hippo();
        myArrayList.add(h);
        
        System.out.println("Hippo added at " + myArrayList.lastIndexOf(h));
    }
 
}
