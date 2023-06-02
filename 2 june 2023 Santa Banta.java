class Complete {
    public static void precompute() {
        
    }
    public static int helpSanta(int n, int m, int g[][]) {
        if (m == 0) {
            return -1;
        }

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = g[i][0];
            int b = g[i][1];
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        boolean[] visited = new boolean[n + 1];
        ArrayList<ArrayList<Integer>> components = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                ArrayList<Integer> component = new ArrayList<>();
                dfs(i, adjList, visited, component);
                components.add(component);
            }
        }

        int maxSize = 0;
        for (ArrayList<Integer> component : components) {
            int size = component.size();
            if (size > maxSize) {
                maxSize = size;
            }
        }

        if (maxSize == 0) {
            return -1;
        } else {
            return kthPrime(maxSize);
        }
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjList, boolean[] visited,
                            ArrayList<Integer> component) {
        visited[node] = true;
        component.add(node);
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adjList, visited, component);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int kthPrime(int k) {
        int count = 0;
        int num = 2;
        while (count < k) {
            if (isPrime(num)) {
                count++;
            }
            if (count == k) {
                return num;
            }
            num++;
        }
        return -1; 
    }
}
