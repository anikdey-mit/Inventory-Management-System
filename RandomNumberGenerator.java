import java.util.Random;
/**
 * Write a description of class RandomNumberGenerator here.
 * this class helps to generate random numbers
 * @author (Anik Dey Sarker) 
 * @date (22/08/2018)
 */
public class RandomNumberGenerator
{
    private int minimumValue;
    private int maximumValue;
    
    // default Constructor    
    public RandomNumberGenerator()
    {
       minimumValue = 0;
       maximumValue = 0;
    }
    public RandomNumberGenerator(int newMinimumValue , int newMaximumValue) //non-default Constructor
    {
       minimumValue = newMinimumValue;
       maximumValue = newMaximumValue;
    }
    public int randomnumber() //method to generate random number
    {
        Random rnd = new Random();
        int randomnumber = rnd.nextInt(maximumValue + 1 - minimumValue) + minimumValue;
        return randomnumber;
    }
    public int getMinimumValue() //accessor methods
    {
       return minimumValue;
    }
    public int getMaximumValue()
    {
        return maximumValue;
    }
    public void setMinimumValue(int newMinimumValue) //mutator methods
    {
        minimumValue = newMinimumValue;
    }
    public void setMaximumValue(int newMaximumValue)
    {
        maximumValue = newMaximumValue;
    }
    
}
