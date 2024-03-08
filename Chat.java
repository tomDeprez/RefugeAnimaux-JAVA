class Chat implements Animal {
    private String nom;

    public Chat(String nom) {
        this.nom = nom;
    }

    public void faireSon() {
        System.out.println(this.nom + " dit : Miaou!");
    }

    public String getNom() {  // Implémentation de getNom()
        return nom;
    }
}