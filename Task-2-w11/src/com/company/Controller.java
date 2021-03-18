package com.company;

public class Controller   {
   public void Controller() {

       View view = new View();
       Dialog dialog = new Dialog();
       VAT vat = new VAT();

       double userIn = dialog.Dialog();
        double moms = vat.VAT(userIn);
       view.View(moms,view.MSG);
    }
}
