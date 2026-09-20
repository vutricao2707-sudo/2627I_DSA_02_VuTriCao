/*
Hai bài này yêu cầu bạn ngoại suy dựa trên tốc độ máy tính cá nhân.
Hướng giải quyết như sau:Mô hình toán học của thời gian chạy là $T(N) = c \times N^b$.TwoSumFast ($O(N \log N)$): Rất nhanh.
Có thể xử lý 1 triệu số chỉ trong vài giây.TwoSum ($O(N^2)$):
Nếu 1000 số mất $0.1s$, thì 1 triệu số (gấp 1000 lần) sẽ mất $1000^2 \times 0.1s \approx 100,000s$ (hơn 1 ngày).
Giới hạn $P$ thực tế rơi vào khoảng $2^{16}$ đến $2^{18}$ nghìn số.ThreeSum ($O(N^3)$):
Rất chậm. Nếu 1000 số mất $0.1s$, thì 1 triệu số sẽ mất $1000^3 \times 0.1s \approx 3.17$ năm.
Giới hạn $P$ thực tế cho máy tính thường chỉ chịu được khoảng $2^{10}$ đến $2^{12}$ nghìn số (vài nghìn phần tử).
 */