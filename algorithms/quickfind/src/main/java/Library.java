public class Library {
    public static void main(String[] args) {
        QuickFind quickFind = new QuickFind(10);
        quickFind.union(0, 5);
        quickFind.union(6, 5);
        quickFind.union(7, 2);
        quickFind.union(1, 2);
        quickFind.union(3, 8);
        quickFind.union(3, 4);
        quickFind.union(4, 9);
        int nodeA = 0;
        int nodeB = 9;
        System.out.println(String.format("Do Node %s connect to Node %s: %s", String.valueOf(nodeA),
                String.valueOf(nodeB), String.valueOf(quickFind.connected(nodeA,nodeB))));
    }
}