package day06;

import java.util.Arrays;

public class MethodReturn {

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    // 2개 정수의 합을 출력하는 함수
    public static void showAddResult(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
    }

    public static void callName(String name) {
        if (name.length() > 5) {
            System.out.println("이름이 너무 길어요~");
            return; //함수 탈출문
        }
        System.out.printf("Hello %s\n", name);
    }

    /*
        # 모든 함수의 리턴값은 반드시 1개이다.
        - 5개의 애완동물 이름목록에서 원하는 숫자를 전달하면 그
          숫자만큼 랜덤으로 애완동물리스트를 뽑아서 리턴하는 함수
    */
    public static String[] selectPet(int count) {
        // 매개변수 검증
        if (count < 0 || count > 5) return null;
        
        String[] petList = {"Dpg", "Bird", "Duck", "Chick", "Cat"};

        // Array to Save Randomly Selected Pets
        String[] selected = new String[count];
        for (int i = 0; i < count; i++) {
            int rn = (int) (Math.random() * petList.length);
            selected[i] = petList [rn];
        }
        return selected;
    }

    public static void main(String[] args) {
        int r1 = add(10, 20);
        System.out.println(r1);
        int r2 = r1 * 3 + r1--;

        // 리턴이 없는 void 타입 함수는 변수에 저장할 수 없다
        showAddResult(10, 20);

        System.out.println("-----------------------");
        double random = Math.random();

        // add(30, add(5, 5)
        // add(30, 10)
        // 40
        add(add(10, 20), add(5, 5));
        showAddResult(add(10, 20), add(5, 5));

        System.out.println("-----------------------");
        callName("Hae");

        System.out.println("-----------------------");
        String[] selectPet = selectPet(10);
        System.out.println(Arrays.toString(selectPet));

    }
}
