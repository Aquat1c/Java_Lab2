package Task2;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("New stack: ");
        final Stack stack = new Stack();
        System.out.println(stack);
        System.out.println("push 51");
        stack.push(51);
        System.out.println(stack);
        System.out.println("push 74");
        stack.push(74);
        System.out.println(stack);
        System.out.println("push 30");
        stack.push(30);
        System.out.println(stack);
        System.out.println("forEach loop: ");
        stack.forEach(n -> {System.out.print(n.getData( ) + " ");});
        System.out.println();
        System.out.println("pop: ");
        final int value = stack.pop();
        System.out.println(value);
        System.out.println(stack);
        System.out.println("clear: ");
        stack.clear();
        System.out.println(stack);
        System.out.println("isEmpty: ");
        System.out.println(stack.isEmpty());
    }
}
