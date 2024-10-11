public class CountWovels {
    public static void main(String[] args) {
        String str = "Programming is fun!";
        int vowelCount = 0;

        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}
