package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
			
		list.add("Maria");
		list.add("Marcelo");
		list.add("Cynthia");
		list.add("Maria dois");
		list.add("Brenda");
		list.add("Júlia");
		
		list.add(2, "Teste");
		
		System.out.println(list.size());
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("--------------------");
		
//		list.removeIf(x -> x.charAt(0) == 'M');
		
//		for (String string : list) {
//			System.out.println(string);
//		}
		String name = "Teste";
		System.out.println(name + " na posição: " + busca(name, list));
		
		//filtrar elementos na lista
		char c = 'M';
		System.out.println("Filtrando " + c + " " );
		for (String result : filters(list, c)) {
			System.out.println(result);
		}
		System.out.println("------------------------------");
		System.out.println("Encontrar o primeiro element de uma list<String>");
		char c2 = 'M';
		String name2 = list.stream().filter(x -> x.charAt(0) == c2).findFirst().orElse(null);
		System.out.println(name2 != null ? name2 : "Não encontrado!");
	}
	
	public static String busca(String name, List<String> lista) {
		return lista.indexOf(name) >= 0 ? lista.indexOf(name) + "" : "Não encontrado" ;
	}
	
	public static List<String> filters(List<String> list, Character c){
		List<String> result = list.stream().filter(x -> x.charAt(0) == c).collect(Collectors.toList());
		return result;
	}

}
