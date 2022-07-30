package co.firmareal.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import co.firmareal.entity.Product;

//Used in DAO class and translates JDBC checked exception to unchecked exception
@Repository
public class ProductDaoImpl implements ProductDao {
    // Autowiring sessionFactory bean
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    // @Transactional will Automatically be start and end the transactions
    @Transactional
    public List<Product> getProducts() {
    // Getting session object from sessionFactory
        Session currentSession = sessionFactory.getCurrentSession();
    // creating query
        Query<Product> theQuery =
                currentSession.createQuery("from products", Product.class);
        // Getting list of products
        List<Product> products = theQuery.getResultList();
        return products;
    }
}