package com.amulya;

import java.util.Scanner;
public class BobsSales
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly sales : ");
        double sales = sc.nextDouble();

        double commissionRate=0.0;
        if(sales>=0 &&sales < 10000)
        {
            commissionRate = 5.0;
        }
        else if(sales>=10000 && sales<15000)
        {
            commissionRate = 10.0;
        }
        else if(sales>=15000 && sales < 18000)
        {
            commissionRate = 12.0;
        }
        else if(sales>=18000 && sales < 22000)
        {
            commissionRate = 15.0;
        }
        else if(sales >=22000 )
        {
            commissionRate = 16.0;
        }
        else
        {
            System.out.println("Sales cannot be negative!\nExiting...........");
            System.exit(1);
        }
        System.out.print("Enter the advanced pay : ");
        double advance = sc.nextDouble();
        double commission = commissionRate * sales / 100;
        double grossPay = commission - advance;
        System.out.println("Commission according to sales : $"+commission);
        if(grossPay > 0)
        {
            System.out.println("At the month end, you receive a check of $"+grossPay+" from the company.");
        }
        else if(grossPay<0)
        {
            System.out.println("At the month end, you owe $"+(grossPay*-1)+" to the company.");
        }
        else{
            System.out.println("No Pay Check/ No Debt");
        }

    }

}
