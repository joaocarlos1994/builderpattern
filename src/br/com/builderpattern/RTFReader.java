package br.com.builderpattern;

public class RTFReader {
	
	public static void main(String[] args) {
		
		TextConverter textConverter = new ASCIIConverter();
		System.out.println(textConverter.convertText("Texto ASCII"));
		
	}

}
