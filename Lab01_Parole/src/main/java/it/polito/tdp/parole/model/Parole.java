package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	private LinkedList<String> elencoParole;
		
	public Parole() {
		//TODO
		elencoParole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		//TODO
		elencoParole.add(p);
	}
	
	public LinkedList<String> getElenco() {
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
			if(!p.equals(elencoParole.getLast()))
				risultato += "\n";
		}
		return risultato;
	}

}
