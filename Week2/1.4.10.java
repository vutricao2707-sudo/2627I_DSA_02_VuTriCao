/*
Cách sửa: Khi thấy a[mid] == key, đừng vội dừng. Hãy lưu mid vào một biến
ket_qua, sau đó tiếp tục ép khoảng tìm kiếm về nửa bên trái bằng lệnh
high = mid - 1. Quá trình này sẽ đi tìm xem còn số nào bằng key mà nằm ở đằng
trước nữa không. Khi vòng lặp kết thúc, ket_qua sẽ giữ vị trí nhỏ nhất.
 */