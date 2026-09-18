/*
Trong mỗi lần lặp, câu lệnh if (a[i] + a[j] + a[k] == 0) thực hiện:
Số lần truy cập mảng: 3 lần truy cập (a[i], a[j], a[k]).
Tổng chi phí $\sim 3 \times \frac{N^3}{6} = \frac{N^3}{2}$.Phép toán số học: 2 phép cộng.
Tổng chi phí $\sim 2 \times \frac{N^3}{6} = \frac{N^3}{3}$.
So sánh: 1 phép so sánh (== 0). Tổng chi phí $\sim \frac{N^3}{6}$.
Kết luận: Thuật toán duyệt toàn bộ ThreeSum có độ phức tạp thời gian tỷ lệ thuận với $N^3$, bậc tăng là $O(N^3)$.
Dù tính theo thao tác nào thì chi phí cũng bị chi phối bởi bậc 3.
 */