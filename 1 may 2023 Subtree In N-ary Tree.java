class Solution{
    public int duplicateSubtreeNaryTree(Node root){
        Map<String, Integer> subtreeMap = new HashMap<>();
        constructSubtreeString(root, subtreeMap);
        int count = 0;
        for (int freq : subtreeMap.values()) {
            if (freq > 1) {
                count++;
            }
        }
        return count;
    }

    private String constructSubtreeString(Node node, Map<String, Integer> subtreeMap) {
        StringBuilder sb = new StringBuilder();
        sb.append(node.data).append(":");
        List<String> childSubtrees = new ArrayList<>();
        for (Node child : node.children) {
            childSubtrees.add(constructSubtreeString(child, subtreeMap));
        }
        Collections.sort(childSubtrees);
        for (String childSubtree : childSubtrees) {
            sb.append(childSubtree).append(",");
        }
        String subtreeString = sb.toString();
        subtreeMap.put(subtreeString, subtreeMap.getOrDefault(subtreeString, 0) + 1);
        return subtreeString;
    }
    
}
