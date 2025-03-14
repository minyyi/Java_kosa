package kosa.io;

import java.io.File;

public class FileExam {
	
	public static void show(File file) {
		File list[] = file.listFiles(); //폴더 안에 있는 목록을 파일 객체로 만들어줌.
		
		for(int i = 0; i < list.length; i++) {
			if(list[i].isDirectory()) {
				System.out.println();
				System.out.println("##" + list[i].getName() + "##" );
				show(list[i]);
			}else {
				System.out.println("__" + list[i].getName() + "__");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\AI_Prompt\\workspace\\java_work\\AI_Agent\\src";
		
		File f = new File(path);
		show(f);
//		if (f.isDirectory()) {
//			System.out.println("디렉토리");
//		}else {
//			System.out.println("파일");
//		}
	}

}
