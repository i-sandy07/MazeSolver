package GUIAPPLICATION;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
//import static UserInterface.Dfs.searchPath;

public class UserInterface extends JFrame {

//    create an 2D array for a maze
    private static int maze[][]={{1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,18,1,0,1,0,1,0,0,0,0,0,1},//1=>blocked
        {1,0,1,0,0,0,1,0,1,1,1,0,1},//0=>not blocked
        {1,0,0,0,1,1,1,0,0,0,0,0,1},//18=>starting point
        {1,0,1,0,0,0,0,0,1,1,1,0,1},//29=>destination
        {1,0,1,0,1,1,1,0,1,0,0,0,1},
        {1,0,1,0,1,0,0,0,1,1,1,0,1},{1,0,1,0,1,1,1,0,1,0,1,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,29,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1}};
    public static ArrayList<Integer>path=new ArrayList<>();
    UserInterface(){
        setLayout(null);
        setTitle("Maze_Solver");
        setBackground(Color.BLACK);
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dfs.searchPath(maze,1,1,path);
//        set
        System.out.println(path);
        setVisible(true);
    }

//    @override
    public void paint(Graphics g) {
        g.translate(100,100);

        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[i].length;j++){
                Color color=Color.WHITE;//to set color for each type of blocks
                switch(maze[i][j]){
                    case 0:color=Color.white;
                    break;
                    case 1:color=Color.YELLOW;
                    break;
                    case 18:color=Color.PINK;
                    break;
                    case 29:color=Color.BLUE;
                }
                g.setColor(color);
                g.fillRect(j*30,i*30,30,30);
                g.setColor(Color.BLACK);
                g.drawRect(j*30,i*30,30,30);
            }

            }
        for(int k=0;k<path.size();k+=2){
            int pathx=path.get(k);
            int pathy=path.get(k+1);
            if(pathx==1&&pathy==1){
                g.setColor(Color.pink);
                g.fillRect(pathx*30,pathy*30,30,30);
            }
            else{
                g.setColor(Color.green);
                g.fillRect(pathx*30,pathy*30,20,20);
            }

        }
    }


    public static void main(String[] args){
        UserInterface view=new UserInterface();
//        view.setVisible(true);
    }


}
