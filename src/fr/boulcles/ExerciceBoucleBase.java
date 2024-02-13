package fr.boulcles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        String prenom = "Mickael";
        String nom = "Abin";
        for (int i = 1; i < 21; i++) {
            System.out.println(prenom +" "+nom);
        }

        for (int i = 2; i < 101; i=i+2) {
            System.out.println(i);
        }

        for (int i = 1; i <101 ; i=i+2) {
            System.out.println(i);
        }
    }
}
