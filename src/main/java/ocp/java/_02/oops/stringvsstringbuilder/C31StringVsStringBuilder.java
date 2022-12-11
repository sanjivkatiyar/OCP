package ocp.java._02.oops.stringvsstringbuilder;

public class C31StringVsStringBuilder {
    public static void main(String[] args) {
        String vowelsS = "aei";
        // StringBuilder vowelsSB = "aei"; // compilation error
        StringBuilder vowelsSB = new StringBuilder("aei");
        addRemainingVowels(vowelsS);
        addRemainingVowels(vowelsSB);

        System.out.println(vowelsS);
        System.out.println(vowelsSB);
    }

    public static void addRemainingVowels(String vowels){
        vowels +="ou";         // no change in vowelsS in main
        vowels.concat("ou");   // no change in vowelsS in main
    }

    public static void addRemainingVowels(StringBuilder vowels) {
        vowels.append("ou"); // change vowelsSB in main()
    }
}
