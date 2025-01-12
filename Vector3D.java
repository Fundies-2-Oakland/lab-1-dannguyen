public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getZ() {
        return z;
    }

    //3
    public String toString() {
        return "(" + String.format("%.2f", x) + "," + String.format("%.2f", y) + "," + String.format("%.2f", z) + ")";
    }

    //4
    double getMagnitude() {
        return Math.abs(Math.sqrt(x * x + y * y + z * z));
    }

    //5
    Vector3D getNormalizingVector() {
        if (getMagnitude() == 0) {
            throw new IllegalStateException();
        }

        return new Vector3D(x / getMagnitude(), y / getMagnitude(), z / getMagnitude());
    }

    //6
    Vector3D addVector(Vector3D vector) {
        return new Vector3D(x + vector.x, y + vector.y, z + vector.z);
    }

    //7
    Vector3D mulVector(int c) {
        return new Vector3D(x * c, y * c, z * c);
    }

    //8
    double dotProduct(Vector3D vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    //9
    double angleBetween(Vector3D vector) {
        if ((Math.abs(dotProduct(vector))) == 0.0) {
            throw new IllegalStateException();
        }
        return Math.acos((dotProduct(vector)) / Math.abs(dotProduct(vector)));
    }

    //10

}
