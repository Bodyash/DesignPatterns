package com;

import java.util.Map;

public class Minus implements Expression{
	
	Expression leftOperand;
	Expression rightOperand;
	
	public Minus(Expression l, Expression r){
		
		leftOperand = l;
		rightOperand = r;
	}

	@Override
	public int interpret(Map<String, Expression> variables) {
		return leftOperand.interpret(variables) - rightOperand.interpret(variables);
	}
	
}
