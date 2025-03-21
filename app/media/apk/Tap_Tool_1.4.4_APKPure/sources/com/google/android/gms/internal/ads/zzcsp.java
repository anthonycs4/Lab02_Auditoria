package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcsp<AdT> implements zzcsq<AdT> {
    private final Map<String, zzdya<AdT>> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsp(Map<String, zzdya<AdT>> map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcsq
    public final zzdya<AdT> zza(int i, String str) {
        return this.zza.get(str);
    }
}
