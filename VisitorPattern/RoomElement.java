//Basically a VisitorPattern has two things one is element and other is visitor
//Lets createa RoomElement interface
package VisitorPattern;

public interface RoomElement {
    public void accept(RoomVisitor visitor);
    
}
//RoomElement makes a is-a realtionship with different types of rooms
//1.SingleRoom
//2.DoubleRoom
//3.DeluxRoom

