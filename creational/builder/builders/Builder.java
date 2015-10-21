package creational.builder.builders;

import creational.builder.product.Document;

public interface Builder {

	public void buildHeader(String text);
	public void buildSubheader(String text);
	public void buildParagraph(String text);
	public void buildList(String text);
	public void buildDefinition(String text);
	
	public Document getDocument();
}
