import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sample");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Book book = new Book();
        book.setName("123444");



        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        entityManager.persist(book);

        transaction.commit();

        entityManager.close();
        entityManagerFactory.close();


    }

}
