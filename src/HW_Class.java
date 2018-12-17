

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



    public static float getMax(float number , float number0 ){

       if(number < number0){return number0;}

       return number;

    }

    public static int getMax(int number , int number0 ){

        if(number < number0){return number0;}

        return number;

    }
    public static float getMax(float number , int number0 ){

        if(number < number0){return number0;}

        return number;

    }
    public static float getMax(int number , float number0 ){

        if(number < number0){return number0;}

        return number;

    }




    public static void riderNumberRecursion(int iteration, int Startnumber) {


        if (iteration > 0 && Startnumber < iteration) {
            Startnumber++;
            System.out.println("number : " + Startnumber);
            riderNumberRecursion(iteration, Startnumber);
        } else {
            if (iteration < 0 && Startnumber > iteration) {
                Startnumber--;
                System.out.println("Number : " + Startnumber);
                riderNumberRecursion(iteration, Startnumber);
            }

        }}


        public static void Draw_RectangleRecursion ( int x , int y){

        if(y > -1){
        String s = "";
        for(int i = x ; i > 0 ; i--){
            s += "+";

        }
        System.out.println(s);
        Draw_RectangleRecursion(x , (y - 1));
        }



        }
    }