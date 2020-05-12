package edu.aqa.collections;

public class TableLatToRus implements ITranslateTable{

    @Override
    public String charTable(char ch) {
        switch (ch){
            case 'E': return "Ё";
            case 'S': return "C";
            case 'H': return "Ь";
            case 'U': return "У";
            case 'A': return "А";
            case 'Z': return "З";
            case 'K': return "К";
            case 'C': return "Ч";
            case 'I': return "И";
            case 'B': return "Б";
            case 'V': return "В";
            case 'G': return "Г";
            case 'D': return "Д";
            case 'Y': return "Й";
            case 'L': return "Л";
            case 'M': return "М";
            case 'N': return "Н";
            case 'O': return "О";
            case 'P': return "П";
            case 'R': return "Р";
            case 'T': return "Т";
            case 'F': return "Ф";
            default: return String.valueOf(ch);
            }
    }
}
