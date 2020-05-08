package edu.aqa.lesson3.thirdtask;

public class CorpusLineStep implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Building part - corpus");
        return new Corpus();
    }
}
