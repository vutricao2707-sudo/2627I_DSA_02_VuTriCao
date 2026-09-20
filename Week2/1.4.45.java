/*
Tương tự bài trên, nhưng mục tiêu là bốc ngẫu nhiên cho đến khi tất cả $N$ giá trị đều đã xuất hiện ít nhất 1 lần.
Càng về cuối, xác suất bốc được giá trị mới càng thấp.Chi phí số lần bốc được tính bằng:
$$N \times (1 + \frac{1}{2} + \frac{1}{3} + \dots + \frac{1}{N}) = N \times H_N$$
Vì số điều hòa $H_N \approx \ln(N)$, nên số bước cần thiết để hoàn thành bộ sưu tập sẽ tỷ lệ với $N \ln N$.
Bạn có thể viết vòng lặp tương tự bài 1.4.44, đếm số lượng các ô khác nhau đã đánh dấu,
dừng lại khi bộ đếm chạm mốc $N$, và theo dõi tổng số lần tung xúc xắc.
Thời gian chạy sẽ khớp hoàn hảo với đồ thị $N \ln N$.
 */