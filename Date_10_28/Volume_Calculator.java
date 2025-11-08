package Date_10_28;

public class Volume_Calculator {
    double pi = 3.1415;
    double volCube(double side) {
        return side * side * side;
    }


    double volSphere(double radius) {
        return (4.0 / 3.0) * pi * Math.pow(radius, 3);
    }

    double volCylinder(double radius, double height) {
        return pi * Math.pow(radius, 2) * height;
    }

    public static void main(String[] args) {
        Volume_Calculator vc = new Volume_Calculator();
        double cubeRes = vc.volCube(4);
        double sphereRes = vc.volSphere(2);
        double cylRes = vc.volCylinder(1.00,2.00);
        System.out.println("Volume of Cube: "+ cubeRes);
        System.out.println("Volume of Sphere: "+ sphereRes);
        System.out.println("Volume of Cylinder: "+ cylRes);
        System.out.println(vc.pi);

    }

}
