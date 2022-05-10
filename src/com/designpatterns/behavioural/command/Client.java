package com.designpatterns.behavioural.command;

public class Client {

	public static void main(String[] args) {
		FileSystemReceiver receiver = Utility.getUnderlyingOS();
		Command command = new OpenFileCommand(receiver);
		FileInvoker fileInvoker = new FileInvoker(command);
		fileInvoker.execute();
	}

}
