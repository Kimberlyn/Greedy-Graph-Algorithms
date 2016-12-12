package Project;

import java.util.Arrays;

public class MST extends GreedyGraph {
	private double cost;
	private double sum;
	
	public MST(String name) throws java.io.IOException {
		super(name);
	}
	
	/**
	 * Override this method to define formula used to compute new cost of vertex being processed. 
	 * Formula depends on problem being solved.
	 * @param v vertex being visited
	 * @param w vertex being processed
	 */	
	public double newCost(int v, int w) {		
		cost = weightOf(getEdge(w,v));
		return cost;
	}
	
	public String toString() {
		StringBuffer buf=new StringBuffer("Name="+name+", order="+order+", size="+size+", ");
		buf.append("directed="+directed+", weighted="+weighted+"\n");
		for (int v=0; v<order; v++) buf.append("   "+v+" => "+Arrays.toString(getNeighbors(v))+"\n");
		return buf+"";
	}
	
    public String selectedEdges() {
        StringBuffer buf=new StringBuffer("");
        for (int v = 0; v < getSize(); v++) {
        	if(getEdges()[v].isSelected()) {
        		sum += getEdges()[v].getWeight();
        		buf.append("("+getEdges()[v].getTail()+", "+getEdges()[v].getHead()+", "+getEdges()[v].getWeight()+")\n");
        		}
        }
        return buf+"" + "MST cost = " + sum;
    }

}
