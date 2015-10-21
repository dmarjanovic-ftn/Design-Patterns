package creational.builder;

import creational.builder.builders.concrete.BuilderHTML;
import creational.builder.builders.concrete.BuilderWiki;
import creational.builder.product.Document;


public class App {
	
	/* EXAMPLE: Document format conversion
	 * 
	 * 		Document can contain:
	 * 			- header
	 * 			- subheader
	 * 			- paragraph
	 * 			- list
	 * 			- definition
	 */

	public static void main(String[] args) {
		
		// Director will make HTML document
		Director director = new Director(new BuilderHTML());
		
		Document document = director.constructProduct();
		System.out.println(document.getDocumentText());
		
		// Now we'll set another builder to director
		director.setBuilder(new BuilderWiki());
		
		// Now let's see what document will be constructed
		document = director.constructProduct();
		System.out.println(document.getDocumentText());

	}

}
