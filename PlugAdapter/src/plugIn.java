
public class plugIn implements PlugedIn {
	//public String type;
	AdaptionOf adapter;

	@Override
	public void plugInOf(String type, String country) {
	
		if(type.equalsIgnoreCase("E")&&country.equalsIgnoreCase("USA")) {
				System.out.println("plug type of : "+ type+" : is fit into the plugsocket for "+country);
			}
		else if(type.equalsIgnoreCase("D")&&country.equalsIgnoreCase("india")) {
				System.out.println("plug type of : "+ type+" : is fit into the plugsocket for "+country);
			}
		else if(type.equalsIgnoreCase("E")&&country.equalsIgnoreCase("india")) {
				adapter = new AdaptionOf(country);
				adapter.plugInOf(type,country);
			}
		else if(type.equalsIgnoreCase("D")&&country.equalsIgnoreCase("usa")){
			adapter = new AdaptionOf(country);
			adapter.plugInOf(type,country);
		}
		
		
//	switch(type=="india") {
//	case "E" : System.out.println("plug type of : "+ type+" : is fit into the plugsocket");
//		break;
//	}

		
		// TODO Auto-generated method stub
		
	}

	
	

}
