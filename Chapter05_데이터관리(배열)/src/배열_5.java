// => 10개의 정수를 임으로 추추 => 배열
// => 최댓값 / 최솟값 구하기
import java.util.*;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		// 임의로 추출 (1~100)
		Random r=new Random();
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=r.nextInt(100)+1;
		}
		// 출력
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		// => 요청 구현
		System.out.println("\n======= 결과값 ======");
		int max=arr[0];
		int min=arr[0];
		
		for(int i:arr)
		{
			if(max<i)
				max=i;
			
			if(min>i)
				min=i;
		}
		
		System.out.println("최댓값: "+max);
		System.out.println("최솟값: "+min);
		
		// index
		for(int i=0; i<arr.length; i++)
		{
			if(max==arr[i])
			{
				System.out.println("max같은 "+i+"번째 위치");
			}
			if(min==arr[i])
			{
				System.out.println("min같은 "+i+"번째 위치");
			}
		}
	}

}
