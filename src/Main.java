import Ens_Console.Param_ArrayInteger;
import Ens_Console.Param_Float;
import Ens_Console.Param_Integer;


import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);







// Tack 01--------------------------------------------------------------------------
        {
            System.out.println("Tack 1");
            new Param_Integer(scanner) {
                @Override
                protected String getSystemColTrue() {
                    return "";
                }

                @Override
                protected String getSystemCol() {
                    return "Enter the number of the function argument (Integer) :";
                }

                @Override
                public Integer Action() {

                    Integer i = super.Action();
                    if (i != null) {
                        HW_Class.riderNumber(i);
                        System.out.println("Iteration done");
                    }


                    return i;

                }
            }.Action();
        }
//Tack02-------------------------------------------------------------------------
        {

            System.out.println("Tack 2");
            new Param_ArrayInteger(scanner, 2) {

                @Override
                protected ArrayList<Integer> isFormatTrue(String s) {
                    ArrayList<Integer> i =  super.isFormatTrue(s);

                    if(i != null){
                        for(Integer in : i){
                            if(in < 1){
                            return null;}
                        }
                    }else {return null;}

                    return i;
                }

                @Override
                protected String getSystemColFalse() {
                    return super.getSystemColFalse() + "\n *Value mast to be > 0";
                }

                @Override
                public ArrayList<Integer> Action() {
                    ArrayList<Integer>  arr = super.Action();

                    if(arr != null){
                        HW_Class.Draw_Rectangle(arr.get(0),arr.get(1),"+");
                    }


                    return arr;
                }

                @Override
                protected String getSystemColTrue() {
                    return "Draw a rectangle...";
                }

                @Override
                protected String getSystemCol() {
                    return"Enter two values Integer for the height and width of the rectangle. (number)(otherSymbol)(number) :";
                }
            }.Action();


        }
//Tack03-------------------------------------------------------------------------
        {
            System.out.println("Tack 3");
            new Param_Integer(scanner) {
                @Override
                protected String getSystemColFalse() {
                    return super.getSystemColFalse() + "\n *Value mast to be > 0";
                }

                @Override
                public Integer Action() {
                    Integer i = super.Action();
                        if(i == null || i < 1){return null;}
                    HW_Class.Draw_Rectangle(i,"+");
                        return i;
                }

                @Override
                protected String getSystemColTrue() {
                    return "Draw a rectangle...";
                }

                @Override
                protected String getSystemCol() {
                    return "Enter parameter Integer :";
                }
            }.Action();}
//Tack04-------------------------------------------------------------------------
        {
            System.out.println("Tack 4");


        }
    }
}
