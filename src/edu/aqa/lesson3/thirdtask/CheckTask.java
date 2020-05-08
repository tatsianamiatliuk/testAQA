package edu.aqa.lesson3.thirdtask;

public class CheckTask {
    public static void main(String[] args){
        LensLineStep lensLineStep = new LensLineStep();
        LintelLineStep lintelLineStep = new LintelLineStep();
        CorpusLineStep corpusLineStep = new CorpusLineStep();

        AssemblyLine assemblyLine = new AssemblyLine(lensLineStep.buildProductPart(),lintelLineStep.buildProductPart(), corpusLineStep.buildProductPart());
        assemblyLine.assembleProduct(new ProductGlass());

    }
}
