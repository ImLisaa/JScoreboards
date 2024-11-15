package dev.lisaa.jscoreboards.version;

import dev.lisaa.jscoreboards.abstraction.InternalTeamWrapper;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.Team;

public class TeamWrapper_v1_20_v1_21 extends InternalTeamWrapper {
  @Override
  public void setColor(Team team, ChatColor color) {
    team.setColor(color);
  }
}
