public class Entity{

	private String markerId;
	private String name;
	private String description;
	private String type;

	// public Entity(){

	// }

	public Entity(String markerId){
		this.markerId = markerId;
	}

	public void setMarkerId(String markerId){
		this.markerId = markerId;
	} 

	public String getMarkerId(){
		return markerId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String desc){
		this.description = desc;
	}

	public String getDescription(){
		return description;
	}

	public String getType(){
		return type;
	}

	public void setType(String type){
		this.type = type;
	}

}