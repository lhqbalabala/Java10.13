
import com.sun.beans.editors.DoubleEditor;

import java.util.Scanner;

import java.util.*;

public class exam4 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the students sum :");
        int sum=input.nextInt();
        S list[]= new S[sum];
        for(int i=0;i<sum;i++){
            String k1=input.next();
            int k2=input.nextInt();
            list[i]=new S(k1,k2);
        }
        Arrays.sort(list);
        for(int i=0;i<sum;i++){
            System.out.println(list[i].x);
        }


    }
}