import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;
import javax.swing.*;

public class PacMan extends JPanel {
    private int rowcount = 21;
    private int coloumncount = 19;
    private int tileSize = 32;

    private int boardWidth = coloumncount * tileSize;
    private int boardHeight = rowcount * tileSize;

    private Image wallImage;
    private Image brownghostImage;
    private Image pinkghostImage;
    private Image redghostImage;

    private Image pacmanUpImage;
    private Image pacmanLeftImage;
    private Image pacmanRightImage;
    private Image pacmanDownImage;
   

    /*Constructor create */
        PacMan() {
            setPreferredSize(new Dimension(boardWidth, boardHeight));
            setBackground(Color.black);

            //load imjages
            
        }
    
    }
