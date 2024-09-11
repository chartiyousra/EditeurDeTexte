package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }
    public void clear(){
        effacer(0,texte.length() - 1);
    }

    public void inserer(int debut, String ajout) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(debut);
        texte = partieGauche + ajout + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String partie = texte.substring(debut, fin);
        partie = partie.toUpperCase();
        remplacer(debut, fin-1, partie);
    }

    public void minuscules(int debut, int fin) {
        String partie = texte.substring(debut, fin);
        partie = partie.toLowerCase();
        remplacer(debut, fin-1, partie);
    }
    public void effacer(int debut, int fin) {
        remplacer(debut,fin,"");
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
