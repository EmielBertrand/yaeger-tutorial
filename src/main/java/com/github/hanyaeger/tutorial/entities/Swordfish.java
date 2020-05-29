package com.github.hanyaeger.tutorial.entities;

import com.github.hanyaeger.api.engine.Size;
import com.github.hanyaeger.api.engine.entities.entity.Location;
import com.github.hanyaeger.api.engine.entities.entity.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.engine.entities.entity.collisions.Collider;
import com.github.hanyaeger.api.engine.entities.entity.sprite.DynamicSpriteEntity;
import com.github.hanyaeger.api.engine.scenes.SceneBorder;

import java.util.Random;

public class Swordfish extends DynamicSpriteEntity implements SceneBorderCrossingWatcher, Collider {

    public Swordfish(Location location) {
        super("sprites/swordfish.png", location, new Size(225, 81));
        setMotionTo(2, 270d);
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder border) {
        setOriginY(new Random().nextInt((int) getSceneHeight() - 81));
        setOriginX(getSceneWidth());
    }
}
