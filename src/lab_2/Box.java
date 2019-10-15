package lab_2;

class Box {
    float height;
    float width;
    float depth;
    Box() {
        this.height = 1;
        this. width = 1;
        this.depth =1;
    }
    Box(float value) {
        this.height = value;
        this.width = value;
        this.depth = value;
    }
    Box(float height, float width, float depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    float computeSurfaceArea(){
        return 2 * (height * width + width * depth + height * depth);
    }

    float computeVolume(){
        return height * width * depth;
    }
}
