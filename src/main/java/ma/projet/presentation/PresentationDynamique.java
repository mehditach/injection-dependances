package ma.projet.presentation;

import ma.projet.dao.IDao;
import ma.projet.metier.IMetier;
import ma.projet.metier.MetierImpl;
import java.io.File;
import java.util.Scanner;

public class PresentationDynamique {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClass = scanner.nextLine();
        String metierClass = scanner.nextLine();

        IDao dao = (IDao) Class.forName(daoClass).getConstructor().newInstance();
        IMetier metier = (IMetier) Class.forName(metierClass).getConstructor().newInstance();

        ((MetierImpl) metier).setDao(dao);
        System.out.println("Résultat = " + metier.calcul());
    }
}