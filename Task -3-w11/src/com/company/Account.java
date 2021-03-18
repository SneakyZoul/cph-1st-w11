package com.company;

public class Account {
    private String Transaction_date =" 1/3/09/ 14:44";
    private String Product = "Product1";
    private int Price = 1200;
     private String Payment_Type = "visa";
    private long Card_Number = 4593781145107322l;
    private String Name = "Gouya";
    private  String City = "Echuca";
    private String  State = "Victoria";
    private String Country = "Australia";
   private String Account_Created = "9/25/05 21:13";
   private String Last_Login = "1/3/09 14:22";
    private double lat = -36.1333333;
     private  double Long = 144.75;


     public Account(String Name, String Payment_Type, long Card_Number, String Country)
     {
         this.Name = Name;
         this.Payment_Type = Payment_Type;
         this.Card_Number = Card_Number;
         this.Country = Country;
     }

     //JEg har fundet algoritmen på nettet og kunne ikke få den til at virke så spørge time ;) 
    public static boolean Card_Number(String Card_Number)
    {
        int sum = 0;
        boolean alternate = false;
        for (int i = Card_Number.length() - 1; i >= 0; i--)
        {
            int n = Integer.parseInt(Card_Number.substring(i, i + 1));
            System.out.println(n);
            if (alternate)
            {
                n *= 2;
                if (n > 9)
                {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        System.out.println(Card_Number);
        return (sum % 10 == 0);
    }





    public long getCard_Number() {
        return Card_Number;
    }

    public void setCard_Number(long card_Number) {
        Card_Number = card_Number;
    }

    @Override
    public String toString() {
        return  "Account:" + '\n'+
                " Name: " + Name+ '\'' + '\n' +
                " Country: " + Country+ '\''+ '\n' +
                " Payment_Type: " + Payment_Type+ '\'' +'\n' +
                " Card_Number: " + Card_Number+ '\'';


    }
}
