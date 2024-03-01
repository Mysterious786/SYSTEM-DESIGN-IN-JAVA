package VisitorPattern;

public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoomObj){
        System.out.println("Prices computation logic of SingleRoom");
        singleRoomObj.roomPrice = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Prices computtion logic of DoubleRoom");
        doubleRoomObj.roomPrice = 1500;
        
    }

    @Override
    public void visit(DeluxRoom deluxRoomObj) {
        System.out.println("Prices computtion logic of DeluxRoom");
        deluxRoomObj.roomPrice = 2500;
        
    }


    
}
