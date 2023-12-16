import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main
{
    static int SCREEN_WIDTH = 1600;
    static int SCREEN_HEIGHT = 900;
    static String WINDOW_TITLE = "Desktop App";

    static int i = 0, j = 1;

    public static void tileGrid(JFrame frm)
    {
        int TILE_WIDTH = 60, TILE_HEIGHT = 171;
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++)
            {
                final Integer innerX = new Integer(x);
                final Integer innerY = new Integer(y);
                JButton tile = new JButton();
                tile.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        boolean[][]
                            tiles = {
                                { true,  false, false, false, true,  false, false, false },
                                { false, false, true,  false, false, false, false, false },
                                { false, false, false, false, false, true,  false, false },
                                { false, false, true,  false, false, false, false, true  },
                                { false, true,  false, false, false, false, false, false },
                                { false, false, false, false, true,  false, false, false },
                                { false, false, false, false, false, false, true,  false },
                                { false, false, false, true,  false, false, false, false }
                            };
                        if (innerX == 0)
                        {
                            if (tiles[innerX + 1][innerY + 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX + 1][innerY])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX + 1][innerY - 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX][innerY + 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX][innerY - 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX][innerY])
                            {
                                tile.setBackground(Color.RED);
                            }
                        }
                        else if (innerY == 0)
                        {
                            if (tiles[innerX + 1][innerY + 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX + 1][innerY])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX][innerY - 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX - 1][innerY])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX - 1][innerY - 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX][innerY])
                            {
                                tile.setBackground(Color.RED);
                            }
                        }
                        else if (innerX == 7)
                        {
                            if (tiles[innerX][innerY + 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX][innerY - 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX - 1][innerY + 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX - 1][innerY])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX - 1][innerY - 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX][innerY])
                            {
                                tile.setBackground(Color.RED);
                            }
                        }
                        else if (innerY == 7)
                        {
                            if (tiles[innerX + 1][innerY])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX + 1][innerY - 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX][innerY - 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX - 1][innerY])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX - 1][innerY + 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX][innerY])
                            {
                                tile.setBackground(Color.RED);
                            }
                        }
                        else
                        {
                            if (tiles[innerX + 1][innerY + 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX + 1][innerY])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX + 1][innerY - 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX][innerY + 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX][innerY - 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX - 1][innerY + 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX - 1][innerY])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX - 1][innerY - 1])
                            {
                                tile.setBackground(Color.ORANGE);
                            }
                            else if (tiles[innerX][innerY])
                            {
                                tile.setBackground(Color.RED);
                            }
                        }
                    }
                });
                tile.setBounds(TILE_HEIGHT * y, TILE_WIDTH * x, TILE_HEIGHT, TILE_WIDTH);
                frm.add(tile);
            }
        }
    }

    public static void main(String[] args)
    {
        JFrame frm = new JFrame(WINDOW_TITLE);
        tileGrid(frm);
        frm.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        frm.setLayout(null);
        frm.setVisible(true);
    }
}