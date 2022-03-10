package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
	
	@RequestMapping(method = RequestMethod.GET, path = "/sum")
	public String calculation(double n1, double n2, String operation) {

		double result;

		switch (operation) {
		
		// %2B in URL for "+"
		case "+":
			result = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + result);
			return "<h2>" + n1 + " + " + n2 + " = " + result + "</h2>";

		case "-":
			result = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + result);
			return "<h2>" + n1 + " - " + n2 + " = " + result + "</h2>";

		case "*":
			result = n1 * n2;
			System.out.println(n1 + " * " + n2 + " = " + result);
			return "<h2>" + n1 + " * " + n2 + " = " + result + "</h2>";

		case "/":
			result = n1 / n2;
			System.out.println(n1 + " / " + n2 + " = " + result);
			return "<h2>" + n1 + " / " + n2 + " = " + result + "</h2>";

		default:
			System.out.println("Invalid operator!");
			return "<h2>Invalid operator!</h2>";
		}
	}
}
