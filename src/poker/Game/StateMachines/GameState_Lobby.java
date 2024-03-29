/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game.StateMachines;

import poker.Game.Game;
import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class GameState_Lobby implements State{

    public GameState_Lobby(StateMachine aStateMachine) {
        if (aStateMachine instanceof Game){
            Game game = (Game)aStateMachine;
            Utils.logState("Game id: "+ game.getId() + " transitions to GameState_Lobby.");
        }
    }
    
    @Override
    public void handleAction(StateMachine aStateMachine) {
        if (aStateMachine instanceof Game){
            Game game = (Game)aStateMachine;
            if(game.isFull()){
                GameState_In_Progress state = new GameState_In_Progress(aStateMachine);
                nextState(aStateMachine, state);
            }
        }
    }

    @Override
    public void nextState(StateMachine aStateMachine, State aState) {
        aStateMachine.setState(aState);
    }

}
