package dataAccess.concretes;

import dataAccess.abstracts.SaleDao;
import entities.concretes.Sale;

public class HibernateSaleDao implements SaleDao {

    @Override
    public void add(Sale sale) {
        System.out.println(sale.getId() + " eklendi ");
    }

    @Override
    public void delete(Sale sale) {
        System.out.println(sale.getId() + " silindi");
    }

    @Override
    public void update(Sale sale) {
        System.out.println(sale.getId() + " güncellendi");
    }

    @Override
    public void list(Sale[] sales) {
        for (Sale sale : sales) {
            System.out.println(sale.getId());
        }
    }
}
