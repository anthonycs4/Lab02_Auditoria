package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbxl implements Callable<zzbxk> {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbxn zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxl(zzbxn zzbxnVar, Context context) {
        this.zzb = zzbxnVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ zzbxk call() throws Exception {
        WeakHashMap weakHashMap;
        zzbxk zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzbxm zzbxmVar = (zzbxm) weakHashMap.get(this.zza);
        if (zzbxmVar == null || zzbxmVar.zza + zzbgv.zza.zze().longValue() < com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis()) {
            zza = new zzbxj(this.zza).zza();
        } else {
            zza = new zzbxj(this.zza, zzbxmVar.zzb).zza();
        }
        weakHashMap2 = this.zzb.zza;
        weakHashMap2.put(this.zza, new zzbxm(this.zzb, zza));
        return zza;
    }
}
