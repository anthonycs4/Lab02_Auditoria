package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgo implements Callable {
    private final zzfy zza;
    private final zzcn zzb;

    public zzgo(zzfy zzfyVar, zzcn zzcnVar) {
        this.zza = zzfyVar;
        this.zzb = zzcnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzn() != null) {
            this.zza.zzn().get();
        }
        zzdc zzm = this.zza.zzm();
        if (zzm != null) {
            try {
                synchronized (this.zzb) {
                    zzcn zzcnVar = this.zzb;
                    byte[] zzao = zzm.zzao();
                    zzcnVar.zzaj(zzao, 0, zzao.length, zzfxy.zza());
                }
                return null;
            } catch (zzfyy | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
