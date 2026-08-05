class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();

        for (int[] edge : invocations) {
            int a = edge[0], b = edge[1];
            adj[a].add(b);  
        }

        boolean[] suspicious = new boolean[n];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(k);
        suspicious[k] = true;

        while (!stack.isEmpty()) {
            int u = stack.pop();
            for (int v : adj[u]) {
                if (!suspicious[v]) {
                    suspicious[v] = true;
                    stack.push(v);
                }
            }
        }

        boolean canRemove = true;
        for (int[] edge : invocations) {
            int a = edge[0], b = edge[1];
            if (!suspicious[a] && suspicious[b]) {
                // outside -> inside edge exists: cannot remove
                canRemove = false;
                break;
            }
        }

        List<Integer> ans = new ArrayList<>();
        if (!canRemove) {
            // return all 0..n-1
            for (int i = 0; i < n; i++) ans.add(i);
        } else {
            // remove all suspicious; keep only non-suspicious
            for (int i = 0; i < n; i++) {
                if (!suspicious[i]) ans.add(i);
            }
        }
        return ans;
    }
}