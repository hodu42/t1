package t1;
/* ���� ó�� ���α׷�

      �޴� ��� �� ����� ���� �Է�

      ����� ���ÿ� ����
		1: ���� �Է�
		2: ���� ó��
		3: ���� ��ȸ
		x: ���α׷� ����
*/

import java.io.PrintStream;
import java.io.File;
import java.io.IOException;

import java.util.Scanner;

public class ProcessScores {

	public static void main(String... args) throws IOException {
		Scanner kbd = new Scanner(System.in);

		while (true) {
			char userChoice = displayMenuAndGetUserChoice(kbd);
			
			switch (userChoice) {
				case '1': inputScores(); 							break;
				case '2': processScores(); 							break;
				case '3': displayScores(); 							break;
				case '4': System.out.println("����"); System.exit(0); 	break;
				default:  System.out.println("1, 2, 3, 4"); 			break;
			} // switch
		} // while
	} // main

	private static char displayMenuAndGetUserChoice(Scanner kbd) {
		System.out.println("���ϴ� �۾��� ���� �Ͻÿ�:\n\t[1] �����Է�\n\t[2] ����ó��\n\t[3] ������ȸ\n\t[4] ����");
	      System.out.print("\n\t���� (1, 2, 3, 4) : ");
		return kbd.next().charAt(0);
	}
	private static void inputScores() {
		try ( PrintStream outFile = new PrintStream(new File("scores.org")) ) {
			System.out.println("���� �Է�");
		} catch (IOException e) {
		}
	}

	private static void processScores() {
		try ( 
			Scanner inFile = new Scanner(new File("scores.org"));
			PrintStream outFile = new PrintStream(new File("scores.proc"));
		) {
			System.out.println("���� ó��");
		} catch (IOException e) {
		}
	}

	private static void displayScores() throws IOException {
			Scanner ts = new Scanner(new File("Scores.proc"));
			
			ts.nextLine();
			int numberofstudents = ts.nextInt();
			ts.nextLine();
			System.out.println(ts.nextLine());
			for(int i=0; i < numberofstudents; i++){
				
				}
	}
} // ����ó��