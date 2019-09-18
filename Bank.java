package t1;
import java.util.Scanner;

class Account {
   	private static long ���������¹�ȣ=0L;

	private long ���¹�ȣ, �ܰ�; 
	private String ������;

   	Account(String ������, long ���ݾ�) {
		���¹�ȣ = nextAccountNumber();
		this.������ = ������;
		�ܰ� = ���ݾ�;
   	}

	private static long nextAccountNumber() { return ++���������¹�ȣ; }
	
	public long getBalance() { return �ܰ�; }
   	public void deposit(long ���ݾ�) { �ܰ� += ���ݾ�; }
   	public long withdraw(long ��ݾ�) {return �ܰ� >= ��ݾ� ? �ܰ� -= ��ݾ� : 0L;}

	public void showAccount()	{ // test�� ����.
		System.out.printf("%s %04d-%04d %10d%n", ������, ���¹�ȣ/1000, ���¹�ȣ%10000, �ܰ�);
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
				case '5': System.out.println("����");				System.exit(0); break;
				default:  System.out.println("1, 2, 3, 4, 5"); 			break;
			} // switch
		}	
   	} // End of main
   	
   	private static char displayMenuAndGetUserChoice(Scanner kbd) {
		System.out.println("���ϴ� �۾��� ���� �Ͻÿ�:\n\t[1] ���°���\n\t[2] �Ա�\n\t[3] ���\n\t[4] ������ȸ\n\t[5] ����");
	      System.out.print("\n\t���� (1, 2, 3, 4, 5) : ");
		return kbd.next().charAt(0);
	}
   	
   	public static void makeAccount() {
   		System.out.println("������ �����̸��� �Աݾ��� �Է����ּ���: ");
   		String name = s.next();	long money = s.nextLong();
   		
		accounts[number] = new Account(name,money);
		System.out.printf("������ ���¹�ȣ�� %d ",number);
		System.out.println();
   		if(number<10)number++;
   	}
   	public static void deposit() {
   		System.out.println("���¹�ȣ�� �Է��ϼ���: ");
   		long accountNumber = s.nextLong();
   		System.out.println("�Ա��� �ݾ��� �Է��ϼ���: ");
   		long money = s.nextInt();
   		accounts[(int)accountNumber].deposit(money);
   		System.out.printf("���� ���� %d�� �ܾ��� %d�Դϴ�",accountNumber,accounts[(int)accountNumber].getBalance());
   		System.out.println();
   		
   	}
   	public static void withdraw() {
   		System.out.println("���¹�ȣ�� �Է��ϼ���: ");
   		long accountNumber = s.nextLong();
   		System.out.println("����� �ݾ��� �Է��ϼ���: ");
   		long money = s.nextInt();
   		accounts[(int)accountNumber].withdraw(money);
   		System.out.printf("���� ���� %d�� �ܾ��� %d�Դϴ�",accountNumber,accounts[(int)accountNumber].getBalance());
   		System.out.println();
   		
   	}
   	public static void showAccount() {
   		System.out.println("��ȸ�ϰ���� ������ ��ȣ�� �Է��ϼ���: ");
   		long accountNumber = s.nextLong();
   		System.out.printf("���� ���� %d�� �ܾ��� %d�Դϴ�",accountNumber,accounts[(int)accountNumber].getBalance());
   		System.out.println();
   		
   	}
} // End of Bank