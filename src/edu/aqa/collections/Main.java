package edu.aqa.collections;
/*
Написать программу транслитератор из русского в английский. (не переводчик, а именно переписЬку русского слова английскими буквами)
 */

public class Main {
    public static void main (String[] args){
        Translator testString = new Translator();
        TableRusToLat tableRusToLat = new TableRusToLat();
        TableLatToRus tableLatToRus = new TableLatToRus();
        String resultToLat;
        String resultToCyr;

        resultToLat = testString.translate("РУССКИЙ ЯЗЫК", tableRusToLat);
        resultToCyr = testString.translate("RUSSKIY YAZIHK", tableLatToRus);

        System.out.println("Кириллица на латиницу - " + resultToLat);
        System.out.println("Латиница на кириллицу - " + resultToCyr);

    }

}
