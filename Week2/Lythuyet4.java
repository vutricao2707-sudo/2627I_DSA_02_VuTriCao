/*
Ta có kích thước của một đối tượng trong node là:
Object overhead: 16 bytes
tham chiếu key: 8 bytes
tham chiếu value: 8 bytes
tham chiếu parent: 8 bytes
tham chiếu left: 8 bytes
tham chiếu right: 8 bytes
tham chiếu int count : 4 bytes
tham chiếu ngầm định bên ngoài 8 bytes
tổng cộng có 68 bytes cho mỗi đối tượng mà sau khi padding (bội số của 8) sẽ là 72 bytes
Ta có kích thước của đối tượng BST là
Object overhead: 16 bytes
tham chiếu root : 8 bytes
tham chiếu int n : 4 bytes
tổng cộng có 28 bytes chõ mỗi đối tượng mà sau khi padding là 32 bytes
Vậy tổng cộng có 32 + 72n (bytes)
 */