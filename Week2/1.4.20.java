/*
Giai đoạn 1 ($\sim \lg N$): Tìm "đỉnh" (phần tử lớn nhất) của mảng bitonic bằng tìm kiếm nhị phân.
Đỉnh này chia mảng làm 2 nửa: nửa trái tăng dần, nửa phải giảm dần.Giai đoạn 2 ($\sim 2\lg N$):
Chạy tìm kiếm nhị phân thông thường trên nửa trái (tìm kiếm mảng tăng) và chạy tìm kiếm nhị phân ngược trên nửa phải (tìm kiếm mảng giảm).
Tổng số phép so sánh: $\lg N$ (tìm đỉnh) + $\lg N$ (tìm nửa trái) + $\lg N$ (tìm nửa phải) = $3\lg N$
 */