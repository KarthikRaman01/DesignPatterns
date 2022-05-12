package com.designpatterns.behavioural.memento;

public class FileWriterCareTaker {
	
	private Object obj;
	
	public void save(FileWriterUtilOriginator fwu) {
		this.obj = fwu.save();
	}
	
	public void undo(FileWriterUtilOriginator fwu) {
		fwu.undoToLastSave(this.obj);
		
	}
	

}
