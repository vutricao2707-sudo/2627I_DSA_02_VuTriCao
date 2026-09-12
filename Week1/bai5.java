/*
mảng đã cho không thể biểu diễn dưới dạng cấu trúc weighted quick-union
vì khi gộp 2 cây, cây có gốc to hơn sẽ làm gốc cây nhỏ hơn, trước khi union(0, 5) có:
gốc cây 0 có size là 7 {2}, {3, 4}, {6, 8, 1}
gốc cây 5 có size là 3 {7, 9}
mà 7 > 3 nên 5 không thể làm gốc vậy nên mảng đã cho không thể biểu diễn dưới dạng weighted quick union
*/