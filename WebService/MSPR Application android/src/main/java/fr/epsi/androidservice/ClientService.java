package fr.epsi.androidservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epsi.androiddao.ClientDao;
import fr.epsi.androidmodele.Client;

@Service
public class ClientService {
	
	@Autowired
	private ClientDao clientDao;
	
	public Client getClientByCode(int code) {
		return clientDao.getClientByCode(code);
	}

}
