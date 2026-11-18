package ss7_abstract_and_interface.InterfaceForColorable;

public class Shape {
    private String Colors="Red";
    private boolean filled=true;

    public Shape() {
    }

    public Shape(String colors, boolean filled) {
        Colors = colors;
        this.filled = filled;
    }

    public String getColors() {
        return Colors;
    }

    public void setColors(String colors) {
        Colors = colors;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape(Colors: "+Colors+",filled: "+filled+")";
    }
}
