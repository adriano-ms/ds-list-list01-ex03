package view;

import br.edu.fateczl.list.List;

public class Main {

	public static void main(String[] args) throws Exception {
		
		List<Integer> list = new List<>();
		
		list.addLast(3);
		list.addLast(5);
		list.addLast(18);
		list.addLast(12);
		list.addLast(9);
		list.addLast(7);
		list.addLast(6);
		list.addLast(2);
		list.addLast(13);
		list.addLast(4);
		list.addLast(16);
		
		int size = list.size();
		
		for(int i = 0; i < size; i++) 
			System.out.print(list.get(i) + " ");
		
		for(int i = 0; i < size - 1; i++) {
			int aux = list.get(size - 1);
			list.removeLast();
			list.add(aux, i);
		}

		System.out.println();
		for(int i = 0; i < size; i++) 
			System.out.print(list.get(i) + " ");
	}

}
