package ro.ulbs.proiectaresoftware.lab7.forms;

public class Form {
    private String color;
    private static int counter;


    public Form() {
        color = "white";
        counter++;
    }

    public Form(String color) {
        this.color = color;
        counter++;
    }

    public static String getInstanceCount() {
        return counter + "";
    }


    public int getCounter() {
        return counter;
    }
    public void setColor(String color) {}

    public float getArea() {
        return 0;
    }

    public String toString() {
        return "This form has the color " + color;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Form) {
            Form f = (Form) obj;
            if (this.color == null && f.color == null) {
                return true;
            } else if (this.color != null && f.color != null && this.color.compareTo(f.color) == 0) {
                return true;
            }
        }
        return false;
    }
}
