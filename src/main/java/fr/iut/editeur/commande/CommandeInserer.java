package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument {

    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : insérer;debut;ajout");
            return;
        }

        String debut = parameters[1];
        String ajout= parameters[2];

        this.document.inserer(Integer.parseInt(debut),ajout);
        super.executer();
    }

}