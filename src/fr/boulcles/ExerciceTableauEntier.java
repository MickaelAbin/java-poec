package fr.boulcles;

public class ExerciceTableauEntier {

    public static void main(String[] args) {
        //Déclarez un tableau d’entiers contenant tous les entiers de 1 à 10
       int[] notes = new int[10];
        for (int i = 0; i <10 ; i++) {
            notes[i] = i+1;
        }
        //Affichez le premier élément du tableau
        System.out.println(notes[0]);

        //Affichez la longueur du tableau en utilisant la propriété length
        int longueur = notes.length;
        System.out.println(longueur);

        //Affichez le dernier élément du tableau en utilisant la propriété length
        System.out.println(notes[notes.length-1]);

        //Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8.
        notes[4]=8;
        System.out.println(notes[4]);

    }


}
