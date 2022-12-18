package com.rafael.backend.util;

import java.util.ArrayList;

public class DataValidation {
	Boolean validaD = false;
	public Boolean DataValidation(String raw) {
		String stringInput[] = raw.substring(10,raw.length()-2).split(",");
		// cria arraylists de strings
		ArrayList<ArrayList<String>> dna = new ArrayList<ArrayList<String>>();	// lista do dna
		// percorre o array de strings
		for (int i = 0; i < stringInput.length; i++) {
			ArrayList<String> elemento = new ArrayList<String>();	// lista do elemento
			char [] cArray = stringInput[i].toCharArray();
			for (int j = 0; j < cArray.length; j++) {
				elemento.add(Character.toString(cArray[j]));
			}
			dna.add(elemento);
		}
	return (validaH(dna) || validaV(dna) || validaDC(dna) || validaDD(dna) ? true : false);
	}
	
	// Converter string para matriz (arraylist)
	public ArrayList<ArrayList<String>> dataConvert(String raw) {
		String stringInput[] = raw.substring(10,raw.length()-2).split(",");
		// cria arraylists de strings
		ArrayList<ArrayList<String>> dna = new ArrayList<ArrayList<String>>();	// lista do dna
		// percorre o array de strings
		for (int i = 0; i < stringInput.length; i++) {
			ArrayList<String> elemento = new ArrayList<String>();	// lista do elemento
			char [] cArray = stringInput[i].toCharArray();
			for (int j = 0; j < cArray.length; j++) {
				elemento.add(Character.toString(cArray[j]));
			}
			dna.add(elemento);
		}
		return dna;
	}
	// varredura horizontal
	public Boolean validaH(ArrayList<ArrayList<String>> dna) {
		for (int i = 0;  i < dna.get(0).size(); i++) {
			int contIguais = 0;
			String caracter = " ";
			for (int j = 0; j < dna.size(); j++) {
				if ((caracter.equals(dna.get(i).get(j))) || (contIguais == 0)) {
					contIguais++;
				}
				if (contIguais == 4) {
					return true;
				} else {
                    contIguais = 1;
                }
				caracter = dna.get(i).get(j);
			}
		}
		return false;
	}
	// varredura vertical
	public Boolean validaV(ArrayList<ArrayList<String>> dna) {
		for (int j = 0;  j < dna.get(0).size(); j++) {
			int contIguais = 0;
			String caracter = " ";
			for (int i = 0; i < dna.size(); i++) {
				if ((caracter.equals(dna.get(i).get(j))) || (contIguais == 0)) {
					contIguais++;
				}
				if (contIguais == 4) {
					return true;
				} else {
					contIguais = 1;
				}
				caracter = dna.get(i).get(j);
			}
		}
		return false;
	}
	public Boolean validaD(ArrayList<ArrayList<String>> dna) {
		Boolean vD = false;
		for (int j = 0;  j < dna.get(0).size(); j++) {
			int contIguais = 0;
			String caracter = " ";
			for (int i = 0; i < dna.size(); i++) {
				if ((caracter.equals(dna.get(i).get(j))) || (contIguais == 0)) {
					contIguais++;
				}
				if (contIguais == 4) {
					return true;
				} else {
					contIguais = 1;
				}
				caracter = dna.get(i).get(j);
			}
		}
		return false;
	}
	
	// diagonal crescente
	public Boolean validaDC(ArrayList<ArrayList<String>> dna) {
		for (int i = 0;  i < dna.get(0).size()-1; i++) {
			int nLinhas = dna.size()-1;
			int nColunas = dna.get(0).size()-1;
			for (int j = 0; j < dna.size()-1; j++) {
				String caractereLinha1 = dna.get(i).get(j);
				if ((i+1 > nLinhas) || (j+1 > nColunas)) {
					break;
				}
				String caractereLinha2 = dna.get(i).get(j);
				if ((i+2 > nLinhas) || (j+2 > nColunas)) {
					break;
				}
				String caractereLinha3 = dna.get(i).get(j);
				if ((i+3 > nLinhas) || (j+3 > nColunas)) {
					break;
				}
				String caractereLinha4 = dna.get(i+3).get(j+3);
				if ((caractereLinha1.equals(caractereLinha2))
						&& (caractereLinha2.equals(caractereLinha3))
                        && (caractereLinha3.equals(caractereLinha4))) {
                    System.out.println("diagonal cresc.");
                    return true;
                }
			}
		}
	return false;
	}
	// diagonal decrescente
	public Boolean validaDD(ArrayList<ArrayList<String>> dna) {
		for (int i = 0;  i < dna.get(0).size()-1; i++) {
			int nLinhas = dna.size()-1;
			int nColunas = dna.get(0).size()-1;
			for (int j = 0; j < dna.size()-1; j++) {
				String caractereLinha1 = dna.get(i).get(j);
				if ((i+1 > nLinhas-1) || (j-1 > 0)) {
					break;
				}
				String caractereLinha2 = dna.get(i).get(j);
				if ((i+2 > nLinhas-1) || (j-2 > 0)) {
					break;
				}
				String caractereLinha3 = dna.get(i).get(j);
				if ((i+3 > nLinhas-1) || (j-3 > 0)) {
					break;
				}
				String caractereLinha4 = dna.get(i+3).get(j-3);
				if ((caractereLinha1.equals(caractereLinha2))
						&& (caractereLinha2.equals(caractereLinha3))
                        && (caractereLinha3.equals(caractereLinha4))) {
                    System.out.println("diagonal decresc.");
                    return true;
                }
			}
		}
	return false;
	}
	
// end of class	
}
