package com.google.android.gms.ads.search;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.ads.zzbdp;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzc {
    private final zzbdp zza = new zzbdp();
    private String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zze(zzc zzcVar) {
        return zzcVar.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzbdp zzf(zzc zzcVar) {
        return zzcVar.zza;
    }

    public final zzc zza(NetworkExtras networkExtras) {
        this.zza.zzb(networkExtras);
        return this;
    }

    public final zzc zzb(Class<? extends MediationAdapter> cls, Bundle bundle) {
        this.zza.zzc(cls, bundle);
        return this;
    }

    public final zzc zzc(Class<? extends CustomEvent> cls, Bundle bundle) {
        this.zza.zzd(cls, bundle);
        return this;
    }

    public final zzc zzd(String str) {
        this.zzb = str;
        return this;
    }
}
