public class Square {


    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    public int calculateArea(int length){
       int area = length * side;
       return area;
    }
}
