package t1;
/* 성적 처리 프로그램

      메뉴 출력 및 사용자 선택 입력

      사용자 선택에 따라
		1: 성적 입력
		2: 성적 처리
		3: 성적 조회
		x: 프로그램 종료
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
				case '4': System.out.println("종료"); System.exit(0); 	break;
				default:  System.out.println("1, 2, 3, 4"); 			break;
			} // switch
		} // while
	} // main

	private static char displayMenuAndGetUserChoice(Scanner kbd) {
		System.out.println("원하는 작업을 선택 하시오:\n\t[1] 성적입력\n\t[2] 성적처리\n\t[3] 성적조회\n\t[4] 종료");
	      System.out.print("\n\t선택 (1, 2, 3, 4) : ");
		return kbd.next().charAt(0);
	}
	private static void inputScores() {
		try ( PrintStream outFile = new PrintStream(new File("scores.org")) ) {
			System.out.println("성적 입력");
		} catch (IOException e) {
		}
	}

	private static void processScores() {
		try ( 
			Scanner inFile = new Scanner(new File("scores.org"));
			PrintStream outFile = new PrintStream(new File("scores.proc"));
		) {
			System.out.println("성적 처리");
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
} // 성적처리