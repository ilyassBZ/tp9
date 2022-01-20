package ma.cigma.pfe.presentation;

import java.util.List;


import ma.cigma.pfe.models.client;
import ma.cigma.pfe.service.iclientservice;
public class clientcontroller {
private iclientservice service;


public void setService(iclientservice service) {
    this.service = service;
}

public clientcontroller() {
    System.out.println("Creation d'un objet Client controler");
}

public iclientservice getService() {
    return service;
}

public void save(client c){
    System.out.println("Presentation Layer Level...");
    service.save(c);
}

public void modify(client c){
	service.modify(c);
}

public boolean deleteById(long id){
	return service.deleteById(id);
}

public client getById(long id){
	return service.getById(id);
}

public List<Client> finAll(){
	return service.findAll();
}
}
