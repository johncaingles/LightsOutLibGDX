package com.royaleclashe.lightsout.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.royaleclashe.lightsout.LightsOut;
import com.royaleclashe.lightsout.Scenes.Hud;

import javafx.scene.effect.Light;

/**
 * Created by John Israel on 3/15/2016.
 */
public class PlayScreen implements Screen {

    private LightsOut game;
    private OrthographicCamera gamecam;
    private Viewport gamePort;

    private Hud hud;

    public PlayScreen( LightsOut game ){
        this.game = game;
        gamecam = new OrthographicCamera();
        gamePort = new StretchViewport(LightsOut.V_WIDTH, LightsOut.V_HEIGHT, gamecam);

        hud = new Hud(game.batch);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        /** cLEAr the screen */
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();

//      for drawing textture but no nteed na daw hhaha
//        game.batch.setProjectionMatrix(gamecam.combined);
//        /** opens the box? */
//        game.batch.begin();
//        game.batch.draw(texture, 0, 0);
//        game.batch.end();
//        /* ^ close the box then draw to the screen dafuq */

    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
