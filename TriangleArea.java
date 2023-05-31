class Triangle {
    float height;
    float base;

    void getdata(float a, float b) {
        height = a;
        base = b;
    }
}

public class TriangleArea {
    public static void main(String[] args)

    {
        float area, a, b;
        Triangle trg = new Triangle();
        trg.getdata(21, 12);
        area = trg.height * trg.base * 1 / 2;
        System.out.println("AREA OF TRIANGLE IS " + area);
    }
}