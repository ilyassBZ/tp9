package ma.cigma.pfe.service;

import java.util.List;

import ma.cigma.pfe.models.client;
public class iclientservice {
	boolean save(client c) ;
	client modify(client c);
	boolean deleteById(long id);
	client getById(long id);
	List<client> findAll();
}
