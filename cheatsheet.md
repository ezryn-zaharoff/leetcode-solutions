# Cheatsheet

This is a cheatsheet comparing the different languages.


| No. |   Type   | Python3 | Java | JavaS | C++ | Scala | Go | C# | Swift |
|:---:|----------|:-------:|:----:|:-----:|:---:|:-----:|:--:|:--:|:-----:|
|  1. | Set integers | - | int | let | int | var | := | int | var |
|  2. | List length | len() | .length | same as Java | .size() | same as Java | same as Py3 | .Count or .Length | .count | .length | len() | .Length | .count |
|  3. | String length | len() | .length() | .length | .length() or .size() | .length | len() | .Length | .count |
|  4. | Count | += | += or ++ | same as Java | same as Java | same as Py3 | same as Java | same as Java | same as Py3 |
|  5. | For loop (i) | for i in range(n) | for (int i = 0; i < n; i++) | for (let i = 0; i < n; i++) | same as Java | for (i <- 0 until n) or for (i <- 0 to n) | for i, _ := range nums or for (int i := 0; i < n; i++) | same as Java | for i in 0...n or for i in 0..<n |
|  6. | For loop (list) | for num in nums | for (int num : nums) | for (let num of nums) | same as Java | for (num <- nums) | for _, num := range nums | same as Java | same as Py3 |
|  7. | For loop (string) | for ch in s | for (char ch : s.toCharArray()) | for (const ch of s) | for (char& ch : s) | for (ch <- s) | for _, ch := range s | foreach (char ch in s) | same as Py3 |
|  8. | Maximum | max() | Math.max() | Math.max() | max() | Math.max() | max() | Math.Max() | max() |
|  9. | Sort | .sort() | Arrays.sort() | .sort(function(a, b){return a-b}) | sort(nums.begin(), nums.end()) | .sorted | sort.Ints() or sort.Strings() | Array.Sort() | .sort() or .sorted() |
|  10. | New array | ans = [] | int[] ans = new int[2] | let ans = [] | `vector<int> ans` | `var ans = new Array[Int](2) or var ans = Array.fill(n)(0L)` | ans := []int{} or make([]int, 2) | int[] ans = new int[n] | var ans = [Int]() or var ans = Array(repeating: 0, count: n) |
|  11. | Starts with (string) | .startswith(sub) | .startsWith(sub) | same as Java | .starts_with(sub) | same as Java | strings.HasPrefix(words[i], sub) | .StartsWith(sub) | .hasPrefix(sub) |
|  12. | Substring | s[i:i+k] | s.substring(i,i+k) | same as Java | s.substr(i,k) | same as Java | same as Py3 | .Substring(i,k) |  |
|  13. | Contains (substring) | sub in s | s.contains(sub) | s.includes(sub) | same as Java | same as Java | strings.Contains(s,sub) | s.Contains(sub) | same as Java |
|  14. | Split (string) | s.split(":") | s.split(":") | same as Java | - | same as Java | strings.Split(s, ":") | s.Split(':') | s.split(separator: ":") |