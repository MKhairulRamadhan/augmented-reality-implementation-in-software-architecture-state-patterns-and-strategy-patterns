public class Demo{

	public static void main(String[] args){

		Entity object = new Entity("444");
		Entity object2 = new Entity("123");
		Entity object3 = new Entity("111");

		Camera camera = new Camera();
		camera.showHeader();

		System.out.println("\n");
		System.out.println("\n");
		
		// popUp untuk type 3d
		camera.openCamera();
		camera.scanObjectTarget(object);
		camera.showAR();

		System.out.println("\n");
		System.out.println("\n");

		// popUp untuk type poster dan akan menampilkan video
		camera.scanObjectTarget(object2);
		camera.showAR();
		

		System.out.println("\n");
		System.out.println("\n");

		// popUp untuk menampilkan detail produk
		camera.scanObjectTarget(object3);
		camera.showAR();

		// // popUp untuk type poster dan akan menampilkan video
		// camera.scanObjectTarget(object2);
		// camera.changeSizePopUp(10,10,"popUpBig");
		// camera.setBehaviour(new TextContent());
		// camera.showAR();

	}

}