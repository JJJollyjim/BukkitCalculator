package com.kwiius.BukkitCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatHandler implements Listener {
	@EventHandler
	public void chatMessage(AsyncPlayerChatEvent event) {
		String msg = event.getMessage();
		String inb;

		Pattern regex = Pattern.compile("(?<=\\[)([^\\]]*)(?=\\])");
		Matcher regexMatcher = regex.matcher(msg);
		while (regexMatcher.find()) {
			inb = regexMatcher.group();
			if (inb.length() != 0) {
				if (inb.charAt(0) == 's') {
					//newMsg = "Stack";
				} else {
					String result = Utils.tryCalcR(inb);
					if(result != null) {
						String newMsg = msg.substring(0, regexMatcher.start()-1) + result + msg.substring(regexMatcher.end()+1);
						event.setMessage(newMsg);
					}
				}
			}
		}
	}
}