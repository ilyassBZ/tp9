package ma.cigma.pfe.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ma.cigma.pfe.models.client;

public class clientdaoimpl {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
	EntityManager em = emf.createEntityManager();
	
    @Override
    public boolean save(client c) {
    	em.getTransaction().begin();
    	em.persist(c);
    	em.getTransaction().commit();
    	return true;
    }

	@Override
	public client update(client c) {
		em.getTransaction().begin();
		client currentClient =
		em.find(client.class,c.getId());
		currentClient.setName(c.getName());
		em.persist(currentClient);
		em.getTransaction().commit();
		return c;
	}

	@Override
	public boolean deleteById(long idClient) {
		em.getTransaction().begin();
		client clientInDataBase = em.find(client.class , idClient);
		if(clientInDataBase!=null) em.remove(clientInDataBase);
		em.getTransaction().commit();
		return true;
	}

	@Override
	public Client findById(long idClient) {
		return em.find(Client.class , idClient);
	}

	@Override
	public List<client> findAll() {
		Query query = em.createNamedQuery("Client.findAll");
		List<client> clients = query.getResultList();
		return clients;
	}

}
