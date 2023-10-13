package GUIAPPLICATION;
import java.util.*;

public class Dfs {
    public static boolean searchPath(int maze[][],int x,int y,ArrayList<Integer>path){
        if(maze[x][y]==29){
            path.add(y);
            path.add(x);
            return true;
        }
        if(maze[x][y]==0||maze[x][y]==18){
            maze[x][y]=2;
            int dx=-1;//move leftward direction
            int dy=0;
            if(searchPath(maze,x+dx,y+dy,path)){
                path.add(y);
                path.add(x);
                return true;
            }
            dx=1;//move rightward direction
            dy=0;
            if(searchPath(maze,x+dx,y+dy,path)){
                path.add(y);
                path.add(x);
                return true;
            }
            dx=0;//move upward direction
            dy=-1;
            if(searchPath(maze,x+dx,y+dy,path)){
                path.add(y);
                path.add(x);
                return true;
            }
            dx=0;
            dy=1;
            if(searchPath(maze,x+dx,y+dy,path)){
                path.add(y);
                path.add(x);
                return true;
            }
            return false;
        }
        return false;
    }
}
