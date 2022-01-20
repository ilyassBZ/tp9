package ma.cigma.pfe.dao;
import ma.cigma.pfe.models.client;

public class iclientdao {

	boolean save(client c) ;
    client update(client c);
    boolean deleteById(long idClient);
    client findById(long idClient);
    List<client> findAll();
}
 