package fr.htc.filedb.luncher;

import java.util.ArrayList;
import java.util.List;

import fr.htc.filedb.dao.ClientDao;
import fr.htc.filedb.data.Client;
import fr.htc.filedb.service.InputFileReader;

public class JobLuncher {
	
	private static ClientDao clientDao = new ClientDao();
	
	public static void main(String[] args) {
		
		if(args.length != 1 ) {
			System.out.println("Missing argument : file path");
			return;
		}
		
		String filePath = args[0];
				
		//Parse File 
		List<String> csvLines = InputFileReader.readFile("data/" +filePath);
		
		List<Client> clients = new ArrayList<Client>();
		
		for (String csvLine : csvLines) {
			clients.add(Client.parseLine(csvLine));
		}
		
		for (Client client : clients) {
			clientDao.save(client);
		}
	}
}
