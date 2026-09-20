/*
Đây là bài toán xác suất kinh điển. Bạn dùng một mảng boolean kích thước $N$ (khởi tạo false).
Chạy vòng lặp while, sinh ngẫu nhiên số r từ $0$ đến $N-1$.
Nếu ô r chưa đánh dấu thì gán true và tăng biến đếm số lần bốc.
Ngay khi bốc trúng một ô đã là true (trùng lặp), vòng lặp dừng lại.
Kết quả trung bình của số lần bốc trước khi gặp trùng lặp sẽ tiệm cận với công thức xấp xỉ $\sim \sqrt{\pi N / 2}$.
(Ví dụ với $N = 365$ ngày trong năm, căn bậc hai của $\frac{365\pi}{2}$ xấp xỉ 24.
Nôm na là chỉ cần bốc ngẫu nhiên khoảng 24 người thì tỷ lệ có 2 người trùng sinh nhật đã lớn hơn 50%).
 */