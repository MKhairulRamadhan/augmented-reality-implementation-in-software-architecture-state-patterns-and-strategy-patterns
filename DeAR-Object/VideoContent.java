public class VideoContent implements ContentBehaviour {
    
    public String getContent(Entity benda) {
        String a = "";
		a+= "Name : "+ benda.getName()+"\n\n";
        a+= "[=]------------------------------------[=]\n";
		a+= "|                                       |\n";
		a+= "|                |\\                     |\n";
		a+= "|                | \\                    |\n";
		a+= "|                |  \\                   |\n";
		a+= "|                |   \\                  |\n";
		a+= "|                |    \\                 |\n";
		a+= "|                |     \\                |\n";
		a+= "|                |     /                |\n";
		a+= "|                |    /                 |\n";
		a+= "|                |   /                  |\n";
		a+= "|                |  /                   |\n";
		a+= "|                | /                    |\n";
		a+= "|                |/                     |\n";
		a+= "|                                       |\n";
		a+= "[=]-------------------------------------[=]\n";

		return(a);
    }

}