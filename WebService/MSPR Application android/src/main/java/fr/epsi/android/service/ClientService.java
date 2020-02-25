package fr.epsi.android.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epsi.android.dao.ClientDao;

@Service
public class ClientService {
	
	@Autowired
	private ClientDao clientDao;
}
