package t1;

import java.util.Scanner;

class QE {
	private double a, b, c;

	public QE(double newA, double newB, double newC) {
		a = newA;
		b = newB;
		c = newC;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return Math.pow(getB(), 2) - 4 * getA() * getC();
	}

	public double getRoot1() {
		if (getDiscriminant() < 0) {
			return 0;
		}
		return ((-1 * getB() + (Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC()))) / 2 * getA());
	}

	public double getRoot2() {
		if (getDiscriminant() < 0) {
			return 0;
		}
		return ((-1 * getB() - (Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC()))) / 2 * getA());
	}

}

public class QuadraticEquation {
	public static void main(String[] args) {
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.println("please type a, b, c :");
			QE numbers = new QE(s.nextDouble(), s.nextDouble(), s.nextDouble());
			if (numbers.getDiscriminant() > 0) {
				System.out.println(numbers.getRoot1());
				System.out.println(numbers.getRoot2());
			} else if (numbers.getDiscriminant() == 0) {
				System.out.println(numbers.getRoot1());
			} else
				System.out.println("The equation has no roots");
		}

	}
}
