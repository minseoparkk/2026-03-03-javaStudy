/*
 *   36page 
 *   ----------
 *   변수의 정의 : 하나의 값을 저장할 수 있는 메모리 주소 별칭
 *             ------- 
 *   RAM => 주소 (주소마다 => 데이터 저장)
 *    | 각 => 4byte (0~2140000) => 저장된 위치 기억
 *    
 *   저장 크기
 *    1byte / 2byte / 4byte / 8byte => 기본형
 *    
 *   37page
 *     지역변수
 *     	=> stack 공간에 저장
 *      => {변수 선언} => 지역변수
 *                     ------- {}이 종료되면 자동 해제 => 메모리 자체 관리
 *      *** 변수 사용시에는 반드시 어떤 종류의 값을 지정할 지 미리 지정해야 된다
 *     		학점 => 문자 'A' => 정수 = 65 'a' => 97  
 *     
 *      캐멀스타일 : 변수가 어떤 데이터 저장되어 있는지 의미 
 *      -------
 *         가독성 : filename => fileName => 헝가리인식 표현  
 *         student / sawon / member
 *         studentCount
 *         sawonCount
 *         memberCount
 *         --------------------------- 
 *         
 *      변수 선언
 *      int kor;
 *      int eng;
 *      int math;
 *      
 *      int kor, eng, math;
 *      
 *      변수의 초기값
 *      kor=100;
 *      eng=90;
 *      math=80;
 *      
 *      선언+초기값
 *      int kor=90;
 *      
 *      프로그램에서 사용 => 초기값이 없는 상태에서는 오류 발생
 *      
 *      int a=100; a에 100을 저장
 *                 100을 a에 저장
 *         <=== 
 *         
 *      int a=100+10
 *           --- 대입연산자 오른쪽 => 왼쪽
 *      10+10+10+10
 *      ===>
 *      
 *      38page
 *      => 변수명
 *         1) 길이 => 제한은 없다 (3~10)
 *         2) 변수명에 i, j 사용하지 않는다
 *      => 변수 : 변하는 수 => 수정 / 저장/ 읽기
 *      
 *      // 저장
 *      int a=10;
 *      a=100;
 *                  -----a-----        -----a-----
 *                      10        ==>      100   System.out.println(a)
 *                  -----------        ------------
 *      int a=10;
 *      int b=a;    -----a------       -----b-----
 *                       10                 10
 *                  ------------        -----------
 *               
 *      각 데이터형 마다
 *      초기값
 *      
 *      byte b=100 (127초과하지 않으면 된다)
 *      
 *      byte b1=10;
 *      byte b2=20;
 *      byte b3=b1+b2; // 오류 발생 byte + byte = int   
 *      
 *      short s=10000 (32768)
 *      
 *      int i=2140000  
 *      
 *      long l=1000
 *             ---- int값 => 1000L
 *             
 *      double d= 10.5 (100,100L)
 *      
 *      double d=100;
 *      float => 4byte => double 구분
 *                 10.F / 10.5D (D는 생략) => default
 *                 
 *      int / long / double                      
 *      
 *      char => 문자를 저장
 *           => 0~65535 ==>  멀티바이트 (2byte) => 유니코드
 *           => 각국의 언어 표현이 가능 (ASC => 0~255)
 *           => 문자 한개만 저장이 가능
 *              ''
 *           => 
 */
public class 변수_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println((int)'a');
		int a=10;
		System.out.println(a);
		
		//byte b1=10;
		//byte b2=20;
		//int b3=b1+b2;
		double d='A';
		int k='A';
		char c=66; // 호환
		System.out.println(d);
		System.out.println(c);

	}

}
