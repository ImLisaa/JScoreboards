package dev.lisaa.jscoreboards.version;

import dev.lisaa.jscoreboards.abstraction.InternalObjectiveWrapper;
import dev.lisaa.jscoreboards.abstraction.WrappedHealthStyle;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.*;

public final class ObjectiveWrapper_v1_20_v1_21 extends InternalObjectiveWrapper {
  @Override
  public Objective getNameHealthObjective(Scoreboard scoreboard) {
    Objective healthObjective = scoreboard.getObjective("nameHealth");
    if (healthObjective == null) {
      healthObjective = scoreboard.registerNewObjective(
          "nameHealth",
          Criteria.HEALTH,
          ChatColor.translateAlternateColorCodes('&', "&c❤")
      );
    }
    return healthObjective;
  }

  @Override
  public Objective getTabHealthObjective(WrappedHealthStyle wrappedHealthStyle, Scoreboard scoreboard) {
    Objective healthObjective = scoreboard.getObjective("tabHealth");
    if (healthObjective == null) {
      healthObjective = scoreboard.registerNewObjective(
          "tabHealth",
          Criteria.HEALTH,
          "health",
          wrappedHealthStyle == WrappedHealthStyle.HEARTS ? RenderType.HEARTS : RenderType.INTEGER
      );
    }
    return healthObjective;
  }

  @Override
  public Objective getDummyObjective(Scoreboard scoreboard) {
    Objective objective = scoreboard.getObjective("dummy");
    if (objective == null) {
      objective = scoreboard.registerNewObjective("dummy", Criteria.DUMMY, "dummy");
    }
    return objective;
  }
}
