package dnddiceroller;

import java.util.Random;

/**
 * A Die is a many sided object that when rolled provides a random value from
 * 1 through the number of sides on the object. Some dice are 6 sided and have
 * the numbers 1-6 on them. Some dice are 20 sided with the numbers 1-20 on them.
 * Others are called fudge dice and have the values of -1 0 or +1
 * @author Paul Scarrone
 */
public class Die {
    private int value;
    private int sides;
    private Random randomNumber;
    
    
    public Die(int sides){
        this.sides = sides;
    }
    
    /**
     *  Returns the value of a die
     * @return Die Value
     */
    public int value(){
        return this.value;
    }
    
    /**
     * Method to "roll" a die and set its value equal to a random number
     */
    public void roll(){
        this.value = this.randomNumber.nextInt(this.sides) + 1;
    }
}
