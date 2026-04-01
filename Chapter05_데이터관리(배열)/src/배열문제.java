import java.util.*;
public class 배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1 - 정답 4
		/*int[] n = {1, 2, 3, 4, 5};
		int n[] = {0};
		int[] n = new int[3];
	    int n[3] = new int[3]; */ 
		
		// 문제2 - 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
		//char[] c = new char[10]; 
		
		// 문제3 - 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
		//int[] n = {0,1,2,3,4,5,};
		
		// 문제4 - '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
//		char[] day = {'일', '월', '화', '수', '목', '금', '토'};
		
		// 문제5 - 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라.
//		boolean bool={true, false, false, true}
		
		// 문제6 - 배열 alpha를 모두 출력하고자 한다. 빈칸에 적절한 코드를 삽입하시오
//		char[] alpha = {'a', 'b', 'c', 'd'};
//
//		for(int i=0; i<alpha.length; i++)
//		               ------------
//		     System.out.print(alpha[i]);
//​		
		// 문제7 - 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
//		int[] arr = new int[10];
//		
//		for(int i=0; i<=arr.length; i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//			if(arr[i]%3==0)
//			System.out.print(arr[i]+" ");
//		}

		// 문제8 - 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 
        // 그리고 배열에 든 숫자들과 평균을 출력하라. 
		int[] arr = new int[10];
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
			sum+=arr[i];
		}
		double avg = (double)sum/arr.length;
		System.out.println(Arrays.toString(arr));
		System.out.println(avg);
		

		// 문제9 
//        5개 정수를 입력받은 후 차례로 출력하는 프로그램 
//        입력예) 5 10 9 3 2
//        출력예) 5 10 9 3 2
		

//        문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램 
//        입력예) A B C D E F G H I J
//        출력예) ABCDEFGHIJ

//        정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램 
//        입력예) 5 3 9 6 8 4 2 8 10 1
//        출력예) 9 8 1

//        10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
//        입력예) 5 10 8 55 6 31 12 24 61 2
//        출력예) 61

		// 문제10
        //10명의 컴퓨터 정수를 입력받아 배열에 저장하고 총점과 평균을 구하여 출력하는 프로그램을 작성
        
        //5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하는 프로그램 
        //출력예) 50 75 85 95 100



	}

}
