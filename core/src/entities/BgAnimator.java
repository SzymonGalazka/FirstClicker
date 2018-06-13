package entities;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class BgAnimator extends Actor {

    private Animation animation;
    private TextureRegion currentRegion;

    private float time = 0f;

    public BgAnimator(Animation animation) {
        this.animation = animation;
    }

    @Override
    public void act(float delta){
        super.act(delta);
        time += delta;

        currentRegion = (TextureRegion) animation.getKeyFrame(time,true);
    }

    @Override
    public void draw(final Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        batch.draw(currentRegion, getX(), getY());


    }
}
