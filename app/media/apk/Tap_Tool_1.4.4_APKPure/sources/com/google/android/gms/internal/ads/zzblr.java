package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzblr implements zzblp<zzcib> {
    private final zzbls zza;

    public zzblr(zzbls zzblsVar, byte[] bArr) {
        this.zza = zzblsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzcib zzcibVar, Map map) {
        zzcib zzcibVar2 = zzcibVar;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Fail to parse float", e);
        }
        this.zza.zza(equals);
        this.zza.zzb(equals2, f);
        zzcibVar2.zzaD(equals);
    }
}
