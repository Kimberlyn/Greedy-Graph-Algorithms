package Project;

import java.io.IOException;
import java.util.ArrayList;

public class GreedyDriver {
	static ArrayList<Integer> temp = new ArrayList<Integer>();
	static ArrayList<Integer> path = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException{
		 	
		MST mst = new MST(args[0]);
		mst.greedy(0);
		System.out.println(mst.toString());
		System.out.println("MST edges");
        System.out.println(mst.selectedEdges());
        System.out.println(args[0]);
		System.out.println("~~~~~~~~");
		System.out.println("SPT edges");
		SPT spt = new SPT(args[0]);
		spt.greedy(0);
		int last = spt.getOrder()-1;
		temp.add(spt.getOrder()-1);
		spt.getVertex(last);
		while (last>0){
			temp.add((spt.getVertex(last).getParent()));
			last = spt.getVertex(last).getParent();
		}

		System.out.println(spt.selectedEdges());
        System.out.println(args[0]);
        
        for (int i = temp.size()-1; i >=0; i--) {
        	path.add(temp.get(i));
        }
        System.out.println("Path from " + path.get(0) + " to " + path.get(path.size()-1) + "="+ path);
        System.out.println("Distance = " + spt.costOf(path.get(path.size()-1)));
	}

}
