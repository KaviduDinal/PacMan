import java.awt.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;
import javax.swing.*;

public class PacMan extends JPanel {

    class Block{

        int x;
        int y;
        int height;
        int width;
        Image image;

        int StartX;
        int StartY;

        Block(Image image, int x, int y, int height,int width){
            this.image=image;
            this.x=x;
            this.y=y;
            this.height=height;
            this.width=width;
            this.StartX=x;
            this.StartY=y;
        }

    }

    // Game map and entity collections
    private HashSet<Block> walls;
    private HashSet<Block> foods;
    private HashSet<Block> ghosts;
    private Block pacman;

    // X = wall, O = skip, P = pac man, ' ' = food
    // Ghosts: b = blue, o = orange, p = pink, r = red
    private String[] tileMap = {
        "XXXXXXXXXXXXXXXXXXX",
        "X        X        X",
        "X XX XXX X XXX XX X",
        "X                 X",
        "X XX X XXXXX X XX X",
        "X    X       X    X",
        "XXXX XXXX XXXX XXXX",
        "OOOX X       X XOOO",
        "XXXX X XXrXX X XXXX",
        "O       bpo       O",
        "XXXX X XXXXX X XXXX",
        "OOOX X       X XOOO",
        "XXXX X XXXXX X XXXX",
        "X        X        X",
        "X XX XXX X XXX XX X",
        "X  X     P     X  X",
        "XX X X XXXXX X X XX",
        "X    X   X   X    X",
        "X XXXXXX X XXXXXX X",
        "X                 X",
        "XXXXXXXXXXXXXXXXXXX"
    };

    private int rowcount = 21;
    private int coloumncount = 19;
    private int tileSize = 32;

    private int boardWidth = coloumncount * tileSize;
    private int boardHeight = rowcount * tileSize;

    private Image wallImage;
    private Image blueGhostImage;
    private Image orangeGhostImage;
    private Image pinkGhostImage;
    private Image redGhostImage;

    private Image pacmanUpImage;
    private Image pacmanLeftImage;
    private Image pacmanRightImage;
    private Image pacmanDownImage;

    /*Constructor create */
    PacMan() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.black);

        // load images
        wallImage = new ImageIcon(getClass().getResource("/wall.png")).getImage();
        blueGhostImage = new ImageIcon(getClass().getResource("/blueGhost.png")).getImage();
        orangeGhostImage = new ImageIcon(getClass().getResource("/orangeGhost.png")).getImage();
        pinkGhostImage = new ImageIcon(getClass().getResource("/pinkGhost.png")).getImage();

        pacmanUpImage = new ImageIcon(getClass().getResource("/pacmanUp.png")).getImage();
        pacmanLeftImage = new ImageIcon(getClass().getResource("/pacmanLeft.png")).getImage();
        pacmanDownImage = new ImageIcon(getClass().getResource("/pacmanDown.png")).getImage();
        pacmanRightImage = new ImageIcon(getClass().getResource("/pacmanRight.png")).getImage();

        loadmap();
        System.out.println(walls.size());
          System.out.println(foods.size());
            System.out.println(ghosts.size());

    }
    public void loadmap(){
        walls =new HashSet<Block>();
        foods =new HashSet<Block>();
        ghosts =new HashSet<Block>();

        for (int r=0; r< rowcount;r++) {
            for(int c=0; c < coloumncount; c++){
                String row = tileMap[r];
                char tileMapChar = row.charAt(c);

                int x = c*tileSize;
                int y =r*tileSize;

                if (tileMapChar == 'X'){
                    //block wall
                    Block wall =new Block(wallImage,x,y, tileSize,tileSize);
                    walls.add(wall);
                }
                else if(tileMapChar == 'b'){
                    Block ghost =new Block(blueGhostImage, x, y, tileSize, tileSize);
                    ghosts.add(ghost);
                }
                else if(tileMapChar == 'o'){
                    Block ghost =new Block(orangeGhostImage, x, y, tileSize, tileSize);
                    ghosts.add(ghost);
                }
                
                else if(tileMapChar == 'p'){
                    Block ghost =new Block(pinkGhostImage, x, y, tileSize, tileSize);
                    ghosts.add(ghost);
                }

                else if(tileMapChar == 'r'){
                    Block ghost =new Block(redGhostImage, x, y, tileSize, tileSize);
                    ghosts.add(ghost);
                }

                else if(tileMapChar == 'p'){
                    Block ghost =new Block(pacmanRightImage, x, y, tileSize, tileSize);
                    ghosts.add(ghost);
                }

                else if(tileMapChar == 'p'){
                    Block ghost =new Block(null,x+14,y+14,4,4);
                    foods.add(ghost);
                }





                

                


    

            }
        }


    }

}
