import java.util.*;
public class ATM{
    public static void main(String[] args){
    
    int pin=2006;
    int balance=50000;
    int addamount=0;
    int takeamount=0;
    
    
    String name;
    Scanner src=new Scanner(System.in);
    
    
    System.out.println("enter your pin number");
    int password=src.nextInt();
    if(password==pin)
    {
    System.out.println("enter your name");
    name=src.next();
    System.out.println("welcome"+name);
    
    while(true){
        System.out.println("click 1 to check your balance");
        System.out.println("click 2 to add amount to your account");
        System.out.println("click 3 to take amount from your account");
        System.out.println("click 4 to get receipt");
        System.out.println("click 5 to complete transaction");
        
        int opt=src.nextInt();
        switch(opt){
            case 1:
                System.out.println("your current balance was:"+balance);
                break;
                
            case 2:
                addamount=src.nextInt();
                System.out.println("add amount"+addamount);
                balance=addamount+balance;
                break;
                
            case 3:
                takeamount=src.nextInt();
                System.out.println("take amount"+takeamount);
                if(takeamount>balance){
                    System.out.println("your balance was insufficient");
                }
                else
                {
                    System.out.println("successfully taken");
                     balance=balance-takeamount;
                }
                break;
                
            case 4:
                System.out.println("your current balance:"+balance);
                System.out.println("your added amount:"+addamount);
                System.out.println("your taken amount:"+takeamount);
                System.out.println("thank you!!!!");
                break;
                
            case 5:
                System.out.println("THANK YOU VISIT AGAIN");
                break;
        }
    }
                
    }
    else
    {
        System.out.println("your pin was wrong try again");
    }
        
    }
    
    }