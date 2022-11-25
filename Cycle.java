public class Cycle {
    static int V;
    int path[] = { 0 };

    public Cycle(int V) {
        Cycle.V = V;
    }

    boolean isSafe(int v, int graph[][], int path[], int pos) {

        if (graph[path[pos - 1]][v] == 0)
            return false;
        for (int i = 0; i < pos; i++)
            if (path[i] == v)
                return false;
        return true;
    }

    boolean hamCycleUtil(int graph[][], int path[], int pos) {

        if (pos == V) {
            if (graph[path[pos - 1]][path[0]] == 1)
                return true;
            else
                return false;
        }
        for (int v = 1; v < V; v++) {

            if (isSafe(v, graph, path, pos)) {
                path[pos] = v;

                if (hamCycleUtil(graph, path, pos + 1) == true)
                    return true;

                path[pos] = -1;
            }
        }
        return false;
    }

    int hamCycle(int graph[][]) {
        path = new int[V];
        for (int i = 0; i < V; i++)
            path[i] = -1;
        path[0] = 0;
        if (hamCycleUtil(graph, path, 1) == false) {
            return 0;
        }
        return 1;
    }
}