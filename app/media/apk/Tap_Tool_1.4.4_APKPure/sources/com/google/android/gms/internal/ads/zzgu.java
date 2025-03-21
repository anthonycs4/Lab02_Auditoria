package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgu extends zzhg {
    public zzgu(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2) {
        super(zzfyVar, "z/Tn7JC6F4F+FkxUewfYz6OrIXZqnQo4XmAO6JXjjTzqzXvsXM/GDvmB3nhnuEAY", "o84OYee2NEh7lM/t6/LVSxy5Aa2CqVjhBA8rs1be3iY=", zzcnVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzff zzffVar = new zzff((String) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(((Boolean) zzbba.zzc().zzb(zzbfq.zzbG)).booleanValue())));
        synchronized (this.zze) {
            this.zze.zzc(zzffVar.zza);
            this.zze.zzQ(zzffVar.zzb);
        }
    }
}
