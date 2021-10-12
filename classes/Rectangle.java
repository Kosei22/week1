package week1.classes;

public class Rectangle {
    int width;
    int height;
    String color;

    Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    void draw() {
        for (int n = 0; n < height; n++) {
            for (int i = 0; i < width; i++) {
                System.out.print(color.substring(0, 1));
                if(i < width - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}