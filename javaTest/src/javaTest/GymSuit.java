package javaTest;

public class GymSuit {

	public static void main(String[] arsg){
		
		int n = 5;
		int[] lost = {1,3};
		int[] reserve = {2};
		
		solution(n, lost, reserve);
	}

	/**
	 * 
	 * @param n 총 인원수
	 * @param lost 도난당한 명단
	 * @param reserve 여벌보유 명단
	 * @return 체육수업을 들을 수 있는 학생의 최댓값
	 */
	public static int solution(int n, int[] lost, int[] reserve) { 
		int answer = 0;
		int[] list = new int[n];

		//초기 셋팅
		for(int i=0; i<list.length; i++){
			for(int j=0; j<lost.length; j++){
				if((i+1) == lost[j]){
					list[i] -=1;
				}
			}
			for(int j=0; j<reserve.length; j++){
				if((i+1) == reserve[j]){
					list[i] +=1;
				}
			}         
		}

		for(int i=0; i<list.length; i++){
			System.out.println(i+1 + " : " + list[i]);
		}

		for(int i=0; i<list.length; i++){
			if(list[i] == -1){
				if(i+1 <list.length){
					if(list[i+1] == 1){
						list[i+1] -=1;
						list[i] +=1;
					}                  
				}
				if(i-1 >=0){
					if(list[i-1] == 1){
						list[i-1] -=1;
						list[i] +=1;
					}         
				}
			}
		}

		for(int i=0; i<list.length; i++){
			System.out.println(i+1 + " : " + list[i]);
			if(list[i] != -1){
				answer +=1;
			}
		}



		return answer; 
	} 

}
