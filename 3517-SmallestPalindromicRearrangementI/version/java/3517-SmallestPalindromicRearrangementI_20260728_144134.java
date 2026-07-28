// Last updated: 7/28/2026, 2:41:34 PM
1class Solution {
2    public String shortestPalindrome(String s) {
3        String rev = new StringBuilder(s).reverse().toString();
4
5        String str = s + "#" + rev;
6
7        int[] l= new int[str.length()];
8
9        for (int i = 1; i < str.length(); i++) {
10            int j = l[i - 1];
11
12            while (j > 0 && str.charAt(i) != str.charAt(j)) {
13                j = l[j - 1];
14            }
15
16            if (str.charAt(i) == str.charAt(j)) {
17                j++;
18            }
19
20            l[i] = j;
21        }
22
23        int len = l[str.length() - 1];
24
25        String add = rev.substring(0, s.length() - len);
26
27        return add + s;
28    }
29}