import java.security.SecureRandom;

public static String generateRandomString(int length) {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    SecureRandom random = new SecureRandom();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < length; i++) {
        sb.append(characters.charAt(random.nextInt(characters.length())));
    }

    return sb.toString();
}
