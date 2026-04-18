package ma.projet.metier;

import ma.projet.dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;

    public MetierImpl() {}

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getData() * 2;
    }
}