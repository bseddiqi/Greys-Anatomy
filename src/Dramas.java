import jdk.nashorn.internal.codegen.CompilerConstants.Call;

public class Dramas {
    public static void main(String[] args) throws Exception {
        greysAnatomy MeredithGrey = new greysAnatomy("Meredith Grey","Ellen", "Protagonist", 37, "Derek");
        greysAnatomy CristinaYang = new greysAnatomy("Cristina Yang", "Sandra", "BestFriend", 38, "Owen");
        greysAnatomy DerekShepard = new greysAnatomy("Derek Shephard", "Patrick", "Husband", 43, "Meredith");
        greysAnatomy CallieTorres = new greysAnatomy("Callie Torres", "Sara", "SideCharacter", 35, null);
        greysAnatomy LexiGrey = new greysAnatomy("Lexi Grey", "Melissa", "Half Sister", 30 , null);

        MeredithGrey.Specialty();
        CristinaYang.Specialty();
        DerekShepard.Specialty();
        CallieTorres.Specialty();

        MeredithGrey.lifeAction();
        CristinaYang.lifeAction();
        DerekShepard.lifeAction();
        CallieTorres.lifeAction();
        LexiGrey.lifeAction();

        System.out.println(MeredithGrey);
  
    }
   
}
