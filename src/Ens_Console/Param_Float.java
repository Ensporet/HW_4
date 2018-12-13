package Ens_Console;

import java.util.Scanner;

public abstract class Param_Float extends Param_input<Float> {
    public Param_Float(Scanner sca) {
        super(sca);
    }

    @Override
    public Float Action() {
        return super.Action();
    }

    @Override
    protected Float isFormatTrue(String s) {

        if(s == null || s.isEmpty()){return null;}
        Float f ;

        try{f = Float.valueOf(s);}catch (NumberFormatException e){return null;}

        return f ;
    }

    @Override
    protected abstract String getSystemColTrue() ;

    @Override
    protected String getSystemColFalse() {
        return "Invalid value Float";
    }

    @Override
    protected abstract String getSystemCol() ;
}
