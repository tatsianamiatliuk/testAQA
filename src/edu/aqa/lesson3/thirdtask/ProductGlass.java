package edu.aqa.lesson3.thirdtask;

public class ProductGlass implements IProduct{

    private Lintel lintel;
    private Lens lens;
    private Corpus corpus;

    @Override
    public void installFirstPart(IProductPart firstPart) {
        System.out.println("Installing lens");
        lens = (Lens) firstPart;
    }

    @Override
    public void installSecondPart(IProductPart secondPart) {
        System.out.println("Installing lintel");
        lintel = (Lintel) secondPart;
    }

    @Override
    public void installThirdPart(IProductPart thirdPart) {
        System.out.println("Installing corpus");
        corpus = (Corpus) thirdPart;
    }
}
