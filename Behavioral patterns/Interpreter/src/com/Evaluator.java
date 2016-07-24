package com;

import java.util.Stack;
import java.util.Map;

public class Evaluator implements Expression{
	
	private Expression syntaxTree;
	
	public Evaluator(String expr){
		
		Stack<Expression> expressionStack = new Stack<Expression>();
		
		for(String token : expr.split(" ")){
			
			if(token.equals("+")){
				
				Expression subExpression = new Plus(expressionStack.pop(), expressionStack.pop());
				expressionStack.push(subExpression);
			}
			else if(token.equals("-")){
				
				Expression left = expressionStack.pop();
				Expression right = expressionStack.pop();
				Expression subExpression = new Minus(left, right);
				expressionStack.push(subExpression);
			}
			else{
				expressionStack.push(new Variable(token));
			}
		}
		syntaxTree = expressionStack.pop();
	}
	
	@Override
	public int interpret(Map<String, Expression> context){
		
		return syntaxTree.interpret(context);
	}
	
}
