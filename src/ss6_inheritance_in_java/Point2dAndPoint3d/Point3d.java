package ss6_inheritance_in_java.Point2dAndPoint3d;

public class Point3d extends Point2d {
    private float z = 0.0f;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
    }
    public Point3d(float x,float y, float z){
        super(x, y);
        this.z=z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        return arr;
    }
}
