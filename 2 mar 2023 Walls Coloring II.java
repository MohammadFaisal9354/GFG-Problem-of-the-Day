class Solution{
int minCost(int [][] costs) {
int N = costs.length;
    int K = costs[0].length;
    int INF = 1_000_000_000;

    int prevMinCost = 0;
    int prevSecondMinCost = 0;
    int prevMinColor = -1;

    for (int i = 0; i < N; i++) {
        int currMinCost = INF;
        int currSecondMinCost = INF;
        int currMinColor = -1;

        for (int j = 0; j < K; j++) {
            int cost = costs[i][j];
            if (i == 0) {
                if (cost != 0 && cost < currMinCost) {
                    currSecondMinCost = currMinCost;
                    currMinCost = cost;
                    currMinColor = j;
                } else if (cost != 0 && cost < currSecondMinCost) {
                    currSecondMinCost = cost;
                }
            } else {
                if (j != prevMinColor) {
                    cost += prevMinCost;
                } else {
                    cost += prevSecondMinCost;
                }
                if (cost != 0 && cost < currMinCost) {
                    currSecondMinCost = currMinCost;
                    currMinCost = cost;
                    currMinColor = j;
                } else if (cost != 0 && cost < currSecondMinCost) {
                    currSecondMinCost = cost;
                }
            }
        }
        prevMinCost = currMinCost;
        prevSecondMinCost = currSecondMinCost;
        prevMinColor = currMinColor;
    }
    if (prevMinCost == INF) {
        return -1;
    } else {
        return prevMinCost;
	}
}
}
