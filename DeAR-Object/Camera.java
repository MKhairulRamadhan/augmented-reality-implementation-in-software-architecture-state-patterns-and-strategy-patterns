public class Camera{

	Entity objectTarget;
	PopUp popUpBig = new PopUpBig();
	PopUp popUpSmall = new PopUpSmall();
	PopUp popUpTransparent = new PopUpTransparent();

	private DataMarker dataMarker = new DataMarker();
	private String[][] data = dataMarker.getDataMaker();

	private boolean active = false;

	public void openCamera(){
		System.out.println("Camera Open...!");
		active = true;
	}

	public void closeCamera(){

		System.out.println("Camera Close...!");
		active = false;
	}

	public void changeSizePopUp(int width,int height, String type){
		if (type.equalsIgnoreCase("popUpBig")) {
			popUpBig.setWidth(width);
			popUpBig.setHeight(height);
		}else if (type.equalsIgnoreCase("popUpSmall")) {
			popUpSmall.setWidth(width);
			popUpSmall.setHeight(height);
		}else if (type.equalsIgnoreCase("popUpTransparent")) {
			popUpTransparent.setWidth(width);
			popUpTransparent.setHeight(height);
		}else{
			System.out.println("Nothing Changed..!");
		}
	}

	public void scanObjectTarget(Entity object){
		if (active) {	
			this.objectTarget = object;
		}else{
			System.out.println("Camera belum aktif...!");
		}
	}


	public boolean checkTarget(){

		for (int i=0;i<data.length ;i++ ) {
			if (data[i][0].equals(objectTarget.getMarkerId())) {
				objectTarget.setName(data[i][1]);
				objectTarget.setDescription(data[i][2]);		
				objectTarget.setType(data[i][3]);	

				return true;
			}
		}

		return false;
	}


	public void setBehaviour(ContentBehaviour desc){
		checkTarget();
		if (objectTarget.getType().equals("poster")) {
			popUpBig.setDescriptionBehaviour(desc);
		}else if(objectTarget.getType().equals("3d")){
			popUpTransparent.setDescriptionBehaviour(desc);
		}else{
			System.out.println("\nCan't Change Behaviour");
		}
	}

	public void showAR(){
		if (active) {
			Boolean cek = checkTarget();
			if (cek) {
				if (objectTarget.getType().equals("poster")) {
					popUpBig.show(objectTarget);

				}else if (objectTarget.getType().equals("produk")) {
					popUpSmall.show(objectTarget);
				}else if (objectTarget.getType().equals("3d")){
					popUpTransparent.show(objectTarget);
				}
			}else{

			}
		}else{
			System.out.println("Camera belum aktif...!");
		}
	}

	public void showHeader(){
		System.out.println(">>>>> DeAR (Augmented Reality Scanning Object RealTIme) <<<<<<");
		System.out.println("              Look at the objects around you                  ");
		System.out.println("                         Have fun                             ");

	}

	

}

