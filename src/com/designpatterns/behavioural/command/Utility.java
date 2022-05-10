package com.designpatterns.behavioural.command;

public class Utility {

	public static FileSystemReceiver getUnderlyingOS() {
		String osName = System.getProperty("os.name");
		System.out.println("Underlying os: " + osName);
		if (osName.contains("windows")) {
			return new WindowsFileSystemReceiver();
		} else {
			return new UnixFileSystemReceiver();
		}

	}
}
