package t1;
import java.util.Scanner;
import java.io.*;

public class task1 {

   public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("���ϴ� �۾��� ���� �Ͻÿ�:\n\t[1] �����Է�\n\t[2] ����ó��\n\t[3] ������ȸ\n\t[4] ����");
      System.out.print("\n\t���� (1, 2, 3, 4) : ");
      
      int number = sc.nextInt();
      switch (number) {
         case 1: entergrade(); break;
         case 2: calculating(); break;
         case 3: print(); break;
         case 4: System.exit(0); break;
      }
   }
   
   public static void entergrade() throws IOException {
      Scanner s = new Scanner(System.in);
      System.out.print("��� ���� �Է��ϼ���: ");
      int people = s.nextInt();
      String [] names = new String [people]; 
      double [] korscores = new double [people];
      double [] engscores = new double [people];
      double [] mathscores = new double [people];
      
      PrintStream outputFile = new PrintStream("default.txt");
      outputFile.println(people);
  
      System.out.print("�̸�,����,����,���� ���� ������ ���ʷ� �Է��ϼ���: ");
      for (int i = 0; i < people; i++) {
         names [i] = s.next();
         korscores [i] = s.nextDouble();
         engscores [i] = s.nextDouble();
         mathscores [i] = s.nextDouble();
         System.out.println("������ �ԷµǾ����ϴ�.");
         }
      
      for (int i = 0; i < people; i++) {
         outputFile.println(names [i]+"   "+ korscores [i] + "   "+ engscores [i]+ "   "+ mathscores [i]);
      }
      System.out.println("�Է��� �������ϴ�."); 
   }
   
   public static void calculating() throws IOException {
      Scanner ts = new Scanner(new File("default.txt"));
      int people = ts.nextInt();
      String [] names = new String [people]; 
         double [] korscores = new double [people];
         double [] engscores = new double [people];
         double [] mathscores = new double [people];
         for (int i=0; i < people; i++) {
            names [i] = ts.next();
            korscores [i] = ts.nextDouble();
            engscores [i] = ts.nextDouble();
            mathscores [i] = ts.nextDouble();            
         }
         double korsum =0; double engsum=0; double mathsum=0;
         for (int i=0; i < people; i++) {
            korsum += korscores[i];
            engsum += engscores[i];
            mathsum += mathscores[i];
         }             
         double korevg = korsum / people;
         double engevg = engsum / people;
         double mathevg = mathsum / people;//��հ��
         
         Scanner s = new Scanner(System.in);
         System.out.println("���ϴ� �۾��� ���� �Ͻÿ�:\n\t[1] ����\n\t[2] ����\n\t[3] ����\n");
         System.out.print("\n\t���� (1, 2, 3) : ");
         int number = s.nextInt();
         PrintStream outputFile = new PrintStream(("default.txt"));
         switch(number) {
            case 1: korgrade(names,korscores,engscores,mathscores,korevg,engevg,mathevg); break;
            case 2: enggrade(names,engscores,korscores,mathscores,korevg,engevg,mathevg); break;
            case 3:   mathgrade(names,mathscores,korscores,engscores,korevg,engevg,mathevg); break;
                  
         }
         System.out.println("������ ����Ǿ����ϴ�!");
   }
   
   public static void korgrade(String[] names, double[] target,double[] Scores1, double[]Scores2, double evg1,double evg2,double evg3) throws FileNotFoundException {
      PrintStream outputFile = new PrintStream("default.txt");
      String temp ="";
      for(int i=0; i < target.length; i++) {
            for(int j=i+1; j <target.length; j++) {
               if( target[i] < target[j]) {
                  double temp1 = target[i];
                  target[i] = target[j];
                  target[j] = temp1;
                  
                  temp = names[i];
                  names[i] = names [j];
                  names [j] = temp;
                  
                  temp1 = Scores1[i];
                  Scores1[i] = Scores1[j];
                  Scores1[j] = temp1;
                  
                  temp1 = Scores2[i];
                  Scores2[i] = Scores2[j];
                  Scores2[j] = temp1;                  
               }
            }
         }
      outputFile.println(target.length);
      for(int i=0; i <= target.length-1;i++) {
         outputFile.println(names[i]+"   "+target[i]+"   "+Scores1[i]+"   "+Scores2[i]);
         }
      outputFile.println(evg1+"   "+evg2+"   "+evg3);
  }
   
   public static void enggrade(String[] names, double[] target,double[] Scores1, double[]Scores2, double evg1,double evg2,double evg3) throws FileNotFoundException {
      PrintStream outputFile = new PrintStream("default.txt");
      String temp = "";
      for(int i=0; i < target.length; i++) {
            for(int j=i+1; j <target.length; j++) {
               if( target[i] < target[j]) {
                  double temp1 = target[i];
                  target[i] = target[j];
                  target[j] = temp1;
                  
                  temp = names[i];
                  names[i] = names [j];
                  names [j] = temp;
                  
                  temp1 = Scores1[i];
                  Scores1[i] = Scores1[j];
                  Scores1[j] = temp1;
                  
                  temp1 = Scores2[i];
                  Scores2[i] = Scores2[j];
                  Scores2[j] = temp1;                  
               }
            }
         }
      outputFile.println(target.length);
      for(int i=0; i <= target.length-1;i++) {
         outputFile.println(names[i]+"   "+Scores1[i]+"   "+target[i]+"   "+Scores2[i]);
         }
      outputFile.println(evg1+"   "+evg2+"   "+evg3);
  }
   
   public static void mathgrade(String[] names, double[] target,double[] Scores1, double[]Scores2, double evg1,double evg2,double evg3) throws FileNotFoundException {
      PrintStream outputFile = new PrintStream("default.txt");
      String temp = "";
      for(int i=0; i < target.length; i++) {
            for(int j=i+1; j <target.length; j++) {
               if( target[i] < target[j]) {
                  double temp1 = target[i];
                  target[i] = target[j];
                  target[j] = temp1;
                  
                  temp = names[i];
                  names[i] = names [j];
                  names [j] = temp;
                  
                  temp1 = Scores1[i];
                  Scores1[i] = Scores1[j];
                  Scores1[j] = temp1;
                  
                  temp1 = Scores2[i];
                  Scores2[i] = Scores2[j];
                  Scores2[j] = temp1;                  
               }
            }
         }
      outputFile.println(target.length);
      for(int i=0; i <= target.length-1;i++) {
         outputFile.println(names[i]+"   "+Scores1[i]+"   "+Scores2[i]+"   "+target[i]);
         }
      outputFile.println(evg1+"   "+evg2+"   "+evg3);
  }
   
   public static void print() throws IOException {
      Scanner tx = new Scanner(new File("default.txt"));
      int people = tx.nextInt();
      String [] names = new String [people];
      double [] korscores = new double [people];
      double [] engscores = new double [people];
      double [] mathscores = new double [people];
      
      for (int i=0; i < people;i++) {
         names[i] = tx.next();
         korscores [i] = tx.nextDouble();
         engscores [i] = tx.nextDouble();
         mathscores [i] = tx.nextDouble();
         }
         double korevg = tx.nextDouble();
         double engevg = tx.nextDouble();
         double mathevg = tx.nextDouble();
         
      PrintStream outputFile = new PrintStream("default.txt");
      System.out.println("�̸�\t����\t����\t����");
      for (int i =0; i < people; i++) {
         System.out.println(names [i]+"\t"+korscores[i]+"\t"+engscores[i]+"\t"+mathscores[i]);
      }
      System.out.printf("\n���� ���: %.1f\t���� ���: %.1f\t���� ���: %.1f",korevg,engevg,mathevg);
   }
  
}