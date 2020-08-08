 /**
 * Write a description of class ProductList here.
 * this class is responsible for display produuctlist,add products to the list
 * @author (Anik Dey Sarker) 
 * @date (02/09/2018)
 */
public class ProductList
{
    private Product[] listOfProducts;
   
    public ProductList()
    {
       listOfProducts = new Product[5];
    }
    
    public Product[] getListOfProducts() //accessor method
    {
        return listOfProducts;
    }
    
    public Product getListOfProducts(int i)
    {
        return listOfProducts[i];
    }
    
    public void setListOfProducts(Product[] newListOfProducts) //mutator method
    {
        listOfProducts = newListOfProducts;
    }
  
    public void displayProductList() //method to display product list
    {
        System.out.println("----All Product List----");
        for(int i = 0 ; i < listOfProducts.length ; i++)
       {
           if (listOfProducts[i] != null)
           {
               System.out.println("Product "+(i+1)+":");
               listOfProducts[i].displayProduct();
           }
       }
        System.out.println("============================");
    }
    
    public void addProduct(String name , String desc , double price , int qtyOnHand , int minOrderQty) //method to add products
    {      
       Product productName = new Product(name,desc,price,qtyOnHand,minOrderQty);      
       for(int i = 0 ; i < listOfProducts.length ; i++) 
       {
           if (listOfProducts[i] == null)
           {
               listOfProducts[i] = productName;
               break;
           }
       }
       
    }
    
    public void removeProduct(String productName) //method to add products
    {
        for(int i = 0 ; i < listOfProducts.length ; i++)
        {
            if(listOfProducts[i] != null)
            {
                String currentProduct = listOfProducts[i].getName();
                if(currentProduct.equals(productName) )
                {
                    listOfProducts[i] = null;
                    break;
                }
            }
        }
    }
   
}
