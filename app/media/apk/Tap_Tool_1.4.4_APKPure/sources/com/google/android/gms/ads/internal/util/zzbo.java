package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzccm;
import com.google.android.gms.internal.ads.zzcde;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbo extends com.google.android.gms.internal.ads.zzac<com.google.android.gms.internal.ads.zzy> {
    private final zzcde<com.google.android.gms.internal.ads.zzy> zza;
    private final zzccm zzb;

    public zzbo(String str, Map<String, String> map, zzcde<com.google.android.gms.internal.ads.zzy> zzcdeVar) {
        super(0, str, new zzbn(zzcdeVar));
        this.zza = zzcdeVar;
        zzccm zzccmVar = new zzccm(null);
        this.zzb = zzccmVar;
        zzccmVar.zzb(str, "GET", null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzac
    public final com.google.android.gms.internal.ads.zzai<com.google.android.gms.internal.ads.zzy> zzr(com.google.android.gms.internal.ads.zzy zzyVar) {
        return com.google.android.gms.internal.ads.zzai.zza(zzyVar, com.google.android.gms.internal.ads.zzaz.zza(zzyVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzac
    public final /* bridge */ /* synthetic */ void zzs(com.google.android.gms.internal.ads.zzy zzyVar) {
        com.google.android.gms.internal.ads.zzy zzyVar2 = zzyVar;
        this.zzb.zzd(zzyVar2.zzc, zzyVar2.zza);
        zzccm zzccmVar = this.zzb;
        byte[] bArr = zzyVar2.zzb;
        if (zzccm.zzj() && bArr != null) {
            zzccmVar.zzf(bArr);
        }
        this.zza.zzc(zzyVar2);
    }
}
