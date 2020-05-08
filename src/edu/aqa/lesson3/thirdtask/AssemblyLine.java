package edu.aqa.lesson3.thirdtask;

public class AssemblyLine implements IAssemblyLine{
    private Lens lens;
    private Lintel lintel;
    private Corpus corpus;

    public AssemblyLine(IProductPart lens, IProductPart lintel, IProductPart corpus) {
        this.lens = (Lens) lens;
        this.lintel = (Lintel) lintel;
        this.corpus = (Corpus) corpus;
    }

    @Override
    public IProduct assembleProduct(IProduct product) {

        System.out.println("Create product");

        product.installFirstPart(lens);
        product.installSecondPart(lintel);
        product.installThirdPart(corpus);

        System.out.println("Product is created");

        return product;
    }
}
