package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzexb implements zzfko {
    final /* synthetic */ zzewr zza;
    final /* synthetic */ zzexc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzexb(zzexc zzexcVar, zzewr zzewrVar) {
        this.zzb = zzexcVar;
        this.zza = zzewrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        zzexe zzexeVar;
        zzexeVar = this.zzb.zza.zzd;
        zzexeVar.zzc(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzb(Object obj) {
        zzexe zzexeVar;
        zzexeVar = this.zzb.zza.zzd;
        zzexeVar.zzd(this.zza);
    }
}
