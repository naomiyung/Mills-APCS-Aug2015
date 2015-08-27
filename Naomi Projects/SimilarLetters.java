
/**
 * Letters to three different people. Homework P 1.2
 * 
 * Naomi Yung and Isaac Kim 
 * 8/27/15
 */
public class SimilarLetters
{
    public static void main(String[] args) {
        dearGrandma();
        System.out.println("");
        dearUncle();
        System.out.println("");
        dearKelly();
    }
    public static void greetings() {
        System.out.println("Hello. How are you? I hope you're doing well.");
        System.out.println("It was great seeing you last week.");
    }
    public static void ending() {
        System.out.println("I hope to see you soon!\nPlease tell everyone that I say \"hi\".");
        System.out.println("");
        System.out.println("Love,\nBobbie");
    }
    public static void dearGrandma() {
        System.out.println("Dear Grandma,");
        System.out.println("");
        greetings();
        System.out.println("");
        money();
        System.out.println("");
        school();
        System.out.println("");
        ending();
    }
    public static void dearUncle() {
        System.out.println("Dear Uncle,");
        System.out.println("");
        greetings();
        System.out.println("");
        money();
        System.out.println("");
        sports();
        System.out.println("");
        ending();
    }
    public static void dearKelly(){
        System.out.println("Dear Kelly,");
        System.out.println("");
        greetings();
        System.out.println("");
        school();
        System.out.println("");
        sports();
        System.out.println("");
        ending();
    }
    public static void money() {
        System.out.println("I was wondering if you could help me out.");
        System.out.println("I need a loan for some money.");
        System.out.println("I only need a hundred dollars.");
    }
    public static void school() {
        System.out.println("I'm not doing too well in school right now.");
        System.out.println("I need to hire a tutor for math and science.");
        System.out.println("My dad is making me pay for both.");
    }
    public static void sports() {
        System.out.println("I'm pretty busy right now.");
        System.out.println("I play basketball and I run track.");
        System.out.println("You should come watch me one day.");
    }
        
}
