package com.designpatterns.behavioural.memento;

public class Client {

	public static void main(String[] args) {
		FileWriterUtilOriginator originator = new FileWriterUtilOriginator("abc.txt");
		originator.write("First Line :  \nSecond Line:  \n");
		
		FileWriterCareTaker careTaker = new FileWriterCareTaker();
		careTaker.save(originator);
		
		//first draft
		System.out.println(originator.toString());
		
		originator.write("Third Line :  \nFourth Line:  \n");
		careTaker.save(originator);
		
		//second draft
		System.out.println(originator.toString());
		
		
		originator.write("Fifth Line :  \nSixth Line:  \n");
		//After writing
		System.out.println(originator.toString());
		//Don't need it --> go back to last saved
		careTaker.undo(originator);
		System.out.println("After Undo:  \n" + originator.toString());
		
		
	}

}
