package lab_7;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        Cube cube = new Cube();
        Parallelipiped parallelipiped = new Parallelipiped();

        GeometricBody[] geometricBodies = {sphere, cube, parallelipiped};

        System.out.println("The volume of the sphere is: " + sphere.getVolume());
        System.out.println("The volume of the cube is: " + cube.getVolume());
        System.out.println("The volume of the parallelepiped is: " + parallelipiped.getVolume());
        System.out.println("The biggest volume is: " + GeometricBodyController.getMaxVolume(geometricBodies));

        System.out.println("The surface of the sphere is: " + sphere.getSurface());
        System.out.println("The surface of the cube is: " + cube.getSurface());
        System.out.println("The surface of the parallelepiped is: " + parallelipiped.getSurface());
        System.out.println("The biggest surface is: " + GeometricBodyController.getMaxSurface(geometricBodies));
    }
}
