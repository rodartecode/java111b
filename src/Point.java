// 02/24/2019
// Jesse E Rodarte
// CS111B
// Assignment 8: Improved Circle Class

public class Point {
    private double x;
    private double y;

    public Point(double xValue, double yValue)
    {
        x = xValue;
        y = yValue;
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    public Point() {
        this(0, 0);
    }

    public void setX(double xValue)
    {
        x = xValue;
    }

    public double getX()
    {
        return x;
    }

    public void setY(double xValue)
    {
        y = xValue;
    }

    public double getY()
    {
        return y;
    }

    public boolean equals(Point otherPoint)
    {
        return (this.x == otherPoint.x) && (this.y == otherPoint.y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(Point p) {
        return Math.sqrt(
                (p.getY() - y) * (p.getY() - y) +
                        p.getX() - x) * (p.getX() - x);
    }
}
