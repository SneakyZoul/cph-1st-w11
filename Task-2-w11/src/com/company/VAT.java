
package com.company;

public class VAT {
    final static int PRCVAT = 25;
    public double VAT(double number){
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}
