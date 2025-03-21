package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcvk implements zzcxt, zzcxa {
    private final Context zza;
    private final zzess zzb;
    private final zzbvr zzc;

    public zzcvk(Context context, zzess zzessVar, zzbvr zzbvrVar, byte[] bArr) {
        this.zza = context;
        this.zzb = zzessVar;
        this.zzc = zzbvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzb(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzbA(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzbN() {
        zzbvs zzbvsVar = this.zzb.zzX;
        if (zzbvsVar == null || !zzbvsVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zzb.zzX.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zzb.zzX.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzbx(Context context) {
    }
}
