package dao;

public class UserDaoImpl implements UserDao{

	@Override
	public boolean login(String name, String password) {
		// TODO Auto-generated method stub
		if(name.equals("����")&&password.equals("123")) {
			return true;
		}
		return false;
	}
	
}
