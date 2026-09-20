/*
Trong Java, int là kiểu dữ liệu nguyên thủy (nằm trên vùng nhớ stack, thao tác cực nhanh),
còn Integer là một đối tượng (nằm trên vùng nhớ heap).
Autoboxing là quá trình Java tự động chuyển đổi qua lại giữa int và Integer.
Khi bạn viết một vòng lặp cộng hàng triệu số bằng Integer,
Java phải liên tục tạo ra các object Integer mới trong bộ nhớ và dọn dẹp các object cũ (Garbage Collection).
Điều này tạo ra một "hình phạt hiệu năng" (penalty) rất lớn.
Thực nghiệm sẽ cho thấy mảng Integer[] chạy chậm hơn mảng int[] từ 3 đến 5 lần, đồng thời tiêu tốn bộ nhớ gấp 4-6 lần
 */