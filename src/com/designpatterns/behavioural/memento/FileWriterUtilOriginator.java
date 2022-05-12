package com.designpatterns.behavioural.memento;

public class FileWriterUtilOriginator {

	private String fileName;
	private StringBuilder content;

	public FileWriterUtilOriginator(String fileName) {
		this.fileName = fileName;
		content = new StringBuilder();
	}

	@Override
	public String toString() {
		return this.content.toString();
	}

	public void write(String append) {
		this.content.append(append);
	}

	public Memento save() {
		return new Memento(this.fileName, this.content);
	}

	public void undoToLastSave(Object obj) {
		Memento memento = (Memento) obj;
		this.fileName = memento.fileName;
		this.content = memento.content;
	}

	private class Memento {
		private String fileName;
		private StringBuilder content;

		public Memento(String fileName, StringBuilder content) {
			this.fileName = fileName;
			// notice the deep copy --> the contents are not pointing to the same object
			this.content = new StringBuilder(content);
		}
	}

}
