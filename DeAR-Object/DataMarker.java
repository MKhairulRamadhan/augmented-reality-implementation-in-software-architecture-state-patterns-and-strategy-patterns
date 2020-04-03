 import java.util.HashMap;

public class DataMarker{

	private String[][] maker = new String[10][4];

	public DataMarker(){
		String[][] data ={
					{"123", "Poster Harry Poter", "mengisahkan tentang petualangan seorang penyihir remaja bernama Harry Potter dan sahabatnya, Ronald Bilius Weasley dan Hermione Jane Granger, yang merupakan pelajar di Sekolah Sihir Hogwarts.", "poster"},
					{"321", "Susu", "Susu adalah sumber gizi utama bagi bayi sebelum mereka dapat mencerna makanan padat. Susu binatang (biasanya sapi) juga diolah menjadi berbagai produk seperti mentega, yogurt, es krim, keju, susu kental manis, susu bubuk dan lain-lainnya untuk konsumsi manusia. ", "produk"},
					{"111", "asus fx505dt", "ASUS TUF Gaming FX505 akan mengubah cara Anda melihat laptop gaming. Ini melebihi ekspektasi, perangkat keras yang mengesankan, dan chassis yang dirancang secara kompak dan agresif yang luar biasa tangguh.", "produk"},
					{"222", "poster bird box", "Film ini menceritakan perjalanan seorang wanita, diperankan oleh Sandra Bullock, yang bersama dua orang anak tak bernama, yang dipanggil Boy dan Girl, terpaksa harus melewati hutan dan mengarungi sungai dengan memakai penutup mata, agar terhindar dari bahaya yang ditimbulkan oleh mahluk supernatural untuk bertahan hidup dan terhindar dari ancaman bunuh diri.", "poster"},
					{"444", "KupuKupu", "bla bla bla", "3d"},
					{"555", "Ayam", "bla bla bla", "3d"}
				};
		maker = data;
	}
    
    public String[][] getDataMaker(){
    	return maker;
    }
   
}