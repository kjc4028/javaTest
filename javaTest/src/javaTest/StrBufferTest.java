package javaTest;



public class StrBufferTest {

	public static void main(String[] args) {
		//DB �� �ִ� ������ str
		String str = "�ο����� > �ο��ȳ� > For Foreigner Service > ���� > �ο�";
		
		/*�˻��� (���̶����� �� ��)*/
		String schWork = "�ο�";
		
		StringBuffer strBuff = new StringBuffer();
		
		strBuff.append(str);
		
		//�˻��� ���ڿ� ����
		int i = str.length()-schWork.length();
		int schWordLen = schWork.length();
		
		/*if(strBuff.indexOf(schWork,i) != -1) {*/
			while(true) {
				// ���� i + �˻� ������ �ڸ����� ���ڰ� �˻�Ű����� ������
				
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
