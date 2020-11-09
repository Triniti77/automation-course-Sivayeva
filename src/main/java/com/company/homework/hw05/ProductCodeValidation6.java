package com.company.homework.hw05;

public class ProductCodeValidation6 {
    public static void main(String[] args) {
         String proCode = "AX6BYU56UX6CV6BNT7NM 287430";
         if (validation(proCode)){
             System.out.println("код правильный");
         } else {
             System.out.println("неправильный");
         }

    }

    public static boolean validation(String val){
        int numb = 0;
        int space = 0;
        String number1 = "", number2 = "", number3 = "";
        String number4 = "";

        for (int f = 0; f < val.length(); f++){
            char sumb = val.charAt(f);

            if (!(sumb >= 'A' && sumb <= 'Z') && !(sumb >= '0' && sumb <= '9') && sumb != ' '){
                return  false;
            }
            if (sumb >= '0' && sumb <= '9'){
                if(space < 1){
                    numb=numb+1;
                    if (numb>6){
                        return false;
                    }
                    if (numb ==1 || numb == 2){
                        number1=number1+sumb;
                    } else if (numb ==3 || numb == 4){
                        number2 +=sumb;
                    } else if (numb == 5 || numb == 6){
                        number3 +=sumb;
                    }
                } else {
                    number4 = number4+sumb;
                }

            }
            if(sumb >= 'A' && sumb <= 'Z' && space >=1){
                return false;
            }
            if (sumb == ' '){
                space++;
                if (space > 1){
                    return false;
                }
            }
        }
        int inumber1 = Integer.parseInt(number1);
        int inumber2 = Integer.parseInt(number2);
        int inumber3 = Integer.parseInt(number3);
        int inumber4 = Integer.parseInt(number4);

        boolean resalt = inumber1*inumber2*inumber3==inumber4;
        return resalt;
    }
}
