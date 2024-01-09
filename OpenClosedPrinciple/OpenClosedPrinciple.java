package OpenClosedPrinciple;
interface VolumeCalculate {
    double getVoulme();
}

class Cuboid implements VolumeCalculate {
    private double length;
    private double breadth;
    private double height;

    Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public double getVoulme() {
        return length * breadth * height;
    }
}

class Sphere implements VolumeCalculate {

    private double radius;

    Sphere(double radius) {

        this.radius = radius;
    }

    @Override
    public double getVoulme() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(2, 3, 4);
        double volCuboid = c.getVoulme();
        Sphere s = new Sphere(3);
        double volSphere = s.getVoulme();
        System.out.println(volSphere);
        System.out.println(volCuboid);

    }

}
