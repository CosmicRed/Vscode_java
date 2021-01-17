import java.util.Scanner;
public class Practice {
    public static void main(String[]args){
           System.out.println("Distance (in km): ");
           Scanner disTance = new Scanner(System.in);
           int dis = disTance.nextInt();
           System.out.println(dis);
           System.out.println("Conversion in meters: "+ dis*1000);
    }
}
