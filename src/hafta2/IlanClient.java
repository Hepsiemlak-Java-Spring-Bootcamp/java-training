package hafta2;

import java.util.List;

import hafta1.model.Ilan;

public class IlanClient {
	
	private Server server;
	
	public IlanClient(Server server) {
		super();
		this.server = server;
	}

	public void findIlanByUserEmail(String email) {
		
		List<Ilan> fecthAllIlan = server.fecthAllIlan();		
		
	}
	
	// Low coupling, high cohesion!
	public void getAllUser() {
		
	}

	public void setServer(Server server) {
		this.server = server;
	}	

}
