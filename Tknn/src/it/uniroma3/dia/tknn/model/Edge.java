package it.uniroma3.dia.tknn.model;


public class Edge extends Element{

	private int stemSize; //Numero di parentesi che compongono l'arco ( size dello Stem)
	private Node destination;
	
	private boolean removed; //Flag di rimozione in caso di arco consecutivo
	


	public Edge(int i, int j) {
		super(i, j); 
		this.stemSize =0;
		this.removed = false; 
	}
	public boolean isRemoved() {
		return removed;
	}

	public void setRemoved(boolean removed) {
		this.removed = removed;
	}
	public int getStemSize() {
		return stemSize;
	}

	public void setStemSize(int stemSize) {
		this.stemSize = stemSize;
	}

	public Node getDestination() {
		return destination;
	}

	public void setDestination(Node destination) {
		this.destination = destination;
	}

}
