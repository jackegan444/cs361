/**
 * 
 */
package mystack;

/**
 * @author Jack Egan
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		T popVal = theStack.val;
		theStack = theStack.next;
		return popVal;
	}

	public void push(T v) {
		theStack = new MyNode<T>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> integerStack = new MyStack<Integer>();
		// Push 1 and 2
		integerStack.push(Integer.valueOf(1));
		integerStack.push(Integer.valueOf(2));
		// Pop
		integerStack.pop();
		// Push 5
		integerStack.push(Integer.valueOf(5));
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> personStack = new MyStack<Person>();
		// Push a person p1 with your name
		personStack.push(new Person("Jack", "Egan"));
		// Push a person p2 with my name
		personStack.push(new Person("Christelle", "Scharff"));
	}

}
