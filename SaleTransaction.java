/**
 * Write a description of class SaleTransaction here.
 * this class is responsible for buying and selling product from the cart
 * @author (Anik Dey Sarker) 
 * @date (07/09/2018)
 */
public class SaleTransaction
{
   private int saleCode;
   private Product[] items;
   private double totalcost;

    public SaleTransaction() //default Constructor 
    {
        saleCode = 0;
        items = new Product[3];
        totalcost = 0.00;
    }
    
    public SaleTransaction(int newSaleCode,double newTotalCost) //non-default Constructor
    {
        saleCode = newSaleCode;
        totalcost = newTotalCost;
        items = new Product[3];
    }
    public int getSaleCode() //accessor methods
    {
        return saleCode;
    }
    public Product[] getItems()
    {
        return items;
    }
    public double getTotalcost()
    {
        return totalcost;
    }
    public void setItems(Product[] newItems) //mutator methods
    {
        items = newItems;
    }
    public void setSaleCode(int newSaleCode)
    {
        saleCode = newSaleCode;
    }
    public void setTotalcost(double newTotalcost)
    {
        totalcost = newTotalcost;
    }

    public void buyProduct(Product p) //method to buy products from the cart
    {
       if (p.getQtyOnHand() < p.getMinOrderQty())
       System.out.println("Not Enough Items to Buy");
       for(int i = 0 ; i < items.length ; i++) 
       {
           if (items[i] == null)
           {
               items[i] = p;
               break;
           }
       }
           
    }

    public void removeProduct(Product p) //method to remove products from the cart
    {
        for(int i = 0 ; i < items.length ; i++)
        {
            if(items[i] != null)
            {
                if(items[i].equals(p))
                {
                    items[i] = null;
                    break;
                }
            }
        }
    }
}