/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aniel.mathcalculator.command;

/**
 *
 * @author Aniel Bkiram Thapa
 */
public class MathFactory  {
    public static MathCommand get(String param){
        if(param.equals("+"))
        {
            return new AddCommand();
        }
        else if(param.equals("-"))
        {
            return new SubCommand();
        }
        else if (param.equals("x"))
        { return new ExitCommand();
        }
        else 
            return null;
            }}
    
