package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgi extends zzhg {
    private static final zzhh<String> zzi = new zzhh<>();
    private final Context zzj;

    public zzgi(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2, Context context) {
        super(zzfyVar, "yPgicEGzwf3pLaq/3P+u7LLtd+dkw8DYS9ofUgpVqMp2QWe7dGdxtv2HaEVDUnS9", "u860xWUndVipWEY9XVs+6Wwt96gWjvwTExZKaE1+WsQ=", zzcnVar, i, 29);
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzp("E");
        AtomicReference<String> zza = zzi.zza(this.zzj.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                if (zza.get() == null) {
                    zza.set((String) this.zzf.invoke(null, this.zzj));
                }
            }
        }
        String str = zza.get();
        synchronized (this.zze) {
            this.zze.zzp(zzdx.zza(str.getBytes(), true));
        }
    }
}
