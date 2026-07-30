import java.util.Scanner;
public class Tank{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter water level percentage(0-100%)");
        double a=sc.nextDouble();
        if(a<0||a>100){
            System.out.println("Invalid input!");
        }
        else{
            if(a==0){
                System.out.println("Tank is empty!");
            }
            else if(a>0 && a<=25){
                System.out.println("Tank is low!");
            }
            else if(a>25 && a<=50){
                System.out.println("Tank is medium!");
            }
            else if(a>50 && a<100){
                System.out.println("Tank is high!");
            }
            else {
                System.out.println("Tank is full!");
            }
        }
        sc.close();
    }
}