package org.adlin.hitboxesmod.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import org.adlin.hitboxesmod.config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.awt.*;

@Mixin(InGameHud.class)
public class IngameRenderMixin {
//    @Inject(at = @At(value = "RETURN"), method = "render", cancellable = true)
//    public void render(DrawContext context, float tickDelta, CallbackInfo ci) {
//        if (!config.isPanic()) {
//            context.drawText(MinecraftClient.getInstance().textRenderer ,"Hitbox enable", 10, 10, new Color(0xFA63FF).getRGB() , true);
//        }
//    }
}
