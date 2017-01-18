/*************************************************************** 
*file: GameOverController.java 
* author: Jazmin Guerrero, Omar Rodriguez, Marc Deaso 
* class: CS 245 - Programming Graphical User Interfaces
* 
* 
*assignment: Swing Project 1 
* date last modified: 10/06/2016
* 
* purpose: This class is the controller between the gameover view
* and gameover model
* 
****************************************************************/ 
package main.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import main.java.SwingProject;
import main.java.model.GameOverModel;
import main.java.view.GameOverPanel;
import main.java.view.GamePanel;

public class GameOverController {
    private GameController gameControllerReference;
    private GameOverPanel panel;
    private GameOverModel model;
    private MainFrameController rootController;

    public GameOverController(GameOverPanel panel, GameOverModel model, MainFrameController rootController) {
        this.panel = panel;
        this.model = model;
        this.rootController = rootController;
        
        this.setup();
    }

    // method: setup
    // purpose: Connects information stored in model to the view
    // ie sets label names, button names.
    private void setup() {
        panel.getGameOverLabel().setText(model.GAME_OVER_TEXT);
        panel.getMenuButton().setText(model.getMenuButtonText());
        panel.getResetButton().setText(model.getNewGameButtonText());
        panel.getScoreLabel().setText("Final Score: " + String.valueOf(model.getScore()));
        
        panel.getMenuButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                gameControllerReference.resetGame();
                rootController.changeVisibleCard(SwingProject.FUNCTION_KEY);
            }
        });
        
        panel.getResetButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                gameControllerReference.resetGame();
                rootController.changeVisibleCard(SwingProject.GAME_KEY);
            }
        });
        
        panel.addAncestorListener(new AncestorListener(){
            @Override
            public void ancestorAdded(AncestorEvent event) {
                panel.getScoreLabel().setText("Final Score: " + gameControllerReference.getModel().getScore());
            }

            @Override
            public void ancestorRemoved(AncestorEvent event) {
            }

            @Override
            public void ancestorMoved(AncestorEvent event) {
            }
            
        });
    }
    
    public GameOverPanel getPanel() {
        return this.panel;
    }
    
    public void setPanel(GameOverPanel panel) {
        this.panel = panel;
    }
    
    public GameOverModel getModel() {
        return this.model;
    }
    
    public void setModel(GameOverModel model) {
        this.model = model;
    }

    public void setGameControllerReference(GameController gameControllerReference) {
        this.gameControllerReference = gameControllerReference;
    }
    
}
