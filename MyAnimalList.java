/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8.Animal;

/**
 *
 * @author TiehoM
 */
public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;
    
    public void add(Animal a){
    
        if(nextIndex < animals.length)
            animals[nextIndex] = a;
        System.out.println("Animal added at " + nextIndex);
        nextIndex++;
    }
}
