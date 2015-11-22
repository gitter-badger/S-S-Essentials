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
