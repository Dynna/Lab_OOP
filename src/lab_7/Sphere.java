package lab_7;

public class Sphere implements GeometricBody {
    float pi = (float) 3.14;
    int radius = 5;

    public double getSurface() {
        return 4*pi*(radius^2);
    }


    public double getVolume() {
        return (4*pi*(radius^2))/3;
    }
}
