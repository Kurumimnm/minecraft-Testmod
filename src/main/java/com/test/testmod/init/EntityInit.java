package com.test.testmod.init;

import com.test.testmod.TestMod;
import com.test.testmod.entity.Crocodile;
import com.test.testmod.entity.TestEntity;
import com.test.testmod.entity.TestVillager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TestMod.MODID);

    public static final RegistryObject<EntityType<TestEntity>> TEST_ENTITY = ENTITIES.register("test_entity",
            () -> EntityType.Builder.<TestEntity>of(TestEntity::new, MobCategory.CREATURE)
                    .sized(1.0f,1.0f)
                    .build(new ResourceLocation(TestMod.MODID, "test_entity").toString())
    );

    public static final RegistryObject<EntityType<Crocodile>> CROCODILE = ENTITIES.register("crocodile",
            () -> EntityType.Builder.<Crocodile>of(Crocodile::new, MobCategory.MONSTER)
                    .sized(2.0f, 0.5f)
                    .build(new ResourceLocation(TestMod.MODID, "crocodile").toString())
    );

    public static final RegistryObject<EntityType<TestVillager>> TEST_VILLAGER = ENTITIES.register("test_villager",
            () -> EntityType.Builder.<TestVillager>of(TestVillager::new, MobCategory.CREATURE)
                    .sized(0.25f, 1.0f)
                    .build(new ResourceLocation(TestMod.MODID, "test_villager").toString())
    );
}
