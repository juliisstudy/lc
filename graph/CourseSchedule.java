import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public boolean dfs(int node, List<List<Integer>> adj, boolean[] visit,boolean[] isStack){
        if(isStack[node]){
            return true;
        }
        if(visit[node]){
            return true;
        }
        visit[node] = true;
        isStack[node] = true;
        for(int neighbor:adj.get(node)){
            if(dfs(neighbor,adj,visit,isStack)){
                return true;
            }
        }
        isStack[node] = false;
        return false;

    }
    public boolean canFinish(int numCourses, int[][]prerequisites){
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        for(int i = 0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] prerequisite: prerequisites){
            adj.get(prerequisite[1]).add(prerequisite[0]);
        }
        boolean[] visit = new boolean[numCourses];
        boolean[] isStack = new boolean[numCourses];
        for(int i = 0;i<numCourses;i++){
            if(dfs(i,adj,visit,isStack)){
                return false;
            }
        }
        return true;
    }
}