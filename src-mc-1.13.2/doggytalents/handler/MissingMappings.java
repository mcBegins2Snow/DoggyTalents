package doggytalents.handler;

import com.google.common.collect.ImmutableList;

import doggytalents.DoggyTalentsMod;
import doggytalents.ModEntities;
import doggytalents.ModItems;
import doggytalents.helper.Compatibility;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.MissingMappings.Mapping;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MissingMappings {

	 @SubscribeEvent
	 public void remapMissingEntities(final RegistryEvent.MissingMappings<EntityType<?>> event) {
		 ImmutableList<Mapping<EntityType<?>>> mappings = event.getMappings();
		 if(mappings != null) {
			 for(Mapping<EntityType<?>> mapping : mappings) {
				 if(mapping.key != null && mapping.key.equals(Compatibility.DOGGY_BEAM)) {
					 mapping.remap(ModEntities.DOG_BEAM);
				     DoggyTalentsMod.LOGGER.info("Remapped Dog Beam id");
				 }
			 }
		 }
	 }
	 
	 @SubscribeEvent
	 public void remapMissingItems(final RegistryEvent.MissingMappings<Item> event) {
		 ImmutableList<Mapping<Item>> mappings = event.getMappings();
		 if(mappings != null) {
			 for(Mapping<Item> mapping : mappings) {
				 if(mapping.key != null && mapping.key.equals(Compatibility.COMMAND_EMBLEM)) {
					 mapping.remap(ModItems.WHISTLE);
				     DoggyTalentsMod.LOGGER.info("Remapped Command Emblem to Whistle");
				 }
			 }
		 }
	 }
}
