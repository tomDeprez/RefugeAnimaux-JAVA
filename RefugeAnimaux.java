import java.util.ArrayList;
import java.util.List;

class RefugeAnimaux {
    private List<Animal> animaux;

    public RefugeAnimaux() {
        this.animaux = new ArrayList<>();
    }

    public void retirerAnimal(Animal animal) {
        animaux.remove(animal);
    }

    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    public List<Animal> getAnimaux() {  // Méthode pour obtenir la liste des animaux
        return animaux;
    }

    int size(){
        Integer count = 0;
        for (Animal animal : this.animaux) {
            count = count + 1;
        }
        return count;
    };
}