/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Player;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author MDA 174321 :)
 */
public class PlayerRowComponent extends javax.swing.JPanel {
    static Color joinedLocalBgColor = new Color(102, 153, 204);
    static Color joinedRemoteBgColor = new Color(153, 102, 204);
    static Color pendingBgColor = new Color(150, 150, 150);
    
    /**
     * Creates new form PlayerRowComponent
     */
    public PlayerRowComponent() {
        initComponents();
    }
    
    public void setHand(ArrayList<CardModel> aCards){
        myHandComponent.setHand(aCards);
    }
    
    public void setHandReverse(){
        myHandComponent.setCardsReverse();
    }
    
    public void showInfo(boolean aShowInfo){
        myPlayerInfoComponent.showInfo(aShowInfo);
    }
    
    public void setInfo(PlayerModel aPlayerModel){
        myPlayerInfoComponent.set(aPlayerModel);
        if(aPlayerModel.myIsLocal){
            setBackground(joinedLocalBgColor);
        }else{
            setBackground(joinedRemoteBgColor);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myHandComponent = new poker.UI.Player.HandComponent();
        myPlayerInfoComponent = new poker.UI.Player.PlayerInfoComponent();

        setBackground(new java.awt.Color(150, 150, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(myPlayerInfoComponent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myHandComponent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myHandComponent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myPlayerInfoComponent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private poker.UI.Player.HandComponent myHandComponent;
    private poker.UI.Player.PlayerInfoComponent myPlayerInfoComponent;
    // End of variables declaration//GEN-END:variables
}
