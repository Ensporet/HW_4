import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HW_Class {


    public static void riderNumber(int iteration ){

if(iteration > 0){
    for(int i = 1 ; i <= iteration ; i ++){
        System.out.println( i );}}
        else {
    for(int i = -1 ; i >= iteration ; i --){
        System.out.println( i );

    }}








    }

    public static void Draw_Rectangle(int number , String symbol){
      if(number < 1)number = 1;
        Draw_Rectangle(number,number,symbol);

    }
    public static void Draw_Rectangle(int x , int y , String symbol){

        if(symbol == null)symbol = "+";
        if(x  < 1)x = 1;
        if(y  < 1)y = 1;


        String rec = "";

        while (y > 0){
        y--;
        rec += "\n";
        int x0 = x;
        while (x0 > 0) {
        rec += symbol;

        x0--;

        }
        }

        System.out.println(rec);

    }



}
