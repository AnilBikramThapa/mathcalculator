/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aniel.mathcalculator;

import com.aniel.mathcalculator.command.AddCommand;
import com.aniel.mathcalculator.command.MathCommand;
import com.aniel.mathcalculator.command.MathFactory;
import com.aniel.mathcalculator.command.SubCommand;
import java.util.Scanner;

/**
 *
 * @author Aniel Bkiram Thapa
 */
public abstract class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Scanner input=new Scanner(System.in);
       while (true){
        System.out.println("Enter the 1st number ");
        double x=input.nextDouble();
        System.out.println("(Enter the 2nd number");
        double y=input.nextDouble();
        System.out.println("enter + for add or - for sub");
     
       MathCommand cmd = MathFactory.get(input.next());
       
        if (cmd!=null){
            System.out.println(cmd.execute(x, y));
        }
            else{
            System.out.println("invalid input");
           
           
        }
      
      
    }
    }
}

