package lab_7;

public class Cube implements GeometricBody {
    float length = 7;

    public double getSurface() {
        return 6*length*length;
    }


    public double getVolume() {
        return length*length*length;
    }
}
