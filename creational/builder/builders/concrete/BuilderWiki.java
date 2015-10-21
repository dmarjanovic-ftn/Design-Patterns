package creational.builder.builders.concrete;

import creational.builder.builders.Builder;
import creational.builder.product.Document;

public class BuilderWiki implements Builder {
	
	private Document product = new Document();

	@Override
	public void buildHeader(String text) {
		product.setDocumentText(product.getDocumentText() + "[" + text + "]\n");
	}

	@Override
	public void buildSubheader(String text) {
		product.setDocumentText(product.getDocumentText() + "[[" + text + "]]\n");
	}

	@Override
	public void buildParagraph(String text) {
		product.setDocumentText(product.getDocumentText() + text + "\n");
	}

	@Override
	public void buildList(String text) {
		product.setDocumentText(product.getDocumentText() + "{" + text + "}\n");
	}

	@Override
	public void buildDefinition(String text) {
		product.setDocumentText(product.getDocumentText() + " def: " + text + "\n");
	}

	@Override
	public Document getDocument() {
		return product;
	}

}
