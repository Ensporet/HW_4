package Ens_Console;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Param_inputArray<T> extends Param_input<T>{
    public Param_inputArray(Scanner sca, int maxArray) {
        super(sca);
        this.setMaxArray(maxArray);
    }

    private int maxArray = 1;

    protected void setMaxArray(int maxArray) {
        if(maxArray <= 0 ){this.maxArray = 1;}else
            this.maxArray = maxArray;
    }

    protected int getMaxArray() {
        return maxArray;
    }

    @Override
    public T Action() {
        return super.Action();
    }

    @Override
    protected abstract T isFormatTrue(String s);

    @Override
    protected abstract String getSystemColTrue();

    @Override
    protected abstract String getSystemColFalse();
    @Override
    protected abstract String getSystemCol();


    public ArrayList splitNumber(String s ){

        ArrayList<Integer> ret = new ArrayList<>();
        if(s == null || s.isEmpty() )return ret;

        char[] simbolArray = {'0','1','2','3','4','5','6','7','8','9'};
        char[] simbolArray0={'-','+'};
        char[] simbolArray1= {'.' , 'E'};
        char[] str = s.toCharArray();

        String number = "";

        for(int i = 0; i < str.length; i++){
        char c = str[i];

        if(isElementTrue(c,simbolArray)){//NUMBER>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        number += c;

        }else{
         if(isElementTrue(c,simbolArray0)){//+ - >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

            if(number.isEmpty() || (number.length() > 0 && str[i -1]== 'E')){number += c;}
            else {}


        }else{
        if(isElementTrue(c,simbolArray1)){// . E >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.


        }else{                              //other >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        }}}


        }








        // for(Integer sss : ret)
        //   System.out.println(sss);

        return ret;
    }





    public String correctNumber(String s){

    if(s == null || s.length() == 0){return null;}

        {
    int i = s.indexOf('.');
    if(i > -1 && i == (s.length() -1) ){
        return s.substring(0,i);
    }}

        {
            int i = s.indexOf("E-");
            if(i > -1 && i == (s.length() -1) ){
                return s.substring(0,i);
            }}
        {
            int i = s.indexOf("E");
            if(i > -1 && i == (s.length() -1) ){
                return s.substring(0,i);
            }}




        return s;
    }


    public  boolean isElementTrue(char ch , char[] ArrCh){

        for(char c : ArrCh){
            if(c == ch){return true;}

        }

        return false;
    }
}
