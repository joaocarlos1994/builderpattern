package br.com.builderpattern;

public abstract class TextConverter {
	
	@SuppressWarnings("unused")
	private final TypeTextConvert typeTextConvert;
	
	public TextConverter(TypeTextConvert typeTextConvert) {
		super();
		this.typeTextConvert = typeTextConvert;
	}

	public abstract String convertText(final String text);
	
}
