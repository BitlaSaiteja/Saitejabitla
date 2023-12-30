import java.util.*;
import java.lang.*;

import static java.lang.System.exit;

public class sai extends Thread{
    static        HashMap<Integer,String >list=new HashMap<>();
static        HashMap<String,Integer> mylist=new HashMap<>();

    static   Scanner s=new Scanner(System.in);
public void run(){
    try{
        System.out.println("############################---Billing Section---#############################");
        int bill;
        int total=0;
        if(mylist.containsKey("rice")){
            bill= mylist.get("rice")*45;
            total+=bill;
        }

        if (mylist.containsKey("dal")) {
            bill=mylist.get("dal")*50;
            total+=bill;

        }

        if (mylist.containsKey("shampoo")) {
            bill=mylist.get("shampoo")*90;
            total+=bill;

        }

        if (mylist.containsKey("oil")) {
            bill=mylist.get("oil")*110;
            total+=bill;
        }

        if (mylist.containsKey("soap")) {
            bill=mylist.get("soap")*30;
            total+=bill;

        }

        if (mylist.containsKey("sugar")) {
            bill=mylist.get("sugar")*60;
            total+=bill;

        }

        if (mylist.containsKey("cooldrinks")) {
            bill=mylist.get("cooldrinks")*85;
            total+=bill;

        }

        if (mylist.containsKey("millets")) {
            bill=mylist.get("millets")*55;
            total+=bill;
        }
        System.out.println();
        System.out.println("The M.R.P is:------>Rs "+total+" only");
        String cupoun;
        double discount;
        System.out.println("Use 'MY_DISCOUNT' coupon for 25% OFF! ");
        cupoun=s.next();
        if(cupoun.equalsIgnoreCase("my_discount")) {
            System.out.println("Bill Generating.....");
            Thread.sleep(1000);
            System.out.print("....................");
            Thread.sleep(1050);
            System.out.print("....................");
            Thread.sleep(750);
            System.out.println("");
            System.out.println("Bill Generated!");
            Thread.sleep(800);
            System.out.println("\nHurray 25% OFF Coupon Applied! ");
            double off = total * (0.25);
            discount = total - off;
            double _final = discount;
            double GST;
            GST = total * (0.05);
            _final += GST;
            System.out.println("GST------------------------>:" + GST);
            System.out.println("Final price is including GST: " + _final);
            System.out.println("Congrats! you saved "+off);
        }else {
            double GST=total*0.05;
            double mrp=GST+total;
            System.out.println("The M.R.P is:------>Rs "+mrp+" included GST");
        }
    }catch (Exception e){
        System.out.println(e);
    }

}

   public static void main(String[]args){
       list.put(45," Rs/Kg---> Rice \n");
       list.put(50," Rs/Kg---> Dal \n");
       list.put(110," Rs/l---> oil   \n");
       list.put(30," Rs--->    Soap   \n");
       list.put(90," Rs--->    Shampoo \n");
       list.put(60," Rs/kg---> Sugar \n");
       list.put(85," Rs/l--->  CoolDrinks\n");
       list.put(55," Rs/kg---> Millets\n");
while(true){
    int choice;
    System.out.println();
    System.out.println("Saiteja's Mart");
    System.out.println("================================================================");
    System.out.println("1.Add items to cart\n2.Remove items from cart\n3.Go to Cart\n4.Generate Bill\n5.Exit");
    System.out.println("Enter your choice: ");
    choice=s.nextInt();
    System.out.println("=================================================================");
    switch (choice){
        case 1:
            System.out.println("You selected Add items option! ");

            System.out.println();
            System.out.println("**************************** GROCERY LIST **********************************");
                         System.out.println(list);
            System.out.println("****************************************************************************");
            System.out.println("Add items and quantity to your cart ");
            System.out.println();

            String items;
            System.out.println("Enter Item: ");
items=s.next();
            System.out.println("Enter Quantity: ");
int qantity=s.nextInt();
            if(items.equalsIgnoreCase("rice")){
                mylist.put(items,qantity);
                System.out.println(items+" Successfully added to cart: ");
                System.out.println();
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            }else if(items.equalsIgnoreCase("dal")){
                mylist.put(items,qantity);
                System.out.println(items+" Successfully added to cart: ");
                System.out.println();
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            }else if(items.equalsIgnoreCase("soap")){
                mylist.put(items,qantity);
                System.out.println(items+" Successfully added to cart: ");
                System.out.println();
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            }else if(items.equalsIgnoreCase("shampoo")){
                mylist.put(items,qantity);
                System.out.println(items+" Successfully added to cart: ");
                System.out.println();
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


            }else if(items.equalsIgnoreCase("oil")) {
                mylist.put(items, qantity);
                System.out.println(items + " Successfully added to cart: ");
                System.out.println();
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            }
            else if(items.equalsIgnoreCase("sugar")){
                mylist.put(items,qantity);
                System.out.println(items+" Successfully added to cart: ");
                System.out.println();
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


            }else if(items.equalsIgnoreCase("cooldrinks")){
                mylist.put(items,qantity);
                System.out.println(items+" Successfully added to cart: ");
                System.out.println();
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


            }else if(items.equalsIgnoreCase("millets")){
                mylist.put(items,qantity);
                System.out.println(items+" Successfully added to cart: ");
                System.out.println();
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            }
            break;
        case 2:
            if(mylist.isEmpty()){
                System.out.println("Cart is Empty \nNothing to remove!");
            }else if(!mylist.isEmpty()){
                System.out.println("Enter item you want to remove: ");
                String remove=s.next();
                mylist.remove(remove);
                System.out.println(remove+" successfully removed! ");
            }
            break;
        case 3:
            if(mylist.isEmpty())
            {
                System.out.println("Your Cart is Empty! ");
                System.out.println();
            } else if (!mylist.isEmpty())
            System.out.println("Added Cart Items are: ");
            System.out.println("############################# My Cart ##################################");
    System.out.println(mylist+"\n");
            System.out.println("########################################################################");
break;
        case 4: {
sai obj=new sai();
if(mylist.isEmpty()){
    System.out.println("Your Cart is Empty! ");
    System.out.println();
    break;
}
obj.run();
            System.out.println("Do you want to continue to shop or exit: ");
            String sh=s.next();
            if(sh.equalsIgnoreCase("exit")){
                System.out.println("Thank for the shopping! hava a nice day !");
                return;

            }
            break;
        }
        case  5:
            System.out.println("Thanks for Visiting have a nice day!");
            exit(0);
        default:
            System.out.println("You Entered Wrong Option! \nPlease try again! ");
            break;
    }

}

}}
