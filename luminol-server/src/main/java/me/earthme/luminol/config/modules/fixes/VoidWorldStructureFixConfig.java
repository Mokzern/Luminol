package me.earthme.luminol.config.modules.fixes;

import me.earthme.luminol.config.IConfigModule;
import me.earthme.luminol.config.flags.ConfigClassInfo;
import me.earthme.luminol.config.flags.ConfigInfo;
import me.earthme.luminol.enums.EnumConfigCategory;

import java.util.List;

@ConfigClassInfo(category = EnumConfigCategory.FIXES, name = "void_world_structure_fix")
public class VoidWorldStructureFixConfig implements IConfigModule {
    @ConfigInfo(name = "enabled", comments = "Prevents structures from spawning at world bottom in void like worlds.")
    public static boolean enabled = false;

    @ConfigInfo(name = "affected_worlds", comments = "List of world names where this fix is applied.")
    public static List<String> affectedWorlds = List.of("world");

    @ConfigInfo(name = "min_distance_from_bottom", comments = "Minimum distance (in blocks) from world bottom for structure placement.")
    public static int minDistanceFromBottom = 32;
}
