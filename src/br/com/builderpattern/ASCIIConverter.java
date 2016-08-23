package br.com.builderpattern;

public class ASCIIConverter extends TextConverter {

	public ASCIIConverter() {
		super(TypeTextConvert.ASCIIConverter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String convertText(String text) {
		// TODO Auto-generated method stub
		return getAsciiText(text);
	}
	
	private String getAsciiText(final String text){
		String textoAscii = "Texto formatado para Ascii: " + text;
		return textoAscii;
	}

}
