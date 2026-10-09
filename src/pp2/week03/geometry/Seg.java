package pp2.week03.geometry;

public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = new Point(startPoint);
        this.endPoint = new Point(endPoint);
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this.startPoint = new Point(x1, y1);
        this.endPoint = new Point(x2, y2);
    }

    public Point getP1() { return startPoint; }
    public void setP1(Point p) { this.startPoint = p; }

    public Point getP2() { return endPoint; }
    public void setP2(Point p) { this.endPoint = p; }

    public void translate(float dX, float dY) {
        startPoint.translate(dX, dY);
        endPoint.translate(dX, dY);
    }

    public float length() {
        return startPoint.distance(endPoint);
    }

    public boolean equals(Segment other) {
        if (other == null) return false;
        return startPoint.equals(other.getP1()) && endPoint.equals(other.getP2());
    }

    public float getSlope() {
        float deltaY = endPoint.getY() - startPoint.getY();
        float deltaX = endPoint.getX() - startPoint.getX();
        return deltaY / deltaX;
    }

    public float getIntercept() {
        return startPoint.getY() - (getSlope() * startPoint.getX());
    }

    public boolean isOnLine(Point point) {
        float calcY = (getSlope() * point.getX()) + getIntercept();
        return Math.abs(calcY - point.getY()) < 0.0001f;
    }

    public boolean isOnSegment(Point point) {
        if (!isOnLine(point)) {
            return false;
        }

        float minX = Math.min(startPoint.getX(), endPoint.getX());
        float maxX = Math.max(startPoint.getX(), endPoint.getX());
        float minY = Math.min(startPoint.getY(), endPoint.getY());
        float maxY = Math.max(startPoint.getY(), endPoint.getY());

        return point.getX() >= minX && point.getX() <= maxX &&
               point.getY() >= minY && point.getY() <= maxY;
    }
}
