/* 
 * DWITE programming contest solutions
 * October 2007 - Problem 2: "Cubes in a Pyramid"
 * Copyright (c) Project Nayuki. All rights reserved.
 * 
 * https://www.nayuki.io/page/dwite-programming-contest-solutions
 * https://github.com/nayuki/DWITE-programming-contest-solutions
 */


public final class dwite200710p2 extends DwiteSolution {
	
	public static void main(String[] args) {
		new dwite200710p2().run("DATA2.txt", "OUT2.txt");
	}
	
	
	protected void run() {
		double base   = io.readDoubleLine();
		double height = io.readDoubleLine();
		io.println((int)Math.ceil(base * base * height / 3));
	}
	
}
