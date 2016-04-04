package io.github.md678685.minecraft.bukkit.chatchannelapi.api;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;

import java.util.Collection;

/**
 * An class to represent information about a channel.
 *
 * @author  md678685
 * @version 0.1-SNAPSHOT
 * @since   0.1-SNAPSHOT
 */
public class ChannelInfo {

    private String channelName;
    private String channelDesc;
    private Command sendCommand;
    private Command muteCommand;
    private Command toggleCommand;
    private Permission sendPerm;
    private Permission togglePerm;
    private Permission receivePerm;
    private Collection<Player> members;
    private Collection<Player> mutedMembers;

}
