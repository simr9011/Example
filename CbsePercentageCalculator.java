package com.company;
import java.util.Scanner;

public class CbsePercentageCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks in english");
        int eng= sc.nextInt();
        System.out.println("enter marks in maths");
        int math=sc.nextInt();
        System.out.println("enter marks in history");
        int hist=sc.nextInt();
        System.out.println("enter marks in geography");
        int geo=sc.nextInt();
        System.out.println("enter marks in hindi");
        int hindi=sc.nextInt();
        System.out.println("enter total marks");
        float total=sc.nextFloat();
        float avg=(eng+math+hist+geo+hindi)/(total*5);
        float per=avg*100;
        System.out.println("percentage"+per);
    }
}
