package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {

	private Scanner sc;

	public Console() {
		sc = new Scanner(System.in);
	}

	public int readInt() {
		return sc.nextInt();
	}

	public long readLong() {
		return sc.nextLong();
	}

	public float readFloat() {
		return sc.nextFloat();
	}

	public double readDouble() {
		return sc.nextDouble();
	}

	public boolean readBoolean() {
		return sc.nextBoolean();
	}

	public String readWord() {
		return sc.next();
	}

	public String readFulWord() {
		return sc.nextLine();
	}

	public char readChar(){
		return sc.next().charAt(0);
	}

	public void burnLine(){
		sc.nextLine();
	}

	public void printLine(String data){
		System.out.println(data);
	}

	public void print(String data){
		System.out.print(data);
	}
	
}

