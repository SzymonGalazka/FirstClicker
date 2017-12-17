package entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Player extends Image {

    private final static int WIDTH = 77;
    private final static int HEIGHT = 152;

    private final static int STARTING_X = 200;
    private final static int STARTING_Y = 300;

    public Player(){
        super(new Texture("badlogic.jpg"));
        this.setOrigin(WIDTH/2,HEIGHT/2);
        this.setSize(WIDTH,HEIGHT);

        //starting position
        this.setPosition(STARTING_X,STARTING_Y);
    }

    public void reactOnClick() {
        int yMoveAmount = MathUtils.random(50,130);
        int xMoveAmount = 0;
        float moveDuration = 0.3f;
        Action moveAction = Actions.sequence(
                Actions.moveBy(xMoveAmount,yMoveAmount,moveDuration, Interpolation.circleOut),
                Actions.moveBy(xMoveAmount,-yMoveAmount,moveDuration,Interpolation.circle)
        );
        this.addAction(moveAction);
    }
}