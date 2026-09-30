public class SixteenthVideo {

    public static void main(String[] args) {

        String sentence = "Java is Difficult to learn";

        String[] words = sentence.split(" ");

        System.out.println("Words:");

        for (String word : words) {
            System.out.println(word);
        }

        String data = "Afia Tasnim Esha  252-35-583";

        String[] parts = data.split("\\s+");

        System.out.println("\nSeparated information:");

        for (String part : parts) {
            System.out.println(part);
        }

    }
}  

