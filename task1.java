package t1;
import java.util.Scanner;
import java.io.*;

public class task1 {

   public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("원하는 작업을 선택 하시오:\n\t[1] 성적입력\n\t[2] 성적처리\n\t[3] 성적조회\n\t[4] 종료");
      System.out.print("\n\t선택 (1, 2, 3, 4) : ");
      
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
      System.out.print("사람 수를 입력하세요: ");
      int people = s.nextInt();
      String [] names = new String [people]; 
      double [] korscores = new double [people];
      double [] engscores = new double [people];
      double [] mathscores = new double [people];
      
      PrintStream outputFile = new PrintStream("default.txt");
      outputFile.println(people);
  
      System.out.print("이름,국어,영어,수학 성적 순으로 차례로 입력하세요: ");
      for (int i = 0; i < people; i++) {
         names [i] = s.next();
         korscores [i] = s.nextDouble();
         engscores [i] = s.nextDouble();
         mathscores [i] = s.nextDouble();
         System.out.println("성적이 입력되었습니다.");
         }
      
      for (int i = 0; i < people; i++) {
         outputFile.println(names [i]+"   "+ korscores [i] + "   "+ engscores [i]+ "   "+ mathscores [i]);
      }
      System.out.println("입력이 끝났습니다."); 
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
         double mathevg = mathsum / people;//평균계산
         
         Scanner s = new Scanner(System.in);
         System.out.println("원하는 작업을 선택 하시오:\n\t[1] 국어\n\t[2] 영어\n\t[3] 수학\n");
         System.out.print("\n\t선택 (1, 2, 3) : ");
         int number = s.nextInt();
         PrintStream outputFile = new PrintStream(("default.txt"));
         switch(number) {
            case 1: korgrade(names,korscores,engscores,mathscores,korevg,engevg,mathevg); break;
            case 2: enggrade(names,engscores,korscores,mathscores,korevg,engevg,mathevg); break;
            case 3:   mathgrade(names,mathscores,korscores,engscores,korevg,engevg,mathevg); break;
                  
         }
         System.out.println("성적이 저장되었습니다!");
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
      System.out.println("이름\t국어\t영어\t수학");
      for (int i =0; i < people; i++) {
         System.out.println(names [i]+"\t"+korscores[i]+"\t"+engscores[i]+"\t"+mathscores[i]);
      }
      System.out.printf("\n국어 평균: %.1f\t영어 평균: %.1f\t수학 평균: %.1f",korevg,engevg,mathevg);
   }
  
}