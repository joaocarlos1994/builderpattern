package br.com.builderpattern;

public class TeXConverter extends TextConverter {
	
	public TeXConverter() {
		super(TypeTextConvert.TeXConverter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String convertText(String text) {
		// TODO Auto-generated method stub
		return getTeXText(text);
	}
	
	private String getTeXText(final String text){
		String textoTeX = "Texto formatado para Ascii: " + text;
		return textoTeX;
	}

}
