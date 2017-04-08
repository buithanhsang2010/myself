public class QuickFind {
    int[] nodes;

    public QuickFind(int nodeNumber) {
        this.nodes = new int[nodeNumber];
        for(int i=0 ; i < this.nodes.length; i++) {
            this.nodes[i] = i;
        }
    }

    public boolean connected(int nodeA, int nodeB) {
        return this.nodes[nodeB] == this.nodes[nodeA];
    }

    public void union(int nodeA, int nodeB) {
        int valueOfCurrentNode;
        int valueOfNodeA = this.nodes[nodeA];
        int valueOfNodeB = this.nodes[nodeB];
        int minValue = (valueOfNodeA > valueOfNodeB) ? valueOfNodeB:valueOfNodeA;
        for(int i=0; i < this.nodes.length; i++) {
            valueOfCurrentNode = this.nodes[i];
            if(valueOfCurrentNode == valueOfNodeA || valueOfCurrentNode == valueOfNodeB) {
                this.nodes[i] = minValue;
            }
        }
    }
}