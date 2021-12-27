package BT_triangle;

public class Triangle {
    private static int edgeA;
    private static int edgeB;
    private static int edgeC;

    public Triangle() {
    }

    public static String compareTriangle(int edgeA, int edgeB, int edgeC){
        if(edgeA <= 0 || edgeB <= 0 || edgeC <= 0 ||
                Math.abs(edgeA) > (Math.abs(edgeB)+Math.abs(edgeC)) ||
                Math.abs(edgeB) > (Math.abs(edgeA)+Math.abs(edgeC)) ||
                Math.abs(edgeC) > (Math.abs(edgeB)+Math.abs(edgeA))){
            return "Not a triangle!";
        }else if(edgeA == edgeB){
            if(edgeB == edgeC){
                return "A equilateral triangle";
            }else
                return "A isosceles triangle";
        }else if(edgeB == edgeC || edgeA == edgeC) {
            return "A isosceles triangle";
        }else
            return "A normal triangle";
    }
}
