# Cheatsheet

This is a cheatsheet comparing the different languages.


| No. |   Type   | Python3 | Java | JavaS | C++ | Scala | Go |
|:---:|----------|:-------:|:----:|:-----:|:---:|:-----:|:--:|
|  1. | Set integers | - | int | let | int |
|  2. | List length | len() | .length | .length | .size() |
|  3. | String length | len() | .length() | .length | .length() or .size() |
|  4. | Count | += | += or ++ | same as Java | same as Java |
|  5. | For loop (i) | for i in range(n) | for (int i = 0; i < n; i++) | for (let i = 0; i < n; i++) | same as Java |
|  6. | For loop (list) | for num in nums | for (int num : nums) | for (let num of nums) | same as Java |
|  7. | For loop (string) | for ch in s | for (char ch : s.toCharArray()) | for (const ch of s) | for (char & ch : s) | for (ch <- s) | for _, ch := range s |
|  8. | Maximum | max() | Math.max() | Math.max() | max() |
|  9. | Sort | .sort() | Arrays.sort() | .sort(function(a, b){return a-b}) | sort(nums.begin(), nums.end()) | .sorted | sort.Ints() or sort.Strings() |
|  10. | New array | ans = [] | int[] ans = new int[2] | let ans = [] | vector<int> ans | var ans = new Array[Int](2) | ans := []int{} or make([]int, 2) |
|  11. | Starts with (string) | .startswith(sub) | .startsWith(sub) | same as Java | .starts_with(sub) | same as Java | strings.HasPrefix(words[i], sub) |
