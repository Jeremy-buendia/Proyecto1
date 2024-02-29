package unidad4.estructuras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import unidad4.model.ClienteDO;

public class EjemploListas {

	public static void main(String[] args) {
		// Definición de Array básico de JAVA
		int listNumeros[] = new int[20];

		// Array estandar
		String listaNombres3[] = { "Pablo", "Sergio", "Alex" };

		// Definición de un arrayList de números
		List<Integer> listaNumeros = new ArrayList<Integer>();

		List<String> listaNombres = new ArrayList<String>();
		List<String> listaNombres2 = new ArrayList<String>();

		// Creamos una lista de clientes
		List<ClienteDO> listaClientes = new ArrayList<ClienteDO>();

		List<ClienteDO> listaClientes2 = new ArrayList<ClienteDO>();

		ClienteDO cliente1 = new ClienteDO(1, "Jorge", "Perlita", 119, 'M', null, "toitoto");
		ClienteDO cliente2 = new ClienteDO(2, "LuisMi", "Toscano", 19, 'M', "em@gmail.com", "toitoto");
		ClienteDO cliente3 = new ClienteDO(3, "Jorge", "Toscano", 29, 'M', "em2@gmail.com", "toitoto");
		ClienteDO cliente4 = new ClienteDO(2, "Fran", "Vazquez", 14, 'M', "em3@gmail.com", "toitoto");
		ClienteDO cliente5 = new ClienteDO(3, "Rubén", "Perez", 22, 'M', "em42@gmail.com", "toitoto");

		// Añadir a la lista
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		listaClientes.add(cliente3);

		listaClientes2.add(cliente4);
		listaClientes2.add(cliente5);

		// Añadir múltiples elementos de otra lista de tipo compatible
		listaClientes2.addAll(listaClientes);

		// Añadir a la lista en una posición (desplazará a los que ahora van después)
		listaClientes.add(1, cliente3);

		// Seleccionar una posición
		System.out.println("Cliente en la posición 1: " + listaClientes.get(0));

		System.out.println(listaClientes2);

		listaNombres.add("Juanjo");
		listaNombres.add("Juanjo2");
		listaNombres.add("Juanjo3");
		listaNombres.add("Pepe");
		listaNombres.add("Juanjo");
		listaNombres.add("Juanjo2");
		listaNombres.add("Juanjo3");
		listaNombres.add("Pepe");

		listaNombres2.add("Pepe");
		listaNombres2.add("Juanjo3");

		// Cortar una lista y agregarla en otra
		listaNombres2 = listaNombres.subList(3, 7);
		System.out.println("La lista2 contiene: " + listaNombres2);

		// Para buscar hay dos funciones principalmente (indexOf y contains)
		System.out.println("¿Está Juanjo2 en la lista? " + listaNombres.contains("Juanjo2"));

		// Buscar la posición de un elemento en una lista
		int posicionJuanjo2 = listaNombres.indexOf("Juanjo2");
		System.out.println("Juanjo2 está en la posición " + posicionJuanjo2);

		// Eliminar un elemento
		listaNombres.remove(1);
		System.out.println("¿Está Juanjo2 en la lista? " + listaNombres.contains("Juanjo2"));

		// Elimina todos los elementos de la lista
		// listaNombres.clear();

		// Mantiene los elementos comunes de dos listas
		// listaNombres.retainAll(listaNombres2);
		// System.out.println("Elementos retenidos: " + listaNombres);

		// Número de elementos de una lista
		System.out.println("Número de elementos de una lista: " + listaNombres.size());

		// Conversión de Array a Lista
		List<String> listaNombres4 = Arrays.asList(listaNombres3);

		// Conversión de Lista a Array
		String listaNombres5[] = (String[]) (listaNombres4.toArray());
	}

}
