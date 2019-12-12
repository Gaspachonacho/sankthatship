package battleships;

import java.util.*;


public class Board {
	Map<Coordinates, Pieces> map = new HashMap<Coordinates, Pieces>(); 
	
	
	public void addToMap(Coordinates key, Pieces value) {
		map.put(key, value);
	}
	
	public void makeBoard(String key, char value) {
		
		int size = 10;
		char K = 'A';
		String keys = "";
		char values = '~';
		
		for (int yAx = 0; yAx < size; yAx++) {
			
			for (int xAx = 0; xAx < size; xAx++) {
				keys = "" + K + xAx;
				addToMap(new Coordinates(keys), new Pieces (values));
			}
		K++;
		}
	
	}

}
