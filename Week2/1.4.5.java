/*
Khi $N$ tiến tới vô cùng, ta chỉ giữ lại thành phần có tốc độ tăng trưởng lớn nhất (dùng ký hiệu $\sim$):
a. $N + 1 \sim N$
b. $1 + \frac{1}{N} \sim 1$ (vì $\frac{1}{N}$ tiến tới 0)
c. $(1 + \frac{1}{N})(1 + \frac{2}{N}) = 1 + \frac{3}{N} + \frac{2}{N^2} \sim 1$
d. $2N^3 - 15N^2 + N \sim 2N^3$ (số hạng bậc cao nhất chi phối)
e. $\frac{\lg(2N)}{\lg N} = \frac{\lg 2 + \lg N}{\lg N} = \frac{\lg 2}{\lg N} + 1 \sim 1$
f. $\frac{\lg(N^2 + 1)}{\lg N} \sim \frac{\lg(N^2)}{\lg N} = \frac{2 \lg N}{\lg N} = 2$
g. $\frac{N^{100}}{2^N} \sim 0$ (hàm mũ $2^N$ tăng trưởng nhanh hơn bất kỳ hàm đa thức nào, mẫu số sẽ lấn át tử số)
 */