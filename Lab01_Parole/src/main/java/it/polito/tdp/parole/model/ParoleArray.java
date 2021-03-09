package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.ArrayList;


public class ParoleArray {
	
	private ArrayList<String> elencoParole;
		
	public ParoleArray() {
		//TODO
		elencoParole = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		//TODO
		elencoParole.add(p);
	}
	
	public ArrayList<String> getElenco() {
		//TODO
		Collections.sort(elencoParole);
		return elencoParole;
	}
	
	public void reset() {
		// TODO
		elencoParole.clear();
	}
	
	public void cancella(String parola) {
		for(int i=0; i<elencoParole.size(); i++) {
			String p = elencoParole.get(i);
			if(p.equals(parola)) {
				elencoParole.remove(i);
				break;
			}	
		}
	}
	
	public String toString() {
		String risultato = "";
		for(String p : elencoParole) {
			risultato += p;
			if(!p.equals(elencoParole.get(elencoParole.size()-1)))
				risultato += "\n";
		}
		return risultato;
	}

}
