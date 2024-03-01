package VisitorPattern;

public class Main {
    public static void main(String[] args) {
        RoomElement singleRoomObj = new SingleRoom();
        RoomElement doubleRoomObj = new DoubleRoom();
        RoomElement deluxRoomObj = new DeluxRoom();

        //Performing an operation of the objects
        RoomVisitor pricingVisitorObj = new RoomPricingVisitor();
        singleRoomObj.accept(pricingVisitorObj);
        System.out.println(((SingleRoom)singleRoomObj).roomPrice);
        doubleRoomObj.accept(pricingVisitorObj);
        System.out.println(((DoubleRoom)doubleRoomObj).roomPrice);
        deluxRoomObj.accept(pricingVisitorObj);
        System.out.println(((DeluxRoom)deluxRoomObj).roomPrice);

        RoomVisitor maintainenceObj = new RoomMaintainenceVisitor();
        singleRoomObj.accept(maintainenceObj);
        doubleRoomObj.accept(maintainenceObj);
        deluxRoomObj.accept(maintainenceObj);
    }
    
}
