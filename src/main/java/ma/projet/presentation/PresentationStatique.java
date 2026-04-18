package ma.projet.presentation;

import ma.projet.dao.DaoImpl;
import ma.projet.metier.MetierImpl;

public class PresentationStatique {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Résultat = " + metier.calcul());
    }
}