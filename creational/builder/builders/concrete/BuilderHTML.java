package creational.builder.builders.concrete;

import creational.builder.builders.Builder;
import creational.builder.product.Document;

public class BuilderHTML implements Builder {
	
	private Document product = new Document();

	@Override
	public void buildHeader(String text) {
		product.setDocumentText(product.getDocumentText() + "<h1>" + text + "</h1>\n");
	}

	@Override
	public void buildSubheader(String text) {
		product.setDocumentText(product.getDocumentText() + "<h4>" + text + "</h4>\n");
	}

	@Override
	public void buildParagraph(String text) {
		product.setDocumentText(product.getDocumentText() + "<p>" + text + "</p>\n");
	}

	@Override
	public void buildList(String text) {
		product.setDocumentText(product.getDocumentText() + "<ul>" + text + "</ul>\n");
	}

	@Override
	public void buildDefinition(String text) {
		product.setDocumentText(product.getDocumentText() + "<def>" + text + "</def>\n");
	}

	@Override
	public Document getDocument() {
		return product;
	}

}
