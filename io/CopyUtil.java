package kosa.io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CopyUtil {
	
	//디렉토리 복사(해동 폴더 복사해서 새로운 디렉토리를 생성 후 모든 파일을 복사)
	public static void copyDirectory(File source, File dest) {
		if(source.isDirectory()) {
			dest.mkdirs();
			
			File fileList[] = source.listFiles(); //
			for(int i = 0;i < fileList.length; i++) {
				File sourceFile = fileList[i];
				if(sourceFile.isDirectory()) {
					File s_destFile = new File(dest,  sourceFile.getName()); //소스파일 복사할 자식폴더이름 가져와서 경로로 설정
					copyDirectory(sourceFile, s_destFile);
				}else {
					File destFile = new File(dest,	 sourceFile.getName());
					copyFile(sourceFile, destFile);
				}
			}
		}
	}
	
	
	// 바이트값을 가진 파일 1개를 복사하는 메서드

	public static void copyFile(File source, File dest) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
//		FileReader reader = null;
//		FileWriter writer = null;
		byte bt[] = new byte[1024];
		int data = 0;
		try {
//			reader = new FileReader(source);
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);

			while ((data = fis.read(bt)) != -1) {
				fos.write(bt, 0, data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			System.out.println("copy done!");
		}
	}
}
