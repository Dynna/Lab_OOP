package lab_1;

class Monitor {
    private String color;
    private float length;
    private float width;
    private String resolution;
    Monitor(String color, float length, float width, String resolution){
        this.color = color;
        this.length = length;
        this.width = width;
        this.resolution = resolution;
    }

    private String getColor() {
        return color;
    }

    private float getLength() {
        return length;
    }

    private float getWidth() {
        return width;
    }

    private String getResolution() {
        return resolution;
    }

    String accessMonitorProperties() {
        return ("The monitor has color: " + this.getColor() + "\nLength: " + this.getLength() +
                "\nWidth: " + this.getWidth() + "\nResolution: " + this.getResolution());
    }
}
