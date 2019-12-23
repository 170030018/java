//Java Program to demonstrate the use of the parameterized constructor.  
import java.util.Scanner;
class box{  
    double w;  
    double h;
    double d;
    double vol; 
    //creating a parameterized constructor  
    box(double wi,double he,double de){  
    w = wi;  
    h = he;
    d=de; 
    vol=w*h*d; 
    }  
    //method to display the values  
    void display()
     {
     System.out.println("volume is"+vol);
    }  
   
    public static void main(String args[]){  
    Scanner sc = new Scanner(System.in);
    System.out.println("enter width");  
    double width = sc.nextDouble();
    System.out.println("enter height");
    double height = sc.nextDouble();
    System.out.println("enter depth");
    double depth = sc.nextDouble();
    box s1 = new box(width,height,depth);  
    //calling method to display the values of object  
    s1.display();  
  
   }  
}  