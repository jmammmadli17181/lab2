package pp2.week03.geometry;

public class Point {
    private float x;
    private float y;

    public Point() {
        this(0.0f, 0.0f);
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void translate(float deltaX, float deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public float distance(Point target) {
        float diffX = this.x - target.x;
        float diffY = this.y - target.y;
        return (float) Math.hypot(diffX, diffY);
    }

    public boolean equals(Point target) {
        if (target == null) return false;
        return Float.compare(this.x, target.x) == 0 && Float.compare(this.y, target.y) == 0;
    }
}