package main.java.me.Mammothskier.Giants.events;

import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.MagmaCube;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import main.java.me.Mammothskier.Giants.files.Config;
import main.java.me.Mammothskier.Giants.files.MagmaCubeBiomes;
import main.java.me.Mammothskier.Giants.utils.API;

public class MagmaCubeSpawnEvent extends Event {
	private static boolean cancelled = false;
	private Entity entity;
	private Location location;
	private static final HandlerList handlers = new HandlerList();

	public MagmaCubeSpawnEvent(Location loc) {
		location = loc;
		Biome biome = loc.getWorld().getBiome(loc.getBlockX(), loc.getBlockZ());
		String string = API.getFileHandler().getMagmaCubeProperty(main.java.me.Mammothskier.Giants.files.MagmaCube.MAGMACUBE, "Giants Configuration.Giant Stats.Size");
		int size;
		try {
			size = Integer.parseInt(string);
		} catch (Exception e) {
			size = 12;
		}

		if (!API.getMagmaCubeSpawnWorlds().contains(loc.getWorld().getName())) {
			setCancelled(true);
		}
		
		if(!API.getFileHandler().getProperty(Config.CONFIG, "Giants Configuration.Entities.Giant Magma Cube").equalsIgnoreCase("true")){
			setCancelled(true);
		}

		if (!isCancelled()) {
			if (biome == Biome.SWAMPLAND) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Swampland.Swampland").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.SWAMPLAND_MOUNTAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Swampland.Swampland Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.FOREST) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Forest.Forest").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);;
				}
			}
			if (biome == Biome.FOREST_HILLS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Forest.Forest Hills").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.TAIGA) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Taiga.Taiga").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.TAIGA_HILLS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Taiga.Taiga Hills").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.TAIGA_MOUNTAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Taiga.Taiga Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.COLD_TAIGA) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Taiga.Cold Taiga").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.COLD_TAIGA_HILLS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Taiga.Cold Taiga Hills").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.COLD_TAIGA_MOUNTAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Taiga.Cold Taiga Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.MEGA_TAIGA) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Taiga.Mega Taiga").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.MEGA_TAIGA_HILLS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Taiga.Mega Taiga Hills").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.MEGA_SPRUCE_TAIGA) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Taiga.Mega Spruce Taiga").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.MEGA_SPRUCE_TAIGA_HILLS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Taiga.Mega Spruce Taiga Hills").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.PLAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Plains.Plains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.ICE_PLAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Plains.Ice Plains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.ICE_PLAINS_SPIKES) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Plains.Ice Plains Spikes").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.SUNFLOWER_PLAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Plains.Sunflower Plains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.OCEAN) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Ocean.Ocean").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.DEEP_OCEAN) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Ocean.Deep Ocean").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.FROZEN_OCEAN) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Ocean.Frozen Ocean").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.RIVER) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.River.River").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.FROZEN_RIVER) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.River.Frozen River").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.BEACH) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Beach.Beach").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.STONE_BEACH) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Beach.Stone Beach").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.COLD_BEACH) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Beach.Cold Beach").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.EXTREME_HILLS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Extreme Hills.Extreme Hills").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.EXTREME_HILLS_PLUS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Extreme Hills.Extreme Hills Plus").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.EXTREME_HILLS_MOUNTAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Extreme Hills.Extreme Hills Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.EXTREME_HILLS_PLUS_MOUNTAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Extreme Hills.Extreme Hills Plus Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.MUSHROOM_ISLAND) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Mushroom Island.Mushroom Island").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.MUSHROOM_SHORE) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Mushroom Island.Mushroom Shore").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.DESERT) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Desert.Desert").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.DESERT_HILLS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Desert.Desert Hills").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.DESERT_MOUNTAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Desert.Desert Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if ((biome == Biome.JUNGLE) || (biome == Biome.JUNGLE_EDGE)) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Jungle.Jungle").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if ((biome == Biome.JUNGLE_HILLS) || (biome == Biome.JUNGLE_EDGE)) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Jungle.Jungle Hills").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if ((biome == Biome.JUNGLE_MOUNTAINS) || (biome == Biome.JUNGLE_EDGE) || (biome == Biome.JUNGLE_EDGE_MOUNTAINS)) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Jungle.Jungle Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.BIRCH_FOREST) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Birch Forest.Birch Forest").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);;
				}
			}
			if (biome == Biome.BIRCH_FOREST_HILLS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Birch Forest.Birch Forest Hills").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.BIRCH_FOREST_MOUNTAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Birch Forest.Birch Forest Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.BIRCH_FOREST_HILLS_MOUNTAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Birch Forest.Birch Forest Hills Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.SAVANNA) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Savanna.Savanna").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.SAVANNA_MOUNTAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Savanna.Savanna Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.SAVANNA_PLATEAU) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Savanna.Savanna Plateau").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.SAVANNA_PLATEAU_MOUNTAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Savanna.Savanna Plateau Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.ROOFED_FOREST) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Roofed Forest.Roofed Forest").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.ROOFED_FOREST_MOUNTAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Roofed Forest.Roofed Forest Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.MESA) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Mesa.Mesa").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.MESA_BRYCE) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Mesa.Mesa Bryce").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.MESA_PLATEAU) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Mesa.Mesa Plateau").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.MESA_PLATEAU_FOREST) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Mesa.Mesa Plateau Forest").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.MESA_PLATEAU_MOUNTAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Mesa.Mesa Plateau Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.MESA_PLATEAU_FOREST_MOUNTAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Mesa.Mesa Plateau Forest Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.SMALL_MOUNTAINS) {
				if(API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Other").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.ICE_MOUNTAINS) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Other.Ice Mountains").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);;
				}
			}
			if (biome == Biome.HELL) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Other.Hell").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
			if (biome == Biome.SKY) {
				if (API.getFileHandler().getMagmaCubeBiomesProperty(MagmaCubeBiomes.MAGMACUBEBIOMES, "Giants Configuration.Biome Settings.Other.Sky").equalsIgnoreCase("true")) {
					MagmaCube entity = (MagmaCube) loc.getWorld().spawnEntity(location, EntityType.MAGMA_CUBE);
					entity.setSize(size);
				}
			}
		}
	}

	public void setCancelled(boolean cancel) {
		cancelled = cancel;
	}

	public static boolean isCancelled() {
		return cancelled;
	}

	public Entity getEntity() {
		return entity;
	}

	public Location getLocation() {
		return location;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
