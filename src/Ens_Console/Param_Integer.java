package Ens_Console;

import java.util.Scanner;

public abstract class Param_Integer extends Param_input<Integer> {
    public Param_Integer(Scanner sca) {
        super(sca);
    }

    @Override
    protected Integer isFormatTrue(String s) {

        try {
            return Integer.valueOf(s);
        } catch (NumberFormatException e0) {
            return null;
        } catch (NullPointerException e1) {
            return null;
        }


    }


    @Override
    public Integer Action() {
        return super.Action();
    }

    @Override
    protected abstract String getSystemColTrue();

    @Override
    protected String getSystemColFalse() {
        return "Invalid value Integer";
    }

    @Override
    protected abstract String getSystemCol();
}
