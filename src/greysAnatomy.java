public class greysAnatomy{

    //member variables
    //private --> encapsulation
    private String realName;
    private String characterRole;
    private int age;
    private String partner;
    private String characterName;


    //use constructor to create an object
    
    public greysAnatomy(String characterName, String realName, String characterRole, int age, String partner ){
        super();
        this.realName = realName;
        this.characterRole = characterRole;
        this.age = age;
        this.partner = partner;
        this.characterName = characterName;
    }
    void Specialty(){
        if (characterName == "Meredith Grey"){
            String str1 = String.format("%s specializes in Neuro.", characterName );
            System.out.println(str1);
        }
        if (characterName == "Cristina Yang"){
            String str2 = String.format("%s specializes in cardio.", characterName );
            System.out.println(str2);
        }
        if (characterName == "Derek Shephard"){
            String str3 = String.format("%s specializes in Neuro.", characterName );
            System.out.println(str3);
        }
        if (characterName == "Callie Torres"){
            String str4 = String.format("%s specializes in Ortho.", characterName );
            System.out.println(str4);
        }
        //System.out.println("Cardio");
        //System.out.println("Ortho");
        //System.out.println("Peds");
        //System.out.println("OB");
        
        //System.out.println("General");
        //System.out.println("Trauma");

    }
    void lifeAction(){
        if(age>37){
            String str5 = String.format("%s is an attending.", characterName );
            System.out.println(str5);
        }
        if (partner!=null){
            String str6 = String.format("%s is married.", characterName );
            System.out.println(str6);
        }
        if (age<35){
            System.out.println(this.characterName + " is a resident.");
        }
        if(characterRole == "Protagonist"){
            System.out.println(this.characterName + " is the protagonist.");
        }
        if(realName == characterName){
            System.out.print("My name is the same in the drama and real life.");
        }
        //System.out.println("I am pregnant.");
        //System.out.println("I am married.");
        //System.out.println("I am divorced.");
        //System.out.println("I am a resident.");
        //
    }
    @Override
    public String toString() {
        return "My character name is " + characterName + " and I am " + age + '.' + " My real name is " + realName + " and I play as the " + characterRole + " on Grey's Anatomy." ;
        }

    
}

