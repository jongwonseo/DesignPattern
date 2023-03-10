package Builder2.Builder;

import Builder2.Data.Data;

public class JSONBuilder extends Builder{

	public JSONBuilder(Data data) {
		super(data);
	}

	@Override
	public String head() {
		return "{";
	}

	@Override
	public String body() {
		StringBuilder sb = new StringBuilder();
		sb.append("\"Name\": ");
		sb.append("\""+data.getName()+"\"");
		sb.append(", \"Age\": ");
		sb.append(data.getAge());
		
		return sb.toString();
	}

	@Override
	public String foot() {
		// TODO Auto-generated method stub
		return "}";
	}
	
}
