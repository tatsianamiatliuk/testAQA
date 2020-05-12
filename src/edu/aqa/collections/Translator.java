package edu.aqa.collections;

public class Translator implements ITranslate {

    @Override
    public String translate(String source, ITranslateTable table) {
        StringBuilder sb = new StringBuilder(source.length()*2);
        for(char ch: source.toCharArray()){
            sb.append(table.charTable(ch));
        }
        return sb.toString();
    }

}
