package ex.th;

import java.io.*;

public class FileCopy extends Thread {

	File originF;
	File copyF;
	// File 타입의 생성자 생성 
	FileCopy(File originF, File copyF) {
		this.originF = originF;
		this.copyF = copyF;
	}
		
	@Override
	public void run() {
				
		try {
			InputStream  in = new FileInputStream(originF);
			OutputStream out = new FileOutputStream(copyF);

			int readLen = 0;
			int copybyte = 0;

			byte[] b = new byte[1024];

			while (true) {

				readLen = in.read(b);

				if (readLen == -1) {
					break;
				}

				out.write(b, 0, readLen);

				copybyte += readLen;
			}
			in.close();
			out.close();
			System.out.println("파일의 복사가 완료되었습니다.");
			System.out.println("데이터의 크기는:"+copybyte);

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}				
	}
}