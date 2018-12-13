package Ens_Console;

import javax.swing.*;

public  abstract class Param_default<T> implements Param_null<T> {


    protected  abstract String getSystemCol();
    protected void PrinStri(String s){
        if(s != null && !s.isEmpty()){
            System.out.println(s);
        }

    }


    @Override
    public T Action() {
        PrinStri(getSystemCol());

        return null;
    }
}
