/**
 * Write a description of class Product here.
 * this class is used to display products on screen
 * @author (Anik Dey Sarker) 
 * @date (19/08/2018)
 */
public class Product
{
    // instance variable
    private String name;
    private String desc;
    private double price;
    private int qtyOnHand;
    private int minOrderQty;

    public Product() //Default Constructor
    {
       // initialise instance variables
       name="";
       desc="";
       price = 0.00;
       qtyOnHand = 0;
       minOrderQty = 0;
    }
    //Non-default Contructor
    public Product(String newName , String newDesc , double newPrice , int newQtyOnHand , int newMinOrderQty)
    {
        name = newName;
        desc = newDesc;
        price = newPrice;
        qtyOnHand = newQtyOnHand;
        minOrderQty = newMinOrderQty;
    }
    
    public void displayProduct() //method to display products
    {       
        System.out.println("Name : "+name);
        System.out.println("Description : "+desc);
        System.out.println("Price : "+price);
        System.out.println("Quantity On Hand : "+qtyOnHand);
        System.out.println("Min Order Quantity : "+minOrderQty);
        System.out.println("============================");
    }
    public String getName() //accessor methods
    {
        return name;
    }
    public String getDesc()
    {
        return desc;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQtyOnHand()
    {
        return qtyOnHand;
    }
    public int getMinOrderQty()
    {
        return minOrderQty;
    }
    public void setName(String newName) //mutator methods
    {
        name = newName;
    }
    public void setDesc(String newDesc)
    {
        desc = newDesc;
    }
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
    public void setQtyOnHand(int newQtyOnHand)
    {
        qtyOnHand = newQtyOnHand;
    }
    public void setMinOrderQty(int newMinOrderQty)
    {
       minOrderQty = newMinOrderQty;
    }
}
