/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.mcreator.sonic_mania;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class Elementssonic_mania {
	protected final List<ModElement> elements = new ArrayList<>();
	protected final List<Supplier<Block>> blocks = new ArrayList<>();
	protected final List<Supplier<Item>> items = new ArrayList<>();
	protected final List<Supplier<Biome>> biomes = new ArrayList<>();
	protected final List<Supplier<EntityType<?>>> entities = new ArrayList<>();

	public Elementssonic_mania() {
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("sonic_mania").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == Elementssonic_mania.ModElement.class)
						elements.add((Elementssonic_mania.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(Elementssonic_mania.ModElement::initElements);
		this.addNetworkMessage(sonic_maniaVariables.WorldSavedDataSyncMessage.class, sonic_maniaVariables.WorldSavedDataSyncMessage::buffer,
				sonic_maniaVariables.WorldSavedDataSyncMessage::new, sonic_maniaVariables.WorldSavedDataSyncMessage::handler);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		ResourceLocation sound0 = new ResourceLocation("sonic_mania", "super_sonic");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound0).setRegistryName(sound0));
		ResourceLocation sound1 = new ResourceLocation("sonic_mania", "green_hill_act_1");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound1).setRegistryName(sound1));
		ResourceLocation sound2 = new ResourceLocation("sonic_mania", "studiopolis_zone_act_1");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound2).setRegistryName(sound2));
		ResourceLocation sound3 = new ResourceLocation("sonic_mania", "chemical_plant_zone_act_1");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound3).setRegistryName(sound3));
		ResourceLocation sound4 = new ResourceLocation("sonic_mania", "chemical_plant_zone_act2");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound4).setRegistryName(sound4));
		ResourceLocation sound5 = new ResourceLocation("sonic_mania", "green_hill_act_2");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound5).setRegistryName(sound5));
		ResourceLocation sound6 = new ResourceLocation("sonic_mania", "studiopolis_zone_act_2");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound6).setRegistryName(sound6));
		ResourceLocation sound7 = new ResourceLocation("sonic_mania", "flying_battery_zone_act_1");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound7).setRegistryName(sound7));
		ResourceLocation sound8 = new ResourceLocation("sonic_mania", "flying_battery_zone_act_2");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound8).setRegistryName(sound8));
		ResourceLocation sound9 = new ResourceLocation("sonic_mania", "press_garden_zone_act_2");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound9).setRegistryName(sound9));
		ResourceLocation sound10 = new ResourceLocation("sonic_mania", "press_garden_zone_act_1");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound10).setRegistryName(sound10));
		ResourceLocation sound11 = new ResourceLocation("sonic_mania", "stardust_speedway_zone_act_1");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound11).setRegistryName(sound11));
		ResourceLocation sound12 = new ResourceLocation("sonic_mania", "stardust_speedway_zone_act_2");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound12).setRegistryName(sound12));
		ResourceLocation sound13 = new ResourceLocation("sonic_mania", "hydrocity_zone_act_1");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound13).setRegistryName(sound13));
		ResourceLocation sound14 = new ResourceLocation("sonic_mania", "hydrocity_zone_act_2");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound14).setRegistryName(sound14));
		ResourceLocation sound15 = new ResourceLocation("sonic_mania", "mirage_saloon_zone_act_1_sonic");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound15).setRegistryName(sound15));
		ResourceLocation sound16 = new ResourceLocation("sonic_mania", "mirage_saloon_zone_act_1_knuckles");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound16).setRegistryName(sound16));
		ResourceLocation sound17 = new ResourceLocation("sonic_mania", "lava_reef_zone_act_1");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound17).setRegistryName(sound17));
		ResourceLocation sound18 = new ResourceLocation("sonic_mania", "lava_reef_zone_act_2");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound18).setRegistryName(sound18));
		ResourceLocation sound19 = new ResourceLocation("sonic_mania", "metallic_madness_zone_act_1");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound19).setRegistryName(sound19));
		ResourceLocation sound20 = new ResourceLocation("sonic_mania", "metallic_madness_act_2");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound20).setRegistryName(sound20));
		ResourceLocation sound21 = new ResourceLocation("sonic_mania", "titanic_monarch_zone_act_1");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound21).setRegistryName(sound21));
		ResourceLocation sound22 = new ResourceLocation("sonic_mania", "titanic_monarch_zone_act_2");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound22).setRegistryName(sound22));
		ResourceLocation sound23 = new ResourceLocation("sonic_mania", "oil_ocean_zone_act_1");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound23).setRegistryName(sound23));
		ResourceLocation sound24 = new ResourceLocation("sonic_mania", "oil_ocean_zone_act_2");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound24).setRegistryName(sound24));
		ResourceLocation sound25 = new ResourceLocation("sonic_mania", "metal_sonic");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound25).setRegistryName(sound25));
		ResourceLocation sound26 = new ResourceLocation("sonic_mania", "extra_life");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound26).setRegistryName(sound26));
		ResourceLocation sound27 = new ResourceLocation("sonic_mania", "speed_shoes");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound27).setRegistryName(sound27));
		ResourceLocation sound28 = new ResourceLocation("sonic_mania", "game_over");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound28).setRegistryName(sound28));
		ResourceLocation sound29 = new ResourceLocation("sonic_mania", "act_clear");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound29).setRegistryName(sound29));
		ResourceLocation sound30 = new ResourceLocation("sonic_mania", "star_post");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound30).setRegistryName(sound30));
		ResourceLocation sound31 = new ResourceLocation("sonic_mania", "destroy");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound31).setRegistryName(sound31));
		ResourceLocation sound32 = new ResourceLocation("sonic_mania", "ring");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound32).setRegistryName(sound32));
		ResourceLocation sound33 = new ResourceLocation("sonic_mania", "ringo");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound33).setRegistryName(sound33));
		ResourceLocation sound34 = new ResourceLocation("sonic_mania", "invincibiliity");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound34).setRegistryName(sound34));
		ResourceLocation sound35 = new ResourceLocation("sonic_mania", "sheild_armor_equip");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound35).setRegistryName(sound35));
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote) {
			WorldSavedData mapdata = sonic_maniaVariables.MapVariables.get(event.getPlayer().world);
			WorldSavedData worlddata = sonic_maniaVariables.WorldVariables.get(event.getPlayer().world);
			if (mapdata != null)
				sonic_mania.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new sonic_maniaVariables.WorldSavedDataSyncMessage(0, mapdata));
			if (worlddata != null)
				sonic_mania.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new sonic_maniaVariables.WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote) {
			WorldSavedData worlddata = sonic_maniaVariables.WorldVariables.get(event.getPlayer().world);
			if (worlddata != null)
				sonic_mania.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new sonic_maniaVariables.WorldSavedDataSyncMessage(1, worlddata));
		}
	}
	private int messageID = 0;

	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		sonic_mania.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<Biome>> getBiomes() {
		return biomes;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final Elementssonic_mania elements;
		protected final int sortid;

		public ModElement(Elementssonic_mania elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
