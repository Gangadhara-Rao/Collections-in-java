package cg;

import java.util.Stack;

public class LearningStack {
public static void main(String args[]) {
	Stack<String> animal = new Stack<>();
//	 adding element using push function
	animal.push("lion");
	animal.push("Tiger");
	animal.push("pig");
	animal.push("Bear");
	
	System.out.println(animal);
}
}
