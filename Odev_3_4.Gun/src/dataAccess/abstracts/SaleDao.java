package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Sale;

public interface SaleDao {

    public void add(Sale sale);

    public void delete(Sale sale);

    public void update(Sale sale);

    List<Sale> get(int id);

    List<Sale> getAll();

}
