package doggytalents;

import doggytalents.inventory.recipe.RecipeDogBed;
import doggytalents.inventory.recipe.RecipeDogCape;
import doggytalents.inventory.recipe.RecipeDogCollar;
import net.minecraft.item.crafting.RecipeSerializers;

public class ModRecipes {
	
	public static RecipeSerializers.SimpleSerializer<RecipeDogBed> DOG_BED;
	public static RecipeSerializers.SimpleSerializer<RecipeDogCollar> DOG_COLLAR;
	public static RecipeSerializers.SimpleSerializer<RecipeDogCape> DOG_CAPE;

    public static class Registration {
		public static void registerRecipes() {
			DOG_BED = RecipeSerializers.register(new RecipeSerializers.SimpleSerializer<>("doggytalents:dogbed", RecipeDogBed::new));
			DOG_COLLAR = RecipeSerializers.register(new RecipeSerializers.SimpleSerializer<>("doggytalents:dogcollar", RecipeDogCollar::new));
			DOG_CAPE = RecipeSerializers.register(new RecipeSerializers.SimpleSerializer<>("doggytalents:dogcape", RecipeDogCape::new));
		}
    }

}
