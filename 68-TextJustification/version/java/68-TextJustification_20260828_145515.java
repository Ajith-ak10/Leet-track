// Last updated: 8/28/2026, 2:55:15 PM
1class Solution {
2    public List<String> fullJustify(String[] words, int maxWidth) {
3        List<String> ans = new ArrayList<>();    
4        for (int i = 0, j; i < words.length; i = j) {
5            int len = 0;
6            for (j = i; j < words.length &&
7                 len + words[j].length() + j - i <= maxWidth; j++)
8                len += words[j].length();
9
10            int gaps = j - i - 1;
11            StringBuilder s = new StringBuilder();
12            for (int k = i; k < j; k++) {
13                s.append(words[k]);
14                if (k < j - 1) {
15                    int spaces = (j == words.length) ? 1 :
16                        (maxWidth - len) / gaps +
17                        (k - i < (maxWidth - len) % gaps ? 1 : 0);
18                         s.append(" ".repeat(spaces));
19                }
20            }
21
22            while (s.length() < maxWidth) s.append(" ");
23            ans.add(s.toString());
24        }
25        return ans;
26    }
27}