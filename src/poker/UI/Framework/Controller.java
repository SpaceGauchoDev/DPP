/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Framework;

/**
 *
 * @author MDA 174321 :)
 */
public abstract class Controller {
    public View myView;
    public ClientUI myClientUI = new ClientUI();

    public Controller(View aView) {
        myView = aView;
    }
    
    public void setWindowTitle(String aString){
        myView.mySetTitle(aString);
    }
}
