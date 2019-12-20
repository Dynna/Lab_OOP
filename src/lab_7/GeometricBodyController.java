package lab_7;

public class GeometricBodyController {
    static public double getMaxVolume(GeometricBody[] geometricBodies){
        double maxVolume = 0;
        for(int i = 0;i<geometricBodies.length;i++)
        {
            if( maxVolume < geometricBodies[i].getVolume())
            {
                maxVolume = geometricBodies[i].getVolume();
            }
        }
        return maxVolume;
    }

    static public double getMaxSurface(GeometricBody[] geometricBodies){
        double maxSurface = 0;
        for(int i = 0;i<geometricBodies.length;i++)
        {
            if( maxSurface < geometricBodies[i].getSurface())
            {
                maxSurface = geometricBodies[i].getSurface();
            }
        }
        return maxSurface;
    }
}
