package edu.aqa.lesson3.thirdtask;

public class LintelLineStep implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Building part - lintel");
        return new Lintel();
    }
}
