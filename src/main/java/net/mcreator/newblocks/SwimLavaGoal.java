package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import net.minecraft.entity.MobEntity;
import net.minecraft.tags.FluidTags;
import net.minecraft.fluid.LavaFluid;

public class SwimLavaGoal extends Goal {
   private final MobEntity entity;

   public SwimLavaGoal(MobEntity entityIn) {
      this.entity = entityIn;
      this.setMutexFlags(EnumSet.of(Goal.Flag.JUMP));
      entityIn.getNavigator().setCanSwim(true);
   }


   public boolean shouldExecute() {
      return this.entity.isInLava() && this.entity.func_233571_b_(FluidTags.LAVA) > this.entity.func_233579_cu_() || this.entity.isInLava();
   }


   public void tick() {
      if (this.entity.getRNG().nextFloat() < 0.1F) {
         this.entity.getJumpController().setJumping();
      }

   }
}
