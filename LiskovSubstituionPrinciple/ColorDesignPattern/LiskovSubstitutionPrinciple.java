package LiskovSubstituionPrinciple.ColorDesignPattern;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        IColor color = new Blue();
        color.getColor();
    }
}
