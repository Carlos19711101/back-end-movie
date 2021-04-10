package co.edu.iudigital.app.service.iface;

import co.edu.iudigital.app.model.entity.User;

public interface UserService {
	
	
	
	public void create(User user);
	
	public User login(User user) throws Exception;

}
