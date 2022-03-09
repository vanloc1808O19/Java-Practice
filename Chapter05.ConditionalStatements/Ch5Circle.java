/*
    A sample class illustrating the use of if statements.
    This can compute the area and circumference of a circle with given radius.
    If an invalid value is set for the radis, then INVALID_DIMENSION is returned 
    when getArea() or getCircumference() is called.
*/

public class Ch5Circle {
    // ------------------------------------
    // data members
    // ------------------------------------

    // constant for invalid radius
    public static final int INVALID_DIMENSION = -1;

    // radius of this circle
    private double radius;

    // ------------------------------------
    // constructor
    // ------------------------------------

    // construct a circle with the pased radius.
    public Ch5Circle(double r) {
        setRadius(r);
    }

    // ------------------------------------
    // public methods:
    // double getArea()
    // double getCircumference()
    // double getDiameter()
    // double getRadius()

    // void setRadius(double )
    // void setDiameter(double )
    // ------------------------------------

    /*
        return the area of this circle if it has a valid radius.
        return INVALID_DIMENSION if the radius is invalid.
    */
    public double getArea() {
        double result = INVALID_DIMENSION;

        if (isRadiusValid()) {
            result = Math.PI * radius * radius;
        }

        return result;
    }

    /*
        return the circumference of this circle if it has a valid radius.
        return INVALID_DIMENSION if the radius is invalid.
    */
    public double getCircumference() {
        double result = INVALID_DIMENSION;

        if (isRadiusValid()) {
            result = 2 * Math.PI * radius;
        }

        return result;
    }

    /*
        return the diameter of this circle if it has a valid radius.
        return INVALID_DIMENSION if the radius is invalid.
    */
    public double getDiameter() {
        double result = INVALID_DIMENSION;

        if (isRadiusValid()) {
            result = 2 * radius;
        }

        return result;
    }

    /*
        return the radius of this circle.
        return INVALID_DIMENSION if the radius is invalid.
    */
    public double getRadius() {
        return radius;
    }

    /*
        set the diameter of this circle.
    */
    public void setDiameter(double d) {
        if (d > 0) {
            setRadius(d / 2.00);
        } else {
            setRadius(INVALID_DIMENSION);
        }
    }

    /*
        set the radius of this circle.
    */
    public void setRadius(double r) {
        if (r > 0) {
            radius = r;
        } else {
            radius = INVALID_DIMENSION;
        }
    }

    // ------------------------------------
    // private methods:
    // boolean isRadiusValid()
    // ------------------------------------
    
    /*
        return true if the value set for radius is valid.
        return false otherwise.
    */
    private boolean isRadiusValid() {
        return radius != INVALID_DIMENSION;
    }
}