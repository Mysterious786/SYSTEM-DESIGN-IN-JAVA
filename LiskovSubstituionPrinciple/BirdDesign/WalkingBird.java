package LiskovSubstituionPrinciple.BirdDesign;

public interface WalkingBird extends Bird{
    public default void walk(){
        System.out.println("I can Walk");
    }
}
