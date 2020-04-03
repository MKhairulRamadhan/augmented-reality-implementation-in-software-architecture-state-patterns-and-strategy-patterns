public class PopUpBig extends PopUp{

	public PopUpBig(){
		contentBehaviour = new VideoContent();
		super.width = 100;
		super.height = 200;
	}

	public void setWidth(int width){
		super.width = width;
	}

	public void setHeight(int height){
		super.height = height;
	}


	public void show(Entity object){
		System.out.println("[=]-----------------------------------------[=]");
		System.out.println("width : "+ super.getWidth());
		System.out.println("height : "+ super.getHeight());		
		System.out.println(super.getContent(object));
		System.out.println("[=]-----------------------------------------[=]");
	}

}