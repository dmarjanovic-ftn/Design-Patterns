package behavioral.strategy;

import behavioral.strategy.sorters.BubbleSort;
import behavioral.strategy.sorters.QuickSort;

public class App {

	public static void main(String[] args) {

		Client client = new Client();
		client.setSorter(new QuickSort());
		client.sort();
		
		System.out.println();
		
		client.setSorter(new BubbleSort());
		client.sort();

	}

}
