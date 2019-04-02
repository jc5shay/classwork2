
public class Shape {


    private String color;
    private String name;

    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public String color(){
        return "All shapes have a color";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
