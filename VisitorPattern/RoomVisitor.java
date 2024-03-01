package VisitorPattern;

public interface RoomVisitor {
    public void visit(SingleRoom singleRoomObj);
    public void visit(DoubleRoom doubleRoomObj);
    public void visit(DeluxRoom deluxRoomObj);
    
}
//It is in a is-a realtionship with the RoomPricingVisitor and RoomMaintaineneceVisitor