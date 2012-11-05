package compiler;

import java.util.ArrayList;
import java.util.List;

/**
 * Tabela de s�mbolos, cont�m o mapeamento dos s�mbolos reconhecidos no texto
 * fonte com os ID's atribu�dos � eles
 * 
 */
public class SymbolTable {

	private static SymbolTable INSTANCE;
	
	private List<String> table;

	private SymbolTable() {
		table = new ArrayList<String>();
	}
	
	public static SymbolTable getInstance(){
		if(INSTANCE == null){
			INSTANCE = new SymbolTable();
		}
		return INSTANCE;
	}
	
	public Integer get(String key) {
		return table.indexOf(key);
	}

	public int put(String identifier) {
		table.add(identifier);
		return table.indexOf(identifier);
	}

	public boolean contains(String identifier) {
		return table.contains(identifier);
	}

	@Override
	public String toString() {
		String stringForm = "Symbol Table:\n";
		for (String entry : table) {
			stringForm += (table.indexOf(entry) + " = " + entry + "\n");
		}
		return stringForm;
	}

}
