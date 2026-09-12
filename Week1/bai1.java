public void union(int p, int q) {
    for (int i = 0; i < leader.length; i++) {
        if (leader[i] == leader[p]) {
            leader[i] = leader [q];
        }
    }
}
/*
khởi tạo mảng ban đầu với leader = [0, 1, 2] n = 3
khi union(0, 1) => [1, 1, 2]
khi union(0, 2) => [2, 1, 2] sai vì leader của 1 là 1 nhưng đã bị đổi thành 2
 */