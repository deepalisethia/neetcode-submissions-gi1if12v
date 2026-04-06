class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for (String strng : strs) {
            int[] count = new int[26];

            // Step 1: build frequency count
            for (char indChar : strng.toCharArray()) {
                count[indChar - 'a']++;
            }

            // Step 2: convert to string key
            StringBuilder keyBuilder = new StringBuilder();
            for (int num : count) {
                keyBuilder.append(num).append("#");
            }
            String key = keyBuilder.toString();

            // Step 3: add to map
            if (!anagramMap.containsKey(key)) {
                anagramMap.put(key, new ArrayList<>());
            }

            anagramMap.get(key).add(strng);
        }

        return new ArrayList<>(anagramMap.values());

    }
}
