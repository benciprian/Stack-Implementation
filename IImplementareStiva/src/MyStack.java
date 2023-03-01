import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();

        // Pushing elements onto the stack
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        // Printing the stack
        System.out.println("Stack: " + myStack);

        // Accessing the top element of the stack
        int topElement = myStack.peek();
        System.out.println("Top element: " + topElement);

        // Popping an element from the stack
        int poppedElement = myStack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Printing the stack again
        System.out.println("Stack after popping: " + myStack);
    }
}
/*This code creates a Stack object and pushes some elements onto it using the push method.
It then prints the stack using System.out.println,
accesses the top element of the stack using peek, pops an element from the stack using pop,
and prints the stack again. The push method is used to add elements to the top of the stack,
the peek method is used to access the top element without removing it, and the pop method is used to remove
the top element from the stack and return it.
 */

