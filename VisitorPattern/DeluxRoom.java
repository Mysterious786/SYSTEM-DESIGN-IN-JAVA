package VisitorPattern;

public class DeluxRoom implements RoomElement {
    public int roomPrice = 0;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
        // this refers to what type of an object is coming here
    }

}

