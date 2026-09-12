/*
a, Cấu trúc dữ liệu thu được chứa tổng cộng 1 thành phần liên thông
b, giả sử cấu trúc dữ liệu được cập nhật theo quick-find, vì mỗi lần chạy tốn O(n) mà cần đến (n-1) lần thì cần n(n-1) ~ o(n^2)
c, giả sử cấu trúc dữ liệu được cập nhật theo quick-union thì tổng cộng cần 1 lần truy cập mảng
d, vì nút 0 có vai trò là gốc nên để find(0) chỉ cần o(1)
 */