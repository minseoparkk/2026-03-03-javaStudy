/*
 *   1~100 합 ==> 1~100 누적
 *               ---------- sum 반드시 초기값 0
 */
public class 제어문_반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 누적 변수
		int sum=0;
		for(int i=1; i<=100; i++) // i = 루프변수 (i는 1~100까지 변경되는 변수)
		{
			// i는 지역변수 => for언어에서만 사용이 가능
			sum+=i; // sum=sum+i
			System.out.println("i=" + i + ", sum="+sum);
			// 장바구니 계산
		}
		// 지역변수 {}을 벗어나면 시작된다
		// 지역변수는 반드시 초기값이 존재
		// 같은 블록에서 같은 변수명을 사용할 수 없다
		System.out.println("1~100사이의 총합: "+sum);
	}

}
