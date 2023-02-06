package net.ribs.sc.scguns.client;


import com.mrcrayfish.guns.client.render.gun.ModelOverrides;
import com.mrcrayfish.guns.client.render.gun.model.ShortScopeModel;
import net.ribs.sc.scguns.client.render.gun.model.BasicSightModel;

import net.ribs.sc.scguns.core.registry.ItemRegistry;

public class ClientHandler {
    public static void registerModelOverrides() {

        ModelOverrides.register(ItemRegistry.BASIC_SIGHT.get(), new BasicSightModel());

    }
}
