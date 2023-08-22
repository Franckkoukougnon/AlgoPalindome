public class Main {
    public static void main(String[] args) {
      EstPalindrome estPalindromeInstance = new EstPalindrome();
        String mot = estPalindromeInstance.mot.toLowerCase();

        // Liste des caratceres speciaux
        String re = "[^A-Za-z0-9]";

        // Je retire les caratactere specieux et je les remplace par un chaine vide
        String motSansCaractereSpecial = mot.replaceAll(re,"");


        char[] motCharArray = motSansCaractereSpecial.toCharArray();

        StringBuilder motReverseBuilder = new StringBuilder();

        for(int i = motCharArray.length - 1; i >= 0; i--){
            motReverseBuilder.append(motCharArray[i]);
        }

        String motReverse = motReverseBuilder.toString();

        System.out.println("Le mot saisi est : " + mot);
        System.out.println("Mot sans caractère spécial : " + motSansCaractereSpecial);
        System.out.println("Mot inversé : " + motReverse);

        if(motSansCaractereSpecial.equals(motReverse)){
            System.out.println("le mot est un Palindrome");
        } else{
            System.out.println("Le mot n'est pas un Palindrome");
        }











    }
}