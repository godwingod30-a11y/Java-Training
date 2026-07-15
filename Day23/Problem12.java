package Day23;

public class Problem12 {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);

            if (isVowel(first) && isVowel(last))
                prefix[i + 1] = prefix[i] + 1;
            else
                prefix[i + 1] = prefix[i];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            ans[i] = prefix[queries[i][1] + 1] - prefix[queries[i][0]];
        }

        return ans;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u';
    }
}
