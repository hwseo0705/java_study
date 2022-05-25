package day06;

// parameter (매개 변수) : 함수가 외부에서 받아와야 하는 값을 저장하는 공간
public class MethodParam {
    // 2개의 정수를 전달받아 그 합을 돌려주는 함수
    public static int add(int n1, int n2) {
        System.out.println("Call");
        return n1 + n2;
    }

    // n개의 정수를 전달받아 그 총합을 리턴하는 함수
    // int... is also an array but you can easily add
    // numbers when you call the function
    public static int addAll(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // 두개의 배열을 전달받아 길이가 더 긴 배열을 리턴하는 함수
    // if both are int... then Java gets confused so only
    // use it when you have one array parameter
    public static int[] compareLength(int[] arr1, int[] arr2) {
        return arr1.length > arr2.length ? arr1 : arr2;
    }

    public static void hello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("Before Call");
        add(10, 20);
        System.out.println("After Call");

        System.out.println("-----------------------");
        long x = 12L;
        add(5, (int) x);

        System.out.println("-----------------------");
        // can do this
        int sum = addAll(new int[] {1, 2, 3, 4, 5, 6});
        System.out.println(sum);

        // but can also do it like this with 'int...'
        sum = addAll(10, 20, 30);
        System.out.println(sum);

        System.out.println("-----------------------");
        compareLength(new int[] {1,3,5,7}, new int[] {2, 4, 6, 8});

        for (int i = 0; i < 5; i++) {
            hello();
        }
    }
}
