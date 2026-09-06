public class q5 {
    public static String q5(String customerName) {
        char[] characters = customerName.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = characters.length - 1; i >= 0; i--) {
            reversed.append(characters[i]);
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String customerName = "Sunil";

        String reversedName = q5(customerName);

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reversedName);
    }
}