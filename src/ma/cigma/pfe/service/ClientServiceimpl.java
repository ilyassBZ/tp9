package ma.cigma.pfe.service;
import ma.cigma.pfe.dao.iclientdao;
import ma.cigma.pfe.models.client;

public class clientserviceimpl  implements iclientservice{
	private iclientdao dao;
	public void setDao(iclientdao dao) {
        this.dao = dao;
    }

    public iclientdao getDao() {
        return dao;
    }

    @Override
    public boolean save(client c) {
        System.out.println("Service Layer Level ...");
        return dao.save(c);
    }

    public clientserviceimpl() {
        System.out.println("Creation d'un objet ClientServiceImpl");
    }

	@Override
	public client modify(client c) {
		return dao.update(c);
	}

	@Override
	public boolean deleteById(long id) {
		boolean check = dao.deleteById(id);
		return check;
	}

	@Override
	public client getById(long id) {
		return dao.findById(id);
	}

	@Override
	public List<client> findAll() {
		return dao.findAll();
	}

}
