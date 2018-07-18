package javaTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelPoiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������ VO�� ���ִ� MAP ��ü
		Map<String,Object>map=null;
		//���� DB��ȸ�� ����� ���� LIST��ü
		ArrayList<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		ArrayList<String> columnList=new ArrayList<String>();
		//�� �� ���� ���� ����
		map=new HashMap<String,Object>();
		map.put("seq", "seq");
		map.put("title", "title");
		map.put("content", "content");
		map.put("testCol", "testCol");
		list.add(map);
		//DB��ȸ�� �����͸� ��Ҵٴ� ������ ������
		for(int i=0;i<10;i++){
		    map=new HashMap<String,Object>();
		    map.put("seq", i+1);
		    map.put("title", "�����̴�"+i);
		    map.put("content", "�����Դϴ�"+i);
		    map.put("testCol", "�׽�Ʈ�÷�"+i);
		    list.add(map);
		}
		//MAP�� KEY���� �������
		if(list !=null &&list.size() >0){
		    //LIST�� ù��° �������� KEY���� �˸� �ǹǷ�
		    Map<String,Object> m=list.get(0);
		    //MAP�� KEY���� columnList��ü�� ADD
		    for(String k : m.keySet()){
		        columnList.add(k);
		    }
		}
		//1���� workbook�� ����
		HSSFWorkbook workbook=new HSSFWorkbook();
		//2���� sheet����
		HSSFSheet sheet=workbook.createSheet("��Ʈ��");
		//������ ��
		HSSFRow row=null;
		//������ ��
		HSSFCell cell=null;
		//������ DB������ ��ȸ
		if(list !=null &&list.size() >0){
		    int i=0;
		    for(Map<String,Object> mapobject : list){
		        // ��Ʈ�� �ϳ��� ���� �����Ѵ�(i ���� 0�̸� ù��° �ٿ� �ش�)
		        row=sheet.createRow((short)i);
		        i++;
		        if(columnList !=null &&columnList.size() >0){
		            for(int j=0;j<columnList.size();j++){
		                //������ row�� �÷��� �����Ѵ�
		                cell=row.createCell(j);
		                //map�� ��� �����͸� ������ cell�� add�Ѵ�
		                cell.setCellValue(String.valueOf(mapobject.get(columnList.get(j))));
		            }
		        }
		    }
		}
		try {
			FileOutputStream fileoutputstream = new FileOutputStream("D:\\excelPoiTest.xls");
			//������ ����
			workbook.write(fileoutputstream);
			//�ʼ��� �ݾ��־���� 
			workbook.close(); 
			fileoutputstream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�������ϻ�������");
	}

}
