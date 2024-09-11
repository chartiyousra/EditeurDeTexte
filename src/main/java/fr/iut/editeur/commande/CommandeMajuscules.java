package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscules extends CommandeDocument {

    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length > 3) {
            System.err.println("Format attendu : majuscules;debut;fin");
            return;
        }
        String debut = parameters[1];
        String fin = parameters[2];

        this.document.majuscules(Integer.parseInt(debut), Integer.parseInt(fin));
        super.executer();
    }

    @Override
    public String getDescriptionCommande(){
        return "description commande majuscules";
    }
}
