import java.util.Scanner;

public class test {

    public static void main(String arg[]) {

        vigenereCipher();
    }

    public static void vigenereCipher() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("please enter a message");
            System.out.println("note: dont leave space in your message!!");
            String usermsg = input.nextLine().toUpperCase();
            String key = "CODE";
            char message[] = usermsg.toCharArray();
            char keys[] = new char[message.length];

            for (int i = 0, j = 0; i < message.length; ++i, ++j) {
                if (j == key.length()) {
                    j = 0;
                }
                keys[i] = key.charAt(j);
            }

            char encryption[] = new char[message.length];
            for (int i = 0; i < message.length; ++i)
                encryption[i] = (char) (((message[i] + keys[i]) % 26) + 'A');

            char decryption[] = new char[message.length];
            for (int i = 0; i < message.length; ++i)
                decryption[i] = (char) ((((encryption[i] - keys[i]) + 26) % 26) + 'A');

            System.out.println();
            System.out.println("Encrypted Message: " + String.valueOf(encryption));
            System.out.println();
            System.out.println("Decrypted Message: " + String.valueOf(decryption));
        }
    }
}