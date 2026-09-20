/*
Xét hàng giữa (hàng $N/2$) và cột giữa (cột $N/2$) của ma trận.
Tìm phần tử nhỏ nhất trên hình chữ thập này (tốn $O(N)$).
Nếu phần tử nhỏ nhất đó bé hơn cả 4 ô xung quanh nó, nó là cực tiểu địa phương.
Nếu có một ô lân cận (nằm trong 1 trong 4 góc phần tư) nhỏ hơn nó, bạn tiếp tục đệ quy vào góc phần tư đó.
Góc phần tư mới có kích thước $N/2 \times N/2$.Bậc thời gian là $T(N) = O(N) + T(N/2)$, tính ra tổng chi phí là $O(N)$.
 */