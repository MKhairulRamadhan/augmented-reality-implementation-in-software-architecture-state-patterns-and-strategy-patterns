public class PopUpTransparent extends PopUp{

	public PopUpTransparent(){
		contentBehaviour = new Content3D();
		super.width = 100;
		super.height = 100;
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