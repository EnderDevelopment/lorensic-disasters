package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DisasterCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;
        if (args.length < 3) {
            player.sendMessage("Usage: /disaster <type> <intensity> <location>");
            return false;
        }

        String type = args[0];
        String intensity = args[1];
        String location = args[2];

        // Logic to handle different disasters
        switch (type.toLowerCase()) {
            case "tornado":
                handleTornado(player, intensity, location);
                break;
            case "hurricane":
                handleHurricane(player, intensity, location);
                break;
            case "lakeburst":
                handleLakeburst(player, intensity, location);
                break;
            case "tsunami":
                handleTsunami(player, intensity, location);
                break;
            case "flashflood":
                handleFlashflood(player, intensity, location);
                break;
            default:
                player.sendMessage("Unknown disaster type.");
                return false;
        }
        return true;
    }

    private void handleTornado(Player player, String intensity, String location) {
        player.sendMessage("Tornado of intensity " + intensity + " at " + location);
    }

    private void handleHurricane(Player player, String intensity, String location) {
        player.sendMessage("Hurricane of intensity " + intensity + " at " + location);
    }

    private void handleLakeburst(Player player, String intensity, String location) {
        player.sendMessage("Lakeburst of intensity " + intensity + " at " + location);
    }

    private void handleTsunami(Player player, String intensity, String location) {
        player.sendMessage("Tsunami of intensity " + intensity + " at " + location);
    }

    private void handleFlashflood(Player player, String intensity, String location) {
        player.sendMessage("Flashflood of intensity " + intensity + " at " + location);
    }
}