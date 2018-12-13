package Ens_Console;


import java.util.Scanner;

public abstract class Param_input<T>  extends Param_default<T>{


    public Param_input(Scanner sca){
        this.setScan(sca);
    }


    @Override
    public T Action() {
         super.Action();

        while (true){
            String str = this.getScan().nextLine();
                if(getCANCEL() != null && !getCANCEL().isEmpty() && getCANCEL().equals(str)){//Cancel
                    this.PrinStri(this.getSystemColCancel());
                    return null;
                }


            T t = isFormatTrue(str);
                if(t != null){
                    this.PrinStri(getSystemColTrue());
                    return t;
                }else { this.PrinStri(this.getSystemColFalse());}
        }



    }



    private Scanner scan ;

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    protected abstract T isFormatTrue(String s);

    protected abstract String getSystemColTrue();
    protected  abstract String getSystemColFalse();
    protected String getSystemColCancel(){return "<CANCEL>";}


    private static String CANCEL = "x";

    public static String getCANCEL() {
        return CANCEL;
    }

    public static void setCANCEL(String CANCEL) {
        Param_input.CANCEL = CANCEL;
    }




}


