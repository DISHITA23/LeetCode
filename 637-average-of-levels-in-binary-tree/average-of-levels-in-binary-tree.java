class Solution {
    public List<Double> averageOfLevels(TreeNode root) {

        Queue<TreeNode> levelQueue = new LinkedList<>();
        List<Double> avgList = new ArrayList<>();

        if (root == null) return avgList;

        levelQueue.add(root);
        levelQueue.add(null);

        while (!levelQueue.isEmpty()) {
            double sum = 0;
            int nodes = 0;

            while (levelQueue.peek() != null) {
                TreeNode node = levelQueue.poll();
                sum += node.val;
                nodes++;

                if (node.left != null) levelQueue.add(node.left);
                if (node.right != null) levelQueue.add(node.right);
            }

            avgList.add(sum / nodes);   
            levelQueue.poll();           

            if (!levelQueue.isEmpty()) {
                levelQueue.add(null);    
            }
        }

        return avgList;
    }
}