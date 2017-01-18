/***************************************************************
* file: HighScoreModel.java
* author: Nahid Enayatzadeh
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Swing Project v1.0
* date last modified: 10/11/2016
*
* purpose: This is the model that contains the business logic for the
* highscore screen
*
****************************************************************/ 
package main.java.model;

import java.awt.Color;
import static main.java.SwingProject.CONTRIBUTORS;

public class HighScoreModel implements PanelModel {
    private String highScoreTitle;
    private String[] teamMembers;
    private Color backgroundColor;
    private String backButtonText;
    
    /*
    HighScoreModel constrouctor giving value to the variables 
    */
    public HighScoreModel() {
        this.highScoreTitle = "PLACEHOLDER";
        this.teamMembers = new String[CONTRIBUTORS.length];
        this.backgroundColor = Color.BLACK;
        this.backButtonText = "Back";
    }
    /*
    HighScoreModel constructor accept title name, string array of members name
    * and the color of background and set it up to the private varialbes that
    * declared on the class
    */
     public HighScoreModel(String title, String[] members, Color color) {
        this.highScoreTitle = title;
        this.teamMembers = members;
        this.backgroundColor = color;
        this.backButtonText = "Back";
    }
    
     //Method: getHighScoreTiltle
    //Purpose: Having access to high score title
     public String getHighScoreTitle() {
        return this.highScoreTitle;
    }
    
    //Method: setHighScoreTilte
    //Purpose: Modyfing the High score title
    public void setHighScoreTitle(String highScoreTitle) {
        this.highScoreTitle = highScoreTitle;
    }
    
    //Method: getMember
    //Purpose: Having access to Member names
    public String[] getMembers() {
        return this.teamMembers;
    }
    
    //Method: setMember
    //Purpose: Modyfing Membere names
    public void setMembers(String[] members) {
        this.teamMembers = members;
    }
    
    //Method: getBackgroundColore
    //Purpose: Having access to back grond color
    public Color getBackgroundColor() {
        return this.backgroundColor;
    }
    
    //Method: setBackgroundColor
    //Purpose: Modyfing the background color
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    
    //Method: getBackButtonText
    //Purpose: Having access to change the back button text
    public String getBackButtonText() {
        return this.backButtonText;
    }
}
