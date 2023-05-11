public class Main {
    public static void main(String[] args) {
        String s = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";

        System.out.println(removeDuplicates(s));

    }

    private static String removeDuplicates(String s) {
        String[] stringArray = s.split(" ");
        StringBuilder result = new StringBuilder().append(stringArray[0]).append(" ");

        for (int i = 1; i < stringArray.length; i++) {
            String element = stringArray[i];
            boolean duplicateExists = false;
            for (int j = 0; j < i; j++) {
                if(element.equals(stringArray[j])){
                    duplicateExists = true;
                    break;
                }
            }
            if (!duplicateExists){
                result.append(element).append(" ");
            }
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }
}