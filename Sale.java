import java.util.Scanner;
/**
 * Write a description of class Sale here.
 * this class controls the whole programm.you can register & view products,buy & remove products from the cart,check out from the sale,help
   if anyone faces any difficulty and helps to exit from the system
 * @author (Anik Dey Sarker) 
 * @date (28/08/2018)
 */
public class Sale
{
    private ProductList prodList;
    private SaleTransaction transaction;

    public Sale() //non-default Constructor
    {
        prodList = new ProductList();
        int saleCode = getRandomNumber(1000,9999);
        transaction = new SaleTransaction(saleCode,0);
    }
    
    public ProductList getProdList() //accessor methods
    {
        return prodList;
    }
    public SaleTransaction getTransaction()
    { 
        return transaction;
    }
    public void setProdList(ProductList newProdList) //mutator methods
    {
        prodList = newProdList;
    }
    public void setTransaction(SaleTransaction newTransaction)
    { 
        transaction = newTransaction;
    }
    public void main()
    {
        int digit;        
        Sale s=new Sale();
        System.out.println("+=+=+=+=+=+=++=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+= \n"
                           +"Welcome to the Simple Inventory Management System \n"
                           +"+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
                          
        do
        {
        System.out.println();
        System.out.println("Please select from the following options: ");
        System.out.println("Press 1 Register a Product for Sale ");
        System.out.println("Press 2 Buy a Product to the Cart ");
        System.out.println("Press 3 Remove a Product from the Cart ");
        System.out.println("Press 4 View all available Product ");
        System.out.println("Press 5 to Check Out ");
        System.out.println("Press 6 to get Help ");
        System.out.println("Press 7 to get Exit ");
        System.out.println();
        System.out.println("Please Enter Your Choice "); 
        Scanner input = new Scanner(System.in);
        
        digit = input.nextInt();
        
        switch(digit)
        {
            case 1:
            String productName,productDesc;
            double productPrice;
            System.out.println("--Register a Product for Sale--");
            boolean isNotComplete=true;
            Scanner console=new Scanner(System.in);
            do
            {
                 System.out.print("Enter Product Name : ");
                 productName = console.nextLine();
                 if(productName.length() < 3 || productName.length() > 25 )
                 {
                    System.out.println("Re-enter, name out of range------");
                    continue;
                 }
                 boolean isNamePresent=false;
                 Product[] p = prodList.getListOfProducts();
                 for(int i = 0 ; i < p.length ; i++)
                 {
                     if(p[i] != null)
                     {
                         String oldProductName = p[i].getName();
                         if ( productName.equalsIgnoreCase( oldProductName  ) == true )
                         {
                             System.out.println("Re-enter, name already being used------");
                             isNamePresent=true; 
                             break;
                         }
                     }
                 }
                 
                 if(isNamePresent==false)
                 {
                    isNotComplete=false;
                 }
            }while(isNotComplete );
            
            do
            {
                 System.out.print("Enter Product Description :");
                 productDesc = console.nextLine();
                 if(productDesc.length() < 1 || productDesc.length() > 50)
                 {
                    System.out.println("Re-enter------");
                 }
                 else
                 {
                    isNotComplete=false;
                 }
                 
            }while(isNotComplete);
            do
            {
                 System.out.print("Enter Product Price :");                 
                 String price;
                 price = console.nextLine();
                 productPrice = Double.parseDouble(price);
                 if(productPrice <= 0)
                 {
                    System.out.println("Re-enter------");
                 }
                 else
                 {
                    isNotComplete=false;
                 }
                 
            }while(isNotComplete);
            
            int productQtyOnHand=getRandomNumber(0,10);
            int productMinOrderQty=getRandomNumber(1,3);
             
            prodList.addProduct(productName,productDesc,productPrice,productQtyOnHand,productMinOrderQty);
            
                
            break;
            
            case 2:
            Scanner console1=new Scanner(System.in);
            System.out.println("Buy a Product to the Cart ");
            System.out.println("Please Select from the following products which are available:");
            prodList.displayProductList();
            int i = console1.nextInt();
            transaction.buyProduct(prodList.getListOfProducts(i - 1));
            break;
            
            case 3:
            Scanner console2=new Scanner(System.in);
            System.out.println("Remove a Product from the Cart ");
            System.out.println("Please Select from the following products which have been added to the cart:");
            prodList.displayProductList();
            int j = console2.nextInt();
            transaction.removeProduct(prodList.getListOfProducts(j - 1));
            break;
            
            case 4:
            System.out.println("View all available Product ");
            prodList.displayProductList();
            
            break;
            
            case 5:
            System.out.println("Check Out ");
            break;
            
            case 6:
            System.out.println("Pressing 1 helps you to register a product ");
            System.out.println("Pressing 2 helps you to buy a product from the cart");
            System.out.println("Pressing 3 helps you to remove a registered product from the cart");
            System.out.println("Pressing 4 helps you to view all registered product ");
            System.out.println("Pressing 5 helps you to check out from the sale ");
            System.out.println("Pressing 6 helps you to help ");
            System.out.println("Pressing 7 helps you to exit from the whole system ");
            break;
            
            case 7:
            System.out.println("==Thanks,see you again== ");
            break;
            
            default:
            System.out.println("wrong choice");
        }
        }while(digit != 7);
    }
    public int getRandomNumber(int minimumValue,int maximumValue)
    {
        RandomNumberGenerator randomNumber=new RandomNumberGenerator(minimumValue , maximumValue);
        return randomNumber.randomnumber();
    }
}