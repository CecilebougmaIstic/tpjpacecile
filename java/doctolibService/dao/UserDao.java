package doctolibService.dao;


import doctolibService.model.User;

public class UserDao extends AbstractJpaDao <Long,User> {

	public UserDao() {
		super(User.class);
		// TODO Auto-generated constructor stub
	}

}
