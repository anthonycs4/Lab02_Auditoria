package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzccm;
import java.util.Collections;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbk extends com.google.android.gms.internal.ads.zzbh {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzccm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbk(zzbp zzbpVar, int i, String str, com.google.android.gms.internal.ads.zzah zzahVar, com.google.android.gms.internal.ads.zzag zzagVar, byte[] bArr, Map map, zzccm zzccmVar) {
        super(i, str, zzahVar, zzagVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzccmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzac
    public final Map<String, String> zzm() throws com.google.android.gms.internal.ads.zzk {
        Map<String, String> map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzac
    public final byte[] zzn() throws com.google.android.gms.internal.ads.zzk {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbh, com.google.android.gms.internal.ads.zzac
    public final /* bridge */ /* synthetic */ void zzs(String str) {
        zzs(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzz(String str) {
        this.zzc.zze(str);
        super.zzs(str);
    }
}
