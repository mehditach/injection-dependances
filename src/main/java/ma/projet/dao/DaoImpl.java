package ma.projet.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Base de données");
        return 23.5;
    }
}