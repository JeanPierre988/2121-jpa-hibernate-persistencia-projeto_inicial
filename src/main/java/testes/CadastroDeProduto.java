package testes;

import br.com.alura.loja.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Produto celular = new Produto();
        celular.setNome("Xiaomi Redmi");
        celular.setDescricao("Chinesa");
        celular.setPreco(new BigDecimal("900"));

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(celular);
        em.getTransaction().commit();

        emf.close();
    }
}
