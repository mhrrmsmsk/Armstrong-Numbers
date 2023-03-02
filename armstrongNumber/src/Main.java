import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in;
        System.out.println("how many numbers do you want to enter:");
        in = input.nextInt();

        for (int i =0;i<in;i++){
            List<Integer>number=new ArrayList<>();
            System.out.println("number "+(i+1)+":");
            int num = input.nextInt();
            int a = num/100;
            int b= num/10%10 ;
            int c = num%10;
            if (num==a*a*a || num==(a*a*a)+(b*b*b) || num==(a*a*a)+(b*b*b)+(c*c*c)){
                System.out.println("number "+(i+1)+":"+"=>"+"YES");
            }else       System.out.println("number "+(i+1)+":"+"=>"+"NO");
      number.add(num);
        }
    }
}