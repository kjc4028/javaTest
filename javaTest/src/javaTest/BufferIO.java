package javaTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferIO {

	public static void main(String[] args) throws IOException {

		File file = new File("D://DEV/bufferTest.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
		String str = "";
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		
	}

}
