/*
Khởi tạo khoảng giới hạn phân số là $L = 0/1$ và $R = 1/1$.
Sinh ra phân số ở giữa (mediant) bằng công thức $M = (tử_L + tử_R) / (mẫu_L + mẫu_R)$.
Hỏi xem phân số cần tìm có nhỏ hơn $M$ không.
Nếu có, gán $R = M$. Nếu không, gán $L = M$.Lặp lại cho đến khi mẫu số của $M$ vượt quá $N$.
Quá trình này hội tụ rất nhanh, đạt $\log N$ câu hỏi.
 */