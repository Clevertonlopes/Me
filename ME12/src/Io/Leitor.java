/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Io;

import java.util.Scanner;

/**
 *
 * @author 1171143394
 */
public class Leitor {
	
	private Scanner console;
	
	public Leitor() {
		console = new Scanner(System.in);
	}
	
	public String lerString(String rotulo) {
		System.out.print(rotulo);
		return console.nextLine();
	}
	
	public double lerDouble(String rotulo) {
		return Double.parseDouble(lerString(rotulo));
	}
}
