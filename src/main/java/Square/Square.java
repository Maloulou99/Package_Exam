package Square;
class Square extends Shape {
    private int width;
    public Square(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public double getArea() {
        return width * width;
    }

}
