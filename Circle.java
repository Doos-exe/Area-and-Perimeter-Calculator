public class Circle extends Shape {
    private float radius;

    // Accessor and Mutator for radius
    public float getRadius(){
        return radius;
    }
    public void setRadius(float radius){
        this.radius = radius;
    }

    // Perimeter for Circle
    @Override public float CalculatePerimeter(){
        float Pcircle = 2 * (float)Math.PI * radius;
        return Pcircle;
    }

    // Area for Circle
    @Override public float CalculateArea(){
        float Acircle = (float) Math.PI *(radius * radius); 
        return Acircle;
    }
}
