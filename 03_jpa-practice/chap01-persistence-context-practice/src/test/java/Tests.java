import org.junit.jupiter.api.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.assertNull;

public class Tests {

    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }

    @BeforeEach
    public void initManager() {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @AfterAll
    public static void closeFactory() {
        entityManagerFactory.close();
    }

    @AfterEach
    public void closeManager() {
        entityManager.close();
    }

    @Test
    public void 영속성_테스트_코드() {
        Order order = new Order();

        order.setOrderDate("23-05-20");
        order.setOrderTime("10:53:51");
        order.setTotalOrderPrice(5000);

        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.persist(order);
        entityTransaction.commit();

        entityManager.detach(order);

        entityTransaction.begin();
        Order mergedOrder = entityManager.merge(order);
        entityManager.remove(mergedOrder);
        entityTransaction.commit();
    }

}
