package com.shan.spoj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

import com.sun.javafx.scene.NodeHelper.NodeAccessor;

public class MSTPrims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] edgesWithWeights = {"1 2 1","2 3 2","2 4 6","5 2 1","5 1 3","4 5 2","3 4 3"};
		String[] edgeDetails;
		String edge = "";
		ArrayList<Node> nodesArr = new ArrayList<Node>();
		ArrayList<Edge> edgeArr = new ArrayList<Edge>();
		int[] visited;
		for(int i = 0; i< edgesWithWeights.length;i++){
			edgeDetails = edgesWithWeights[i].split(" ");
			edgeDetails
		}
		takeMinFromAdjacent(edgeArr,nodesArr);
			
		
	}

	private static void takeMinFromAdjacent(ArrayList<Edge> edgeArr,
			ArrayList<Node> nodesArr) {
		// TODO Auto-generated method stub
		ListIterator<Node> nodeItr = nodesArr.listIterator();
		while(nodeItr.hasNext()){
			Node n = nodeItr.next();
			Edge e = containsNode(edgeArr,n);
		}
	}

	private static Edge containsNode(ArrayList<Edge> edgeArr, Node n) {
		// TODO Auto-generated method stub
		ListIterator<Edge> edgeItr = edgeArr.listIterator();
		while(edgeItr.hasNext()){
			Edge e = edgeItr.next();
			if(e.getEndingNode().equals(n) || e.getStartingNode().equals(n)){
				return e;
			}
		}
		return null;
	}

}
