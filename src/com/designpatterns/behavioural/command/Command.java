package com.designpatterns.behavioural.command;

public interface Command {

	void execute();

	// could add an undo or redo commands

}

class OpenFileCommand implements Command {

	private FileSystemReceiver receiver;

	// store previous state for undo

	public OpenFileCommand(FileSystemReceiver receiver) {
		this.receiver = receiver;

	}

	@Override
	public void execute() {
		// save previous state, in case undo called
		this.receiver.openFile();

	}

}

class CloseFileCommand implements Command {

	private FileSystemReceiver receiver;

	public CloseFileCommand(FileSystemReceiver receiver) {
		this.receiver = receiver;

	}

	@Override
	public void execute() {
		// save previous state, in case undo called
		this.receiver.closeFile();

	}

}

class WriteFileCommand implements Command {

	private FileSystemReceiver receiver;

	public WriteFileCommand(FileSystemReceiver receiver) {
		this.receiver = receiver;

	}

	@Override
	public void execute() {
		// save previous state, in case undo called
		this.receiver.writeFile();

	}

}
