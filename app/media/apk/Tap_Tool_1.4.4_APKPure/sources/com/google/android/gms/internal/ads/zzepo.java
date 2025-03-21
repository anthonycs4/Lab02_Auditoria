package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcsn;
import com.google.android.gms.internal.ads.zzcvq;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzepo<R extends zzcvq<AdT>, AdT extends zzcsn> implements zzevp<AdT> {
    private final zzeqj<R, zzeve<AdT>> zza;

    public zzepo(zzeqj<R, zzeve<AdT>> zzeqjVar) {
        this.zza = zzeqjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzevp
    public final zzfla<zzeve<AdT>> zza(zzevq zzevqVar) {
        zzepp zzeppVar = (zzepp) zzevqVar;
        return this.zza.zzb(zzeppVar.zzb, zzeppVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzevp
    public final void zzb(zzeve<AdT> zzeveVar) {
        zzeveVar.zza = ((zzepk) this.zza).zza().zzc();
    }
}
