package com.test.testmod.events;

import com.test.testmod.TestMod;
import com.test.testmod.entity.Crocodile;
import com.test.testmod.entity.TestEntity;
import com.test.testmod.init.EntityInit;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.TEST_ENTITY.get(), TestEntity.createTestAttributes().build());

        event.put(EntityInit.CROCODILE.get(), Crocodile.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(
                EntityInit.TEST_ENTITY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                TestEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );

        event.register(
                EntityInit.CROCODILE.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                Crocodile::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
    }
}
