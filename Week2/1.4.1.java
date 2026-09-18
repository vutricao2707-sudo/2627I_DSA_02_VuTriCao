/*
Bước cơ sở: Với $N = 3$, số cách chọn 3 phần tử từ 3 phần tử là 1.Áp dụng công thức: $\frac{3(3-1)(3-2)}{6} = \frac{3 \times 2 \times 1}{6} = 1$. (Mệnh đề đúng với $N=3$).
Bước quy nạp: Giả sử công thức đúng với $N = k$ ($k \ge 3$), tức là:$$S(k) = \frac{k(k-1)(k-2)}{6}$$
Ta cần chứng minh công thức cũng đúng với $N = k + 1$.Số cách chọn 3 phần tử từ tập gồm $k + 1$ phần tử có thể chia làm 2 trường hợp:
Chọn 3 phần tử chỉ từ $k$ phần tử đầu tiên: Có $S(k)$ cách.Chọn phần tử thứ $k+1$ và chọn thêm 2 phần tử từ $k$ phần tử đầu tiên:
Số cách chọn 2 phần tử từ $k$ phần tử là $C(k, 2) = \frac{k(k-1)}{2}$.
Tổng số cách chọn cho $k+1$ phần tử là:$$S(k+1) = S(k) + \frac{k(k-1)}{2}$$$$S(k+1) = \frac{k(k-1)(k-2)}{6} + \frac{3k(k-1)}{6}$$$$S(k+1) = \frac{k(k-1)(k-2+3)}{6}$$$$S(k+1) = \frac{(k+1)k(k-1)}{6}$$
Biểu thức này chính là công thức ban đầu thay $N = k+1$.
Theo nguyên lý quy nạp, mệnh đề được chứng minh.
 */