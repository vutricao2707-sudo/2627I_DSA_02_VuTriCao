/*hàm op được gọi n^4log2(n) lần vì
for (int k = 1; k <= n*n; k = k*2) op(); số lần lặp của vòng này là 2log2(n)
for (int i = 0; i < n*n; i++) số lần lặp của vòng này là n^2
for (int j = i+1; j < n*n; j++) số lần lặp của vòng này là n^2/2
 */
