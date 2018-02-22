package core;

public class Partition {
	
	// Tests
	public static void main(String[] args) {
		int[] tab = { 1, 2, 3, 4, 5 };

		System.out.println("\n*******************test2");
		Integer[][] tabRes2 = partition(tab, 2);
		for (int i = 0; i < tabRes2.length; i++) {
			System.out.println(tabRes2[i][0] + "," + tabRes2[i][1]);
		}
		System.out.println("\n*******************test1");

		Integer[][] tabRes1 = partition(tab, 1);
		for (int i = 0; i < tabRes1.length; i++) {
			System.out.println(tabRes1[i][0]);
		}

		System.out.println("\n*******************test3");
		Integer[][] tabRes3 = partition(tab, 3);
		for (int i = 0; i < tabRes3.length; i++) {
			System.out.println(tabRes3[i][0] + "," + tabRes3[i][1] + "," + tabRes3[i][2]);
		}
	}

	/*
	 * Fonction partition qui qui prend un paramètre « liste" et un paramètre «
	 * taille » et retourne une liste de sous liste, où chaque sous liste a au
	 * maximum « taille » éléments. Exemples d'entrées et sorties :
	 * partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
	 * partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ] 
	 * partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]
	 * Utilisation des tableaux mais il est possible aussi d'utiliser des ArrayList
	 */
	public static Integer[][] partition(int[] listInt, int length) {
		// Utilisation de Integer pour avoir NULL et non 0
		int nbLists = (int) Math.ceil((float) listInt.length / (float) length);
		Integer[][] resultTab = new Integer[nbLists][length];
		int row = 0;
		int column = 0;

		for (int i = 0; i < listInt.length; i++) {
			resultTab[row][column] = listInt[i];
			column++;
			
			// Début d'une nouvelle sous-liste
			if (i % length == length - 1) {
				row = row + 1;
				column = 0;
			}

		}
		return resultTab;
	}

}
