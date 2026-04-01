// 어디까지가 한개의 기능 => 메소드
/*
 * 	 // 소스는 변경 사항이 없다
 *   1. 난수 반생 => 3개의 난수 => 중복없는 난수
 *   2. 사용자 입력
 *      => 유효성 검사
 *   3. 난수 / 사용자 입력 비교
 *   4. 힌트 제공
 *   5. 종료 여부   
 * 
 */
/*
 *   static boolean isYeaar(int year)
 *   {
 *   	boolean bCheck=false;
 *   	if((year%4==0 && year%100!=0) || (year%400==0))
 *      {
 *      	bCheck=true;
 *      }

 *      return bCheck;
 *   }
 * 
 */
import java.util.*;
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 난수 발생 ==> Set(중복없는 데이터 저장)
		// => DISTINCT
		int[] com=new int[3];
		for(int i=0; i<com.length; i++)
		{
			com[i]=(int)(Math.random()*9)+1; // 1~9
			// 중복 체크
			for(int j=0; j<i; j++) // 첫번째는 검사하지 않는다
			{
				if(com[j]==com[i])
				{
					// com[j] => 기존으 저장된 데이터
					// com[i] => 지금 발생한 난수
					i--; // 원상복귀 => 해당 위치의 데이터 다시 저장
					break;
				}
			}
		}
		int su=0;
		boolean bCheck=false;
		for(int i=0; i<com.length; i++)
		{
			bCheck=true;
			// 중복 체크 => 중복 => bCheck:true / bCheck=false
			while(bCheck)
			{
				su=(int)(Math.random()*9)+1;
				bCheck=false; // while문 종료
				for(int j=0; j<i; j++)
				{
					if(com[j]==su)
					{
						bCheck=true; // while문 수행
						break;
					}
					
				}
			}
			com[i]=su;
		}
		System.out.println(Arrays.toString(com));
		
	}

}
