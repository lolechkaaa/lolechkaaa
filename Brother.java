import java.util.Date;

public class Brother {
    String fullName;
    Date dateOfTheBirth;

    public Brother() {
    }

public Brother( String fullName, Date dateOfTheBirth) {
        this.fullName = fullName;
        this.dateOfTheBirth = dateOfTheBirth;

}

    public static void main(String[] args) {
        Brother Tom = new Brother("Tom Edison",  30/04/1989);
        System.out.println("Tom full name is "Tom.fullName"");
        System.out.println("Tom`s birthday is "Tom.dateOfTheBirth"");
    }
    }
    
    
