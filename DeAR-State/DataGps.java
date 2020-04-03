public class DataGps {
    private String [][] map = new String[5][5];

    public DataGps(){
        String [][] lokasi ={
            {"111","timur","zakir","jalan","mesjid"},
            {"111","barat","mesjid","jalan","zakir"},
            {"111","selatan","jalan","mesjid","jalan"},
            {"111","utara","jalan","zakir","jalan"},
        };
        map=lokasi;
    }
    
    public String [][] getDataGps(){
        return map;
    }
}