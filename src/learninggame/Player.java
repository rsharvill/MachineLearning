/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learninggame;

/**
 *
 * @author rachh
 */
public class Player {
    Board theBoard;
    Move move;
    
    public Player(Board board) {
        theBoard = board;
    }
    
    Move selectRandomMove(Board theBoard) { //method to simply generate random moves 
        MoveList list = theBoard.generateMoves();
        int r = rand(list.size());
        return list.get(r);
    }
    
    Move randomPlayAndLearn(Board theBoard) { //play randomply and learn from it!
        MoveList list = theBoard.generateMoves();
        Learner.trimLosing(list,theBoard); //get rid of the losing moves 
        if (list.isEmpty()) { //there are no moves left?
            Learner.handleLoss(); //save the losing information
            return selectRandomMove(theBoard);
        }
        else {
            int r = rand(list.size());
            Learner.setLastMove(theBoard, list.get(r)); //remember the last move
            
            return list.get(r);
        }
    }

    private int rand(int size) { //generate a random integer within the range of a list's size
        int randomNumber = (int)Math.random()*size;
        return randomNumber;
    }
    
}
