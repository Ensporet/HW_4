package Ens_Console;

import java.util.Scanner;

public abstract class Param_inputNamber extends Param_input<Number> {
    public Param_inputNamber(Scanner sca) {
        super(sca);
    }


    @Override
    public Number Action() {
        return super.Action();
    }

    @Override
    protected Number isFormatTrue(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        try {
            return Integer.valueOf(s);
        } catch (NumberFormatException e) {
            try {
                return Double.valueOf(s);
            } catch (NumberFormatException a) {
                try {
                    return Long.valueOf(s);
                } catch (NumberFormatException d) {
                    try {
                        return Float.valueOf(s);
                    } catch (NumberFormatException f) {


                    }
                }
            }
        }

        return null;
    }

    ;

    @Override
    protected abstract String getSystemColTrue();

    @Override
    protected String getSystemColFalse() {
        return "Number is not correct !";
    }

    @Override
    protected abstract String getSystemCol();
}
