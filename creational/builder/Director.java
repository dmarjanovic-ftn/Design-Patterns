package creational.builder;

import creational.builder.builders.Builder;
import creational.builder.product.Document;

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		this.setBuilder(builder);
	}
	
	public Document constructProduct() {
		
		builder.buildHeader("Real Madrid C.F");
		builder.buildSubheader("the greatest club in the world");
		builder.buildParagraph("Current captain of Real Madrid is Serhio Ramos. Former captains are Iker Casillas and Raul Gonzales Blanco.");
		
		return builder.getDocument();
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
}
