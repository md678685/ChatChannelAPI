package io.github.md678685.minecraft.bukkit.chatchannelapi.api;

import java.util.Collection;

/**
 * An interface for plugins providing chat channel
 * functionality.
 *
 * @author  mc678685
 * @version 0.1-SNAPSHOT
 * @since   0.1-SNAPSHOT
 */
public interface ChatChannelProvider {

    public Collection<ChatChannel> getChannels(String channelName);

    public Collection<ChatChannel> getChannels();

    public ChatChannel getChannel(String channelName);

}
