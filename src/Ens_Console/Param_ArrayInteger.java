package Ens_Console;


import java.util.ArrayList;
import java.util.Scanner;

public abstract class Param_ArrayInteger extends Param_input<ArrayList<Integer>> {

    public Param_ArrayInteger(Scanner sca, int maxArray) {


        super(sca);
        this.setMaxArray(maxArray);
    }

    private int maxArray = 1;

    protected void setMaxArray(int maxArray) {
        if (maxArray <= 0) {
            this.maxArray = 1;
        } else this.maxArray = maxArray;
    }

    protected int getMaxArray() {
        return maxArray;
    }

    @Override
    public ArrayList<Integer> Action() {
        return super.Action();


    }

    @Override
    protected ArrayList<Integer> isFormatTrue(String s) {

        if (s == null || s.isEmpty()) {
            return null;
        }


        ArrayList<Integer> ret;

        try {
            ret = this.splitInteger(s);
        } catch (NumberFormatException e) {
            return null;
        }

        if (ret.size() != this.getMaxArray()) {
            return null;
        }


        return ret;
    }

    @Override
    protected abstract String getSystemColTrue();

    @Override
    protected String getSystemColFalse() {
        return "Invalid value Integer Array \n *all symbol mast to be number Integer \n *long array mast to be " + getMaxArray();
    }

    @Override
    protected abstract String getSystemCol();


    public ArrayList<Integer> splitInteger(String s) {

        ArrayList<Integer> ret = new ArrayList<>();
        if (s == null || s.isEmpty()) return ret;

        char[] simbolArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] simbolArray0 = {'-', '+'};
        char[] str = s.toCharArray();

        String ch = "";


        for (char c : str) {

            if (isElementTrue(c, simbolArray)) {// numbers

                ch += c;

            } else { // is not number

                if (isElementTrue(c, simbolArray0)) {// + -
                    if (ch.isEmpty()) {// number is empty
                        ch += c;
                    } else {//number is not empty
                        if (ch.length() == 1 && isElementTrue(ch.charAt(0), simbolArray0)) {//and have 1 el and this element + or -
                            ch = "" + c;
                        } else {// other symbol of number
                            ret.add(Integer.valueOf(ch));//save old number
                            ch = "" + c;

                        }
                    }
                } else {// other symbol...

                    if (ch.length() == 1 && isElementTrue(ch.charAt(0), simbolArray0)) {// one symbol + or -
                        ch = "";
                    } else {
                        if (!ch.isEmpty()) {//number is not empty , save old number
                            ret.add(Integer.valueOf(ch));
                            ch = "";

                        }

                    }
                }

            }

        }
        if (ch.length() > 1) {
            ret.add(Integer.valueOf(ch));
        } else {
            if (ch.length() == 1 && !isElementTrue(ch.charAt(0), simbolArray0)) {
                ret.add(Integer.valueOf(ch));
            }

        }
        return ret;
    }


    public boolean isElementTrue(char ch, char[] ArrCh) {

        for (char c : ArrCh) {
            if (c == ch) {
                return true;
            }

        }

        return false;
    }


}
