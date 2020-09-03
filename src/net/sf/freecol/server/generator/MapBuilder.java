package net.sf.freecol.server.generator;


import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.LandMap;
import net.sf.freecol.common.model.Map;
import net.sf.freecol.common.model.Player;
import net.sf.freecol.common.util.LogBuilder;

import java.util.List;

public interface MapBuilder {
    public abstract LandMap buildLandMap(Game game, Map importMap, LogBuilder lb);
    public abstract Map buildTerrain(Game game, Map importMap, LandMap landMap, LogBuilder lb);
    public abstract void buildNativeSettlements(final Map map, Map importMap, LogBuilder lb);
    public abstract void buildLostCityRumours(Map map, Map importMap, LogBuilder lb);
    public abstract void buildEuropeanUnits(Map map, List<Player> players, LogBuilder lb);
}
