package edu.aqa.lesson3.thirdtask;

public class LensLineStep implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Building part - lens");
        return new Lens();
    }
}
