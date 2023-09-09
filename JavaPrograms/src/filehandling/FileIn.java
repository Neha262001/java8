package filehandling;

import java.io.FileInputStream;

import java.io.IOException;


public class FileIn {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:/file1.txt");
	//	int i = fis.read();
		//while(i!=-1) {
			//System.out.println((char)i);
		//	i=fis.read();
	//	}
      fis.close();
	}

}
