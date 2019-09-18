package t1;
import java.util.Scanner;

class Account {
   	private static long 마지막계좌번호=0L;

	private long 계좌번호, 잔고; 
	private String 예금주;

   	Account(String 예금주, long 예금액) {
		계좌번호 = nextAccountNumber();
		this.예금주 = 예금주;
		잔고 = 예금액;
   	}

	private static long nextAccountNumber() { return ++마지막계좌번호; }
	
	public long getBalance() { return 잔고; }
   	public void deposit(long 예금액) { 잔고 += 예금액; }
   	public long withdraw(long 출금액) {return 잔고 >= 출금액 ? 잔고 -= 출금액 : 0L;}

	public void showAccount()	{ // test를 위해.
		System.out.printf("%s %04d-%04d %10d%n", 예금주, 계좌번호/1000, 계좌번호%10000, 잔고);
	}

} //End of Account

public class Bank {
	static Scanner s = new Scanner(System.in);
	static int number = 0;
	Account currentAcc = null;
   		
	static Account[] accounts = new Account[10];
   	public static void main(String[] args) {
   		while (true) {
			char userChoice = displayMenuAndGetUserChoice(s);
			
			switch (userChoice) {
				case '1': makeAccount(); 							break;
				case '2': deposit(); 							break;
				case '3': withdraw(); 							break;
				case '4': showAccount(); 						break;
				case '5': System.out.println("종료");				System.exit(0); break;
				default:  System.out.println("1, 2, 3, 4, 5"); 			break;
			} // switch
		}	
   	} // End of main
   	
   	private static char displayMenuAndGetUserChoice(Scanner kbd) {
		System.out.println("원하는 작업을 선택 하시오:\n\t[1] 계좌개설\n\t[2] 입금\n\t[3] 출금\n\t[4] 계좌조회\n\t[5] 종료");
	      System.out.print("\n\t선택 (1, 2, 3, 4, 5) : ");
		return kbd.next().charAt(0);
	}
   	
   	public static void makeAccount() {
   		System.out.println("생성할 계좌이름과 입금액을 입력해주세요: ");
   		String name = s.next();	long money = s.nextLong();
   		
		accounts[number] = new Account(name,money);
		System.out.printf("생성된 계좌번호는 %d ",number);
		System.out.println();
   		if(number<10)number++;
   	}
   	public static void deposit() {
   		System.out.println("계좌번호를 입력하세요: ");
   		long accountNumber = s.nextLong();
   		System.out.println("입금할 금액을 입력하세요: ");
   		long money = s.nextInt();
   		accounts[(int)accountNumber].deposit(money);
   		System.out.printf("현재 계좌 %d의 잔액은 %d입니다",accountNumber,accounts[(int)accountNumber].getBalance());
   		System.out.println();
   		
   	}
   	public static void withdraw() {
   		System.out.println("계좌번호를 입력하세요: ");
   		long accountNumber = s.nextLong();
   		System.out.println("출금할 금액을 입력하세요: ");
   		long money = s.nextInt();
   		accounts[(int)accountNumber].withdraw(money);
   		System.out.printf("현재 계좌 %d의 잔액은 %d입니다",accountNumber,accounts[(int)accountNumber].getBalance());
   		System.out.println();
   		
   	}
   	public static void showAccount() {
   		System.out.println("조회하고싶은 계좌의 번호를 입력하세요: ");
   		long accountNumber = s.nextLong();
   		System.out.printf("현재 계좌 %d의 잔액은 %d입니다",accountNumber,accounts[(int)accountNumber].getBalance());
   		System.out.println();
   		
   	}
} // End of Bank