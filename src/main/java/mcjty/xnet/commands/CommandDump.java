package mcjty.xnet.commands;

import mcjty.lib.compat.CompatCommand;
import mcjty.lib.compat.CompatCommandBase;
import mcjty.lib.tools.ChatTools;
import mcjty.xnet.multiblock.XNetBlobData;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.*;

public class CommandDump implements CompatCommand {

    @Override
    public String getName() {
        return "xnetdump";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return getName();
    }


    @Override
    public List<String> getAliases() {
        return Collections.emptyList();
    }


    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        XNetBlobData data = XNetBlobData.getBlobData(server.getEntityWorld());
        data.getWorldBlob(sender.getEntityWorld()).dump();
    }

    @Override
    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos pos) {
        return new ArrayList<>();
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    public boolean isUsernameIndex(String[] sender, int p_82358_2_) {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(ICommand o) {
        return getName().compareTo(CompatCommandBase.getCommandName(o));
    }
}
