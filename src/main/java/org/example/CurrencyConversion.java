package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */
public class CurrencyConversion
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double euros,rate, conversion;


        System.out.print( "How many euros are you exchanging? " );
        euros = input.nextDouble();
        System.out.print( "What is the exchange rate? " );
        rate = input.nextDouble();

        conversion = euros*rate;
        System.out.println(String.format("%.0f", euros)+" euros at an exchange rate of "+rate+" is"+"\n"+String.format("%.2f", conversion)+ " U.S. dollars.");

    }
}
