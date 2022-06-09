package datastructure.chapter05.stack;

public class Main {
    public static void main(String[] args) {

        // create a stack
        Stack stack = new Stack();

        // push to stack
        for (int i = 1; i <=5; i++) {
            stack.push(i * 3);
        }

        // pop from stack
        while (!stack.isEmpty()) {
            Integer removed = stack.pop();
            System.out.println(removed);
        }

        stack.peek();
    }
}
