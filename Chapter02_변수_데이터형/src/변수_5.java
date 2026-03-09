/*
 *       변수
 *       1. 국어 / 수학 / 영어 / 총점 / 평균 / 학점 / 등수
 *                                            int
 *          --------------------  ----  ---- String / char
 *                int            double
 */
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int drink=12;
		//
		//drink=drink-5;
		//drink-=5; // 누적 / 차감		
		//System.out.println("남은 음료수:" + drink);
		// 남은 음료수: 7
	    /*
	     *    샌드위치 ==> 250
	     *    사과 ==> 100
	     *    쥬스 ==> 150
	     *    
	     *    샌드위치 1 사과 2 쥬스1
	     *    => 총 칼로리 
	     */
		/*int sandwich=250, apple=100, jucie=150;
		int ksum=sandwich + apple*2 + jucie;
		System.out.println(ksum);*/
		/*
		 *     이름은 홍길동 / 성별 남자 / 나이 20 / 키 180.5 / card false
		 *     장바구니
		 *        우유 = 1200 => 2개
		 *        방 = 1500 => 3개
		 *        계란 = 200 => 10        
		 */
		String name="홍길동";
		String sex="남자";
		int age=20;
		double height=180.5;
		boolean isCard=false;
		//int total;
		
		int milk=1200*2;
		int bread=1500*3;
		int egg=20*10;
		//total=milk + bread + egg;
		
		System.out.println("이름: " + name);
		System.out.println("성별: " + sex);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("카드 존재여부: " + isCard);
		
		System.out.println("장바구니 총합: " + (milk + bread + egg));
	
		String msg="""
		        Hello
		        World
		        Java
		        """;
		System.out.println(msg);
		
		
		
		
	}

}
