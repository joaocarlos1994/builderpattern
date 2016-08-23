package br.com.builderpattern;

public class TextWidgetConverter extends TextConverter {

	public TextWidgetConverter() {
		super(TypeTextConvert.TextWidgetConverter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String convertText(String text) {
		// TODO Auto-generated method stub
		return getTextWidget(text);
	}
	
	private String getTextWidget(final String text){
		String textoWidget = "Texto formatado para Ascii: " + text;
		return textoWidget;
	}

}
