package com.test1;
class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}
class SpaceException extends Exception	{
	SpaceException(String msg) {
		super(msg);
	}
}
class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}
public class Sample02 {

	public static void main(String[] args) {
		try {
			install();
			
		}catch (InstallException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		}catch (SpaceException e) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(e);
			throw ie;
		}catch(MemoryException me) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(me);
			throw ie;
		}finally {
			deleteTempFiles();
		}
	}
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
			
		}
		if(!enoughMemory()) {
			throw new MemoryException("�޸𸮰� �����ϴ�");
//			throw new RuntimeException(new MemoryException("�޸𸮰� �����մ�."));
		}
	}
	static void copyFiles() { /* ------- */ }
	static void deleteTempFiles() { /* ----- */}
	static boolean enoughSpace() { return false; }
	static boolean enoughMemory() { return true; }
}
