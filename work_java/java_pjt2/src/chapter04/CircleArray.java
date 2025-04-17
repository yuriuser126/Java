package chapter04;

class Circle3 {
    int radius;

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public Circle3(int radius) {
        this.radius = radius;
    }
}

public class CircleArray {
    public static void main(String[] args) {
        // 객체 배열 선언 및 생성
        Circle3[] c = new Circle3[5]; // Circle3 객체를 저장할 배열 생성

        // 배열의 각 요소에 Circle3 객체 할당
        for (int i = 0; i < c.length; i++) {
            c[i] = new Circle3(i + 1); // 반지름을 1부터 5까지 할당
        }

        // 각 객체의 면적 출력
        for (int i = 0; i < c.length; i++) {
            System.out.println("Circle " + (i + 1) + " Area: " + c[i].getArea());
        }
    }
}







