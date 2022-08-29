package ro.fasttrackit.lab5;

import java.util.Arrays;
import java.util.Random;

public class Teme {
    public static void main(String[] args) {
        System.out.println(sumOfArray(new int[]{1, 2, 3, 4}));
        System.out.println(sumOfOdd(new int[]{1, 2, 3, 4}));
        System.out.println(Arrays.toString(compareInt(new int[]{1, 2, 3, 4}, 0)));
        auctionTarget(50);
        auctionTargetWithLimit(40,4);
        punctDespartit("A.fost.odata.ca.niciodata.un.Gigel");
        // some content

    }

    public static int sumOfArray(int [] sir){
        int sum =0;
        for(int a : sir){
            sum=sum+a;
        }
        return sum;
    }

    public static int sumOfOdd(int [] sir){
        int sum =0;
        for(int a : sir){
            if (a % 2 !=0)
            sum=sum+1;
        }
        return sum;
        // some later comment
    }

    public static int[] compareInt(int [] sir, int maiMare){
        int count=0;
        for(int a : sir){
            if (a < maiMare)
                count=count+1;
        }
        int [] sum = new int[count];
        for (int k : sir) {
            for (int i = 0; i < count; i++) {
                if (k > maiMare) {
                    sum[i] = k;
                }
            }
        }
        return sum;
    }

    public static void auctionTarget(int target){
        Random random = new Random();
        int sum =0;
        while (sum < target){
            sum = sum + random.nextInt(10);
            System.out.println(sum);
        }
        System.out.println("Success!!");

    }

    public static void auctionTargetWithLimit(int target, int limit){
        int sum =0;
        Random random = new Random();
        for (int i=0;i<limit;i++){
            sum = sum + random.nextInt(10);
            System.out.println(sum);
        }
        System.out.println("Success!");
    }

    public static void punctDespartit(String s){
        String [] a =s.split("\\.");
        for (String b:a){
            System.out.println(b);
        }
    }

}
