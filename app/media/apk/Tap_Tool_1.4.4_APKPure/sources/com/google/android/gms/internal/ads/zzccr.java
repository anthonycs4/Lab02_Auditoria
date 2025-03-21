package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzccr {
    public static <T> T zza(Context context, String str, zzccp<IBinder, T> zzccpVar) throws zzccq {
        try {
            return zzccpVar.zza(zzc(context).instantiate(str));
        } catch (Exception e) {
            throw new zzccq(e);
        }
    }

    public static Context zzb(Context context) throws zzccq {
        return zzc(context).getModuleContext();
    }

    private static DynamiteModule zzc(Context context) throws zzccq {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzccq(e);
        }
    }
}
