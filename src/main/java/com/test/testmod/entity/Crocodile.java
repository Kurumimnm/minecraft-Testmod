package com.test.testmod.entity;

import com.test.testmod.init.EntityInit;
import com.test.testmod.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.BossEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

public class Crocodile extends Monster{
    private final ServerBossEvent bossInfo = new ServerBossEvent(this.getDisplayName(), ServerBossEvent.BossBarColor.GREEN, ServerBossEvent.BossBarOverlay.NOTCHED_20);
    public final AnimationState idleAnimationState = new AnimationState();

    public Crocodile(EntityType<Crocodile> type, Level level) {
        super(type, level);
    }
    public Crocodile(Level level, double x, double y, double z) {
        this(EntityInit.CROCODILE.get(), level);
        setPos(x, y, z);
    }

    public Crocodile(Level level, BlockPos pos) {
        this(level, pos.getX(), pos.getY(), pos.getZ());
    }


    public Crocodile getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return new Crocodile(level, this.blockPosition());
    }
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, true));
        this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(5, new FloatGoal(this));
    }

    @Override
    public void startSeenByPlayer(ServerPlayer player) {
        super.startSeenByPlayer(player);
        this.bossInfo.addPlayer(player);
    }

    @Override
    public void stopSeenByPlayer(ServerPlayer player) {
        super.stopSeenByPlayer(player);
        this.bossInfo.removePlayer(player);
    }
    private boolean hasPlayedDeathSound = false;
    @Override
    public void customServerAiStep() {
        if(this.getHealth() / this.getMaxHealth() <= 0.5) {
            this.bossInfo.setColor(BossEvent.BossBarColor.RED);
            if (!hasPlayedDeathSound) {
                this.playSound(SoundEvents.ENDER_DRAGON_DEATH, 0.15f, 1);
                hasPlayedDeathSound = true;
            }

        }
        this.bossInfo.setProgress(this.getHealth() / this.getMaxHealth());
    }


    @Override

    public void die(DamageSource source) {
        this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), 0.15f, 1);
        super.die(source);
        this.bossInfo.setProgress(0.0f);
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
        builder = builder.add(Attributes.MAX_HEALTH, 15);
        builder = builder.add(Attributes.ARMOR, 0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 1);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, 2);
        return builder;
    }

    @Override
    public void tick() {
        if(level().isClientSide()) {
            this.idleAnimationState.animateWhen(!isInWaterOrBubble() && !this.walkAnimation.isMoving(), this.tickCount);
        }

        super.tick();
    }

    public static boolean canSpawn(EntityType<Crocodile> entityType, LevelAccessor level, MobSpawnType spawnType, BlockPos position, RandomSource random) {
        return Monster.checkMonsterSpawnRules(entityType, (ServerLevelAccessor) level, spawnType, position, random);
    }


}
