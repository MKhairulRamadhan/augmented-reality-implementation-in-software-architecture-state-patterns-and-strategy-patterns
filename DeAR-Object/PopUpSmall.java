public class PopUpSmall extends PopUp{

	public PopUpSmall(){
		contentBehaviour = new TextContent();
		super.width = 100;
		super.height = 50;
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