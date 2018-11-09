package javaTest;



public class StrBufferTest {

	public static void main(String[] args) {
		//DB 들어가 있는 데이터 str
		String str = "민원서비스 > 민원안내 > For Foreigner Service > 서비스 > 민원";
		
		/*검색어 (하이라이팅 될 것)*/
		String schWork = "민원";
		
		StringBuffer strBuff = new StringBuffer();
		
		strBuff.append(str);
		
		//검색한 문자열 포함
		int i = str.length()-schWork.length();
		int schWordLen = schWork.length();
		
		/*if(strBuff.indexOf(schWork,i) != -1) {*/
			while(true) {
				// 현재 i + 검색 퀴워드 자릿수의 문자가 검색키워드와 같은가
				
				if(strBuff.substring(i, i+schWordLen).toLowerCase().equals(schWork.toLowerCase())) {
					strBuff.insert(i+schWordLen, "<HE>");
					strBuff.insert(i, "<HS>");
/*					strBuff.insert(strBuff.indexOf(schWork,i)+schWork.length(), "<HE>");
					strBuff.insert(strBuff.indexOf(schWork,i), "<HS>");
*/				}
				if (i == 0){
					break;
				}
				i--;
			}
		/*}*/
		
		String result = strBuff.toString();
		
		System.out.println(result);
		

	}

}
