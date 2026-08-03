// Last updated: 8/3/2026, 3:08:59 PM
1class Solution {
2    public String removeDuplicateLetters(String s) {
3
4        int[] freq = new int[26];
5        boolean[] visited = new boolean[26];
6
7        for (int i = 0; i < s.length(); i++) {
8            freq[s.charAt(i) - 'a']++;
9        }
10
11        Stack<Character> st = new Stack<>();
12
13        for (int i = 0; i < s.length(); i++) {
14
15            char ch = s.charAt(i);
16            freq[ch - 'a']--;
17
18            if (visited[ch - 'a'])
19                continue;
20
21            while (!st.isEmpty()
22                    && st.peek() > ch
23                    && freq[st.peek() - 'a'] > 0) {
24
25                visited[st.pop() - 'a'] = false;
26            }
27
28            st.push(ch);
29            visited[ch - 'a'] = true;
30        }
31
32        StringBuilder ans = new StringBuilder();
33
34        for (char c : st) {
35            ans.append(c);
36        }
37
38        return ans.toString();
39    }
40}