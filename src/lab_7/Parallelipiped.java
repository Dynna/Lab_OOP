package lab_7;

public class Parallelipiped implements GeometricBody {
    float depth = 4;
    float width = 5;
    float height = 6;

    public double getSurface() {
        return 2*(width*height + height*depth + width*depth);
    }


    public double getVolume() {
        return depth*width*height;
    }
}
