import java.util.*;
public class popsicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter number of siblings : ");
        x = sc.nextInt();
        System.out.println("Enter number of popsicles : ");
        y = sc.nextInt();
        if(y%x==0){
            System.out.println("Give away.");
        }else{
            System.out.println("Eat them yourself.");
        }
    }
}