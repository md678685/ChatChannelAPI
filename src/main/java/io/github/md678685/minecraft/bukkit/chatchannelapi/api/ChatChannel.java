package io.github.md678685.minecraft.bukkit.chatchannelapi.api;

import org.bukkit.entity.Player;

import java.util.Collection;

/**
 * An interface to represent channels.
 *
 * @author  md678685
 * @version 0.1-SNAPSHOT
 * @since   0.1-SNAPSHOT
 */
public interface ChatChannel {

    /**
     * Get the members of the channel.
     * @return  The members of the channel.
     * @author  md678685
     * @version 0.1-SNAPSHOT
     * @since   0.1-SNAPSHOT
     */
    public Collection<Player> getMembers();

    /**
     * Get information about the channel.
     * @return
     */
    public ChannelInfo getInfo();

    public void addMember(Player member);

    public void removeMember(Player member);

    public void muteMember(Player member);

    public void unmuteMember(Player member);

    public void addMembers(Collection<Player> members);

    public void removeMembers(Collection<Player> members);

    public void muteMembers(Collection<Player> members);

    public void unmuteMembers(Collection<Player> members);

    public void sendMessage(String senderName, String message);

}
