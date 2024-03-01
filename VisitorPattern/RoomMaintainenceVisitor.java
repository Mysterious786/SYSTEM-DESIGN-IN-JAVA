package VisitorPattern;

public class RoomMaintainenceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("Permorming maintainence of SingleRoom");

    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Permorming maintainence of DoubleRoom");

    }

    @Override
    public void visit(DeluxRoom deluxRoomObj) {
        System.out.println("Permorming maintainence of DeluxRoom");

    }

}
