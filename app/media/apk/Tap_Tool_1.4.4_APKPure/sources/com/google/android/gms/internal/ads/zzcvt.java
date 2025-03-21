package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcvt {
    private final Context zza;
    private final zzetk zzb;
    private final Bundle zzc;
    private final zzetf zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcvt(zzcvs zzcvsVar, zzcvr zzcvrVar) {
        this.zza = zzcvs.zzf(zzcvsVar);
        this.zzb = zzcvs.zzg(zzcvsVar);
        this.zzc = zzcvs.zzh(zzcvsVar);
        this.zzd = zzcvs.zzi(zzcvsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcvs zza() {
        zzcvs zzcvsVar = new zzcvs();
        zzcvsVar.zza(this.zza);
        zzcvsVar.zzb(this.zzb);
        zzcvsVar.zzc(this.zzc);
        return zzcvsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzetk zzb() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzetf zzc() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle zzd() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zze(Context context) {
        return this.zza;
    }
}
