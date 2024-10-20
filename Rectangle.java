public class Rectangle extends Shape {
    private float length;
    private float width;

    // Accessor and Mutator for length
    public float getLength(){
        return length;
    }
    public void setLength(float length){
        this.length = length;
    }

    // Accessor and Mutator for width
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width = width;
    }

    // Perimeter for Rectangle
    @Override public float CalculatePerimeter(){
        float Prectangle = 2 * (length + width);
        return Prectangle;
    }

    // Area for Rectangle
    @Override public float CalculateArea(){
        float Arectangle = length * width;
        return Arectangle;
    }
}
