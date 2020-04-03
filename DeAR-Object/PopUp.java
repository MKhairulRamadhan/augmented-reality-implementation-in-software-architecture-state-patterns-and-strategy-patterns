public abstract class PopUp{

	protected int width;
	protected int height;
	protected ContentBehaviour contentBehaviour;

	public PopUp(){

	}

	public void setDescriptionBehaviour(ContentBehaviour db){
		this.contentBehaviour = db;
	}

	public String getContent(Entity object){
		return contentBehaviour.getContent(object);
	}

	public abstract void show(Entity object);

	public abstract void setWidth(int width);

	public abstract void setHeight(int height);

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}



}