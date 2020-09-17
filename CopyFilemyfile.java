package ibm.home4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//2��ʹ���ļ�������myfile.txt�ļ�Ϊmyfile_cp.txt

public class CopyFilemyfile {
	public static void copyFile(String src, String dest) throws IOException {
		FileInputStream in = new FileInputStream(src);
		File file = new File(dest);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream out = new FileOutputStream(file);
		int c;
		byte buffer[] = new byte[1024];
		while ((c = in.read(buffer)) != -1) {
			for (int i = 0; i < c; i++)
				out.write(buffer[i]);
		}
		in.close();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		String fileSrc = "C:/Users/26097/Desktop/2233/myfile.txt";
		String fileDes = "C://Users/26097/Desktop/2233/Copy/myfile_cp.txt";
		copyFile(fileSrc, fileDes);
		System.out.println("ʹ���ļ�������myfile");

	}
}
