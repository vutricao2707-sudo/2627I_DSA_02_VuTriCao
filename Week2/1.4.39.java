/*
Khi chạy chương trình đo thời gian 1 lần (1 trial),
kết quả rất dễ bị nhiễu do hệ điều hành đang xử lý các tác vụ ngầm khác hoặc CPU bị giảm xung nhịp.
Bằng cách thêm tham số vòng lặp, bạn chạy hàm timeTrial(N) nhiều lần (10, 100, hoặc 1000 lần) rồi chia trung bình.
Kết quả thực nghiệm: với số lần thử càng cao,
tỷ lệ thời gian giữa $2N$ và $N$ sẽ càng nhanh chóng tiệm cận về một hằng số
toán học hoàn hảo (ví dụ: hội tụ khít về $8.0$ cho thuật toán $O(N^3)$, hoặc $4.0$ cho thuật toán $O(N^2)$) thay vì nhảy số ngẫu nhiên.
 */