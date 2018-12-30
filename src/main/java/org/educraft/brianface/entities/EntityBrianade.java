package org.educraft.brianface.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.*;

public class EntityBrianade extends EntityThrowable
{
    private EntityLivingBase throwerIn;
    private int throwerId;


    public EntityBrianade(World worldIn)
    {

        super(worldIn);
    }

    public EntityBrianade(World worldIn, EntityLivingBase throwerIn)
    {

        super(worldIn, throwerIn);
    }

    public EntityBrianade(World worldIn, double x, double y, double z)
    {

        super(worldIn, x, y, z);
    }

    public static void registerFixesBrianade(DataFixer fixer)
    {
        EntityThrowable.registerFixesThrowable(fixer, "brianade");
    }

    @SideOnly(Side.CLIENT)
    public void handleStatusUpdate(byte id)
    {
        if (id == 3)
        {
            for (int i = 0; i < 8; ++i)
            {
                this.world.spawnParticle(EnumParticleTypes.EXPLOSION_HUGE, this.posX, this.posY, this.posZ, 1.0D, 1.0D, 1.0D, new int[0]);
            }
        }
    }

    @Override
    protected float getGravityVelocity()
    {
        return 0.06F;
    }

    protected void onImpact(RayTraceResult result)
    {

        if (!this.world.isRemote)
        {
            world.createExplosion(result.entityHit, result.hitVec.x, result.hitVec.y, result.hitVec.z, 10f, true);
        }

        this.setDead();

    }

}
