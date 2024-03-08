public class Main {
    public static void main(String[] args) {
        // Initialisation du refuge et ajout d'animaux
        RefugeAnimaux refuge = new RefugeAnimaux();
        
        
        refuge.ajouterAnimal(new Chat("Misty"));
        refuge.ajouterAnimal(new Chat("Shadow"));
        refuge.ajouterAnimal(new Chat("Sunny"));

        // 1. Accès et affichage du nom du premier animal dans le refuge

        refuge.getAnimaux().size();
        refuge.getAnimaux().add(new Chat("Misty"));
        if (!refuge.getAnimaux().isEmpty()) {
            String nomPremierAnimal = refuge.getAnimaux().get(0).getNom();
            System.out.println("Le premier animal dans le refuge est : " + nomPremierAnimal);
        }

        // 2. Affichage des noms de tous les animaux dans le refuge
        System.out.println("Tous les animaux dans le refuge :");
        for (Animal animal : refuge.getAnimaux()) {
            System.out.println(animal.getNom());
        }

        // 3. Recherche d'un animal spécifique par nom
        String nomCherche = "Shadow";
        for (Animal animal : refuge.getAnimaux()) {
            if (animal.getNom().equals(nomCherche)) {
                System.out.println(nomCherche + " est trouvé dans le refuge.");
                break; // Sortir de la boucle une fois l'animal trouvé
            }
        }

        // 4. Compter le nombre d'animaux dans le refuge
        int nombreAnimaux = refuge.getAnimaux().size();
        System.out.println("Il y a " + nombreAnimaux + " animaux dans le refuge.");

        // 5. Retirer un animal par son nom et afficher la nouvelle liste
        Animal animalARetirer = null;
        for (Animal animal : refuge.getAnimaux()) {
            if (animal.getNom().equals("Misty")) {
                animalARetirer = animal;
                break;
            }
        }
        if (animalARetirer != null) {
            refuge.retirerAnimal(animalARetirer);
            System.out.println("Après avoir retiré Misty:");
            for (Animal animal : refuge.getAnimaux()) {
                System.out.println(animal.getNom());
            }
        }

        

        // 6. Vérifier si le refuge est vide
        if (refuge.getAnimaux().isEmpty()) {
            System.out.println("Le refuge est vide.");
        } else {
            System.out.println("Le refuge n'est pas vide.");
        }

        // 7. Affichage des sons de tous les animaux dans le refuge
        System.out.println("Les animaux dans le refuge font leurs sons :");
        for (Animal animal : refuge.getAnimaux()) {
            animal.faireSon();
        }

         // Création d'un tableau de chats
         Chat[] tableauChats = new Chat[3];
         tableauChats[0] = new Chat("Misty");
         tableauChats[1] = new Chat("Shadow");
         tableauChats[2] = new Chat("Sunny");

         tableauChats[0].faireSon();
 
         // 1. Accès et affichage du nom du premier chat dans le tableau
         if (tableauChats.length > 0) { // Vérifie si le tableau n'est pas vide
             String nomPremierChat = tableauChats[0].getNom();
             System.out.println("Le premier chat dans le tableau est : " + nomPremierChat);
         }
 
         // 2. Affichage des noms de tous les chats dans le tableau
         System.out.println("Tous les chats dans le tableau :");
         for (Chat chat : tableauChats) {
             System.out.println(chat.getNom());
         }
 
         // 3. Recherche d'un chat spécifique par nom dans le tableau
         nomCherche = "Shadow";
         for (Chat chat : tableauChats) {
             if (chat.getNom().equals(nomCherche)) {
                 System.out.println(nomCherche + " est trouvé dans le tableau.");
                 break; // Sortir de la boucle une fois le chat trouvé
             }
         }
 
         // 4. Affichage des sons de tous les chats dans le tableau
         System.out.println("Les chats dans le tableau font leurs sons :");
         for (Chat chat : tableauChats) {
             chat.faireSon();
         }
    }
}
