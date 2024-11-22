public class DestinationHashGenerator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java -jar <jar-file-name> <roll-number> <json-file-path>");
            System.exit(1);
        }

        String rollNumber = args[0].toLowerCase().replaceAll("\\s+", "");
        String jsonFilePath = args[1];

        try {
            String destinationValue = getFirstDestinationValue(jsonFilePath);
            String randomString = generateRandomString(8);
            String concatenatedString = rollNumber + destinationValue + randomString;

            String hashValue = generateMD5Hash(concatenatedString);
            System.out.println(hashValue + ";" + randomString);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
