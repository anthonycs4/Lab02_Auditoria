package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcsu {
    public final List<? extends zzfla<? extends zzcsn>> zza;

    public zzcsu(zzcsn zzcsnVar) {
        this.zza = Collections.singletonList(zzfks.zza(zzcsnVar));
    }

    public zzcsu(List<? extends zzfla<? extends zzcsn>> list) {
        this.zza = list;
    }

    public static zzdya<zzcsu> zza(zzeap<? extends zzcsn> zzeapVar) {
        return new zzdyb(zzeapVar, zzcss.zza);
    }

    public static zzdya<zzcsu> zzb(zzdya<? extends zzcsn> zzdyaVar) {
        return new zzdyb(zzdyaVar, zzcst.zza);
    }
}
