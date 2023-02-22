package Facade;

import java.util.HashMap;

public class DBMS {
	private HashMap<String, Row> db = new HashMap<String, Row>();
	
	public DBMS() {
		db.put("jane", new Row("Jane", "1990-02-14", "jane09@geiss,co.kr"));
		db.put("robert", new Row("Robert", "1979-11-04", "rob@gxcvxcvs,co.kr"));
		db.put("dorosh", new Row("Dorosh", "1985-08-21", "dor9@qeweiss,co.kr"));
			
	}
	
	public Row query(String name) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return db.get(name.toLowerCase());
	}
	
}
