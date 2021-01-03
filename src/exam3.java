
import com.sun.beans.editors.DoubleEditor;

import java.util.Scanner;

public class exam3 {
    public static double mean(double[] x){
        double total=0;
        for(double i:x){
            total=total+i;
        }
        double aver=total/x.length;
        return aver;
    }
    public static double deviation(double[]x){
        double total=0;
        for(double i:x){
            total=total+(i-mean(x))*(i-mean(x));
        }
        total=Math.sqrt((total)/(x.length-1));
        return total;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size=10;
        System.out.println("Enter ten numbers: ");
        double[] list1 =new double[size];
        int[] list2 =new int[size];
        for(int i=0;i<10;i++){
            list1[i]=input.nextDouble();
        }

        System.out.println(String.format("%.2f",mean(list1)));
        System.out.println(String.format("%.5f",deviation(list1)));



    }
}