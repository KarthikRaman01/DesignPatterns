package com.designpatterns.behavioural.command;

public interface FileSystemReceiver {

	void openFile();

	void writeFile();

	void closeFile();

}

class UnixFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Unix Open File");

	}

	@Override
	public void writeFile() {
		System.out.println("Unix Write File");

	}

	@Override
	public void closeFile() {
		System.out.println("Unix Close File");

	}

}

class WindowsFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Windows Open File");

	}

	@Override
	public void writeFile() {
		System.out.println("Windows Write File");

	}

	@Override
	public void closeFile() {
		System.out.println("Windows Close File");

	}

}
