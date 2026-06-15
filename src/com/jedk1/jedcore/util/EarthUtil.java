package com.jedk1.jedcore.util;

import org.bukkit.block.Block;
import com.projectkorra.projectkorra.ability.EarthAbility;
import com.projectkorra.projectkorra.earthbending.Collapse;
import com.projectkorra.projectkorra.earthbending.RaiseEarth;

public class EarthUtil {

    // Checks if a block is actively moving to prevent duplication while allowing sourcing from stuck structures.
    public static boolean isBlockActivelyMoving(Block block) {
        if (!EarthAbility.getMovedEarth().containsKey(block)) {
            return false;
        }

        if (RaiseEarth.blockInAllAffectedBlocks(block) || Collapse.blockInAllAffectedBlocks(block)) {
            return true;
        }

        return false;
    }
}