class Tester {

    public static int findHighestOccurrence(String str) {
        int[] freq = new int[256]; // ASCII size

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Find maximum frequency
        int max = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }

        return max;
    }

    public static void main(String args[]) {
        String str = "success";
        System.out.println(findHighestOccurrence(str)); // Output: 3
    }
}
