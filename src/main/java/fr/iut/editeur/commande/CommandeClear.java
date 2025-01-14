package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument {

    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length > 1) {
            System.err.println("Format attendu : clear");
            return;
        }
        //ajout commentaire pour commit

        this.document.clear();
        super.executer();
    }
    @Override
    public String getDescriptionCommande(){
        return "description commande clear";
    }

}