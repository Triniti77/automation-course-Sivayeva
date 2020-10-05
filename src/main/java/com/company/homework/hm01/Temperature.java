package homework.hw01;

public class Temperature {
    public static void main(String args[]){
        double degreesC = 100.0; // градусы цельсія
        // Цельсий х 1,8 + 32 = Фаренгейт
        //Celsius = 5/9 (F - 32) Kelvin = C + 273.16
        double resultF = degreesC * 9.0/5 + 32; // цельсія в фаренгейта
        System.out.println(resultF);

        double degreesF = resultF;
        double resultC = 5.0/9 * (degreesF - 32);
        System.out.println(resultC);

        degreesC = resultC;
        double resultK = degreesC + 273.16;
        System.out.println(resultK);

    }
}
