/*
 * This file is part of SSEssentials, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015-2015 KingGoesGaming
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ca.kinggoesgaming.ssessentials;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.*;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.service.config.ConfigDir;

import java.io.File;

import static ca.kinggoesgaming.ssessentials.PluginDescription.ID;
import static ca.kinggoesgaming.ssessentials.PluginDescription.VERSION;


/**
 * The informative main class for SSEssentials
 */
@Plugin(id = ID,
        name = PluginDescription.NAME,
        version = VERSION,
        dependencies = PluginDescription.DEPENDENCIES)
public class SSEssentials {

    private SSEssentials() {}

    private static SSEssentials ssEssentials = new SSEssentials();

    @Inject
    @ConfigDir(sharedRoot = false)
    private File configDir;

    @Inject
    private Game game;

    @Inject
    private Logger logger;

    @Listener
    public void onPreInitialization(GamePreInitializationEvent event) {
        getLogger().info("Loading " + ID);
    }

    @Listener
    public void onInitialization(GameInitializationEvent event) {
        //TODO register commands
        //TODO register events
    }

    @Listener
    public void onPostInitialization(GamePostInitializationEvent event) {

    }

    @Listener
    public void onLoadComplete(GameLoadCompleteEvent event) {
        getLogger().info("Loaded " + ID + " v" + VERSION);
    }

    @Listener
    public void onStopping(GameStoppedServerEvent event) {
        getLogger().info("Unloading " + ID);

        //TODO do the unloading stuff

        getLogger().info("Unloaded " + ID);
    }


    public static SSEssentials getSsEssentials() {
        return ssEssentials;
    }

    public File getConfigDir() {
        return configDir;
    }

    public Game getGame() {
        return game;
    }

    public Logger getLogger() {
        return logger;
    }
}
