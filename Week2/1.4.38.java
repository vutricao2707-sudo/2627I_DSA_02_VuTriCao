/*
Cài đặt ThreeSum chuẩn trong bài giảng tối ưu các vòng lặp: i chạy từ $0$, j chạy từ $i+1$, và k chạy từ $j+1$.
Số vòng lặp bên trong cùng là tổ hợp chập 3 của $N$, tương đương $\sim \frac{N^3}{6}$.
Cài đặt "ngây thơ" (naive) trong đề bài cho cả i, j, k chạy từ $0$ đến $N-1$, sinh ra tổng cộng $N^3$ vòng lặp.
Lệnh if (i < j && j < k) nằm ở bên trong, nghĩa là nó vẫn phải duyệt qua tất cả các hoán vị (ví dụ 1, 2, 3 và 3, 2, 1) rồi mới loại bỏ chúng.
Khi đo bằng DoublingTest, thuật toán naive này sẽ luôn chạy chậm hơn bản chuẩn chính xác khoảng 6 lần ở mọi giá trị $N$.
 */