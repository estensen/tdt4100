package stateandbehavior;

import java.util.Stack;

public class RPNCalc {
	public RPNCalc() {
		
	}
	
	private Stack<Double> myStack = new Stack<Double>();
	
	void push(double argument) {
		myStack.push(argument);
	}
	
	double pop() {
		if (myStack.empty() == true) {
			return Double.NaN;
		}
		return myStack.pop();
	}
	
	double peek(int index) {
		if (getSize() -1 < index || index < 0) {
			return Double.NaN;
		}
		else {
			return myStack.get(getSize()-index-1);
		}
	}
	
	int getSize() {
		return myStack.size();
	}
	
	void performOperation(char operator) {
		if (operator == '+' && getSize() > 1) {
			push(pop() + pop());
		}
		else if (operator == '-' && getSize() > 1) {
			push(-pop() + pop());
		}
		else if (operator == '*' && getSize() > 1) {
			push(pop() * pop());
		}
		else if (operator == '/' && getSize() > 1) {
			push(1/pop() * pop());
		}
		else if (operator == '~' && getSize() > 1) {
			double one = pop();
			double two = pop();
			push(one);
			push(two); 
		}
	}
}
