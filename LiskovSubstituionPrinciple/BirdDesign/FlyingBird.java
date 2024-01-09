package LiskovSubstituionPrinciple.BirdDesign;

public interface FlyingBird extends Bird{
    public default void fly(){
        System.out.println("I can fly");
    }
}
