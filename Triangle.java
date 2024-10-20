public class Triangle extends Shape {
    private float side_1; // Considered as Base
    private float side_2; // Condisdered as Height
    private float side_3;

     // Accessor and Mutator for side_1
     public float getSide1(){
        return side_1;
    }
    public void setSide1(float side_1){
        this.side_1 = side_1;
    }

    // Accessor and Mutator for side_2
    public float getSide2(){
        return side_2;
    }
    public void setSide2(float side_2){
        this.side_2 = side_2;
    }

    // Accessor and Mutator for side_3
    public float getSide3(){
        return side_3;
    }
    public void setSide3(float side_3){
        this.side_3 = side_3;
    }

    // Perimeter for Triangle
    @Override public float CalculatePerimeter(){
        float Ptriangle = side_1 + side_2 + side_3;
        return Ptriangle;
    }

    // Area for Triangle
    @Override public float CalculateArea(){
        float Atriangle = (side_1 * side_2) / 2;
        return Atriangle;
    }
}
