package kosa.oop2;

public class MyService {

	private Dao dao;
//	private MySQLDao dao;
//	private OracleDao dao;
	
	public MyService() {}

	public MyService(Dao dao) {
		super();
		this.dao = dao;
	}
	
	public void insertService() {
		dao.insert();
	}
	
}
