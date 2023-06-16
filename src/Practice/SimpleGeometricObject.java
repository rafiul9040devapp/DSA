package Practice;

import java.util.Date;

public class SimpleGeometricObject {
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated = new java.util.Date();

    public SimpleGeometricObject() {
        dateCreated = new java.util.Date();
    }

    public SimpleGeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

   public String toString(){
        return "Created on "+ dateCreated + "\ncolor: " + color+ " and filled: "+filled;
   }
}
