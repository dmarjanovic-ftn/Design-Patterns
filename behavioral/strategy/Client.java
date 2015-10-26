package behavioral.strategy;


import behavioral.strategy.sorters.Sorter;

public class Client {

		private Sorter sorter;
		
		public Client() {
			this.sorter = null;
		}
		
		public void setSorter(Sorter sorter) {
			this.sorter = sorter;
		}
		
		public void sort() {
			sorter.sort();
		}
}
