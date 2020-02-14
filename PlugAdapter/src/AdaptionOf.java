
public class AdaptionOf implements PlugedIn {
	Adapter adapter;
	
	public AdaptionOf(String country){
		   
	      if(country.equalsIgnoreCase("india") ){
	    	  adapter = new Indian();			
	         
	      }else if (country.equalsIgnoreCase("usa")){
	    	  adapter = new American();
	      }	
	}
	
	@Override
	public void plugInOf(String type, String country) {
		if(type.equalsIgnoreCase("E")) {
			adapter.eToD(type);
			
		}else {
			adapter.dtoE(type);
		}
		// TODO Auto-generated method stub
		
	}

}
