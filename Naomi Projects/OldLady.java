
/**
 * HW 9 1.3 This program generates the song "There Was an Old Lady Who Swallowed a Fly."
 * Naomi Yung 8/25. Revised 8/31/15.
 */
public class OldLady
{
   public static void main(String[] args) {
       oldLady();
       System.out.println("fly");
       refrain();
       oldLady();
       System.out.println("spider");
       spider();
       oldLady();
       System.out.println("bird,\nHow absurd to swallow a bird,");
       bird();
       oldLady();
       System.out.println("cat,\nImagine that to swallow a cat,\nShe swallowed the cat to catch the bird,");
       bird();
       oldLady();
       System.out.println("horse,\nShe's dead, of course.");
    }
    public static void oldLady() {
        System.out.print("There was an old lady who swallowed a ");
    }
    public static void refrain() {
        System.out.println("I don't know why she swallowed a fly,");
        System.out.println("Perhaps she'll die.");
        System.out.println("");
    }
    public static void spider(){
        System.out.println("That wriggled and jiggled and tickled inside her,");
        System.out.println("She swallowed the spider to catch the fly,");
        refrain();
    }
    public static void bird() {
        System.out.println("She swallowed the bird to catch the spider,");
        spider();
    }
}
