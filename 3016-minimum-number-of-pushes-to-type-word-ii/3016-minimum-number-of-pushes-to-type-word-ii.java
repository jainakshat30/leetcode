class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];

        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        List<Integer> list = new ArrayList<>();

        for(int f : freq){
            if(f > 0){
                list.add(f);
            }
        }

        list.sort((a, b) -> b - a);

        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            int level = i / 8 + 1;
            ans += list.get(i) * level;
        }
        return ans;
    }
}