package examAverage;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		// 우리반 국어 성적의 평균 구하기
		
		int[] kors = new int[5];
		Scanner sc = new Scanner(System.in); 
		int menu;
		boolean keepLoop = true;
		
		while(keepLoop) {
			// 메인메뉴
			System.out.printf("┌─────────── 0.main menu ───────────┐\n");
			System.out.printf("│   1.input    2.print    3.exit    │\n");
			System.out.printf("└───────────────────────────────────┘");		
			menu = sc.nextInt();
			
			switch(menu) {
				case 1 : // menu==1
					// 1. 성적 입력
					System.out.println("┌───────────────────────────────────┐");
					System.out.println("│           1.input score           │");
					System.out.println("└───────────────────────────────────┘");
					for(int i=0; i<kors.length; i++) {
						do {
							System.out.printf("input kor score!!");
							kors[i] = sc.nextInt();
							
							if(kors[i]<0 || kors[i]>100){
								//kors[i]가 0보다 작거나 100보다 클때
								System.out.println("range is 0~100");
							}				
						}while(kors[i]<0 || kors[i]>100);
					}
					System.out.println("────────────────────────────────────");
					System.out.println("────────────────────────────────────");
					break;
					
				case 2 : // menu==2
					// 2. 성적 출력
					System.out.println("┌───────────────────────────────────┐");
					System.out.println("│           2.print score           │");
					System.out.println("└───────────────────────────────────┘");
					
					int total=0;
					float avg;
					
					for(int i=0; i<kors.length; i++) {
						total = total + kors[i];
						// total +=kors[i];
					}
					
					avg = total/5f;
					
					for(int i=0; i<kors.length; i++) {
						System.out.printf("%d \t", kors[i]);
					}
					System.out.println();
					System.out.printf("total: %3d \n", total);
					System.out.printf("average: %6.2f \n", avg);
					System.out.println("────────────────────────────────────");
					System.out.println("────────────────────────────────────");
					break;
					
				case 3 : // menu==3
					System.out.println("ByeBye~");
					keepLoop = false;
					break;
					
				default : // menu가 1,2,3이 아닐경우
					System.out.println("range 1~3");
			}
		}		
	}
}
