/*
Đặt con trỏ i ở đầu mảng A, j ở đầu mảng B.
Lần lượt so sánh a[i] và b[j]:
Nếu a[i] < b[j]: Cho i++ (vì mảng đã sắp xếp, A đang nhỏ hơn nên phải tiến lên để đuổi kịp B).
Nếu a[i] > b[j]: Cho j++.
Nếu a[i] == b[j]: Đó là phần tử chung, in nó ra. Sau đó cho cả i++ và j++.
*/