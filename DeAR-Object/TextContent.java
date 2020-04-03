public class TextContent implements ContentBehaviour {
    
    public String getContent(Entity benda) {
        return ("Nama : " + benda.getName()+"\nDescription : " + benda.getDescription());
    }
}