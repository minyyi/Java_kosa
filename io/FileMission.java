package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class FileMission {

	public static void main(String[] args) {
		// 1. 바이트스트림을 이용하여 이미지 파일을 복사해보자
//		String source = "C:\\AI_Prompt\\JAVA\\java.png";
//		String dest = "C:\\AI_Prompt\\workspace\\java_work\\AI_Agent\\src\\kosa\\java.png";
//		CopyUtil.copyFile(new File(source), new File(dest));
		
//		File fs = new File(source);
//		File fd = new File(dest);
	
//		CopyUtil.copyFile(bs, bd);
//		CopyUtil.copyFile(fs, fd);
		String source = "C:\\kosa202408";
		String dest = "C:\\upload\\kosa202408";
		
		CopyUtil.copyDirectory(new File(source), new File(dest));
		
	}

}
