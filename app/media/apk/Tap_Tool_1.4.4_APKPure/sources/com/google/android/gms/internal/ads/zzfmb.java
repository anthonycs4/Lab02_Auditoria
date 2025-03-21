package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzu;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfmb<KeyFormatProtoT extends zzfzu, KeyProtoT extends zzfzu> {
    final zzfmd<KeyFormatProtoT, KeyProtoT> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmb(zzfmd<KeyFormatProtoT, KeyProtoT> zzfmdVar) {
        this.zza = zzfmdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final KeyProtoT zza(zzfxj zzfxjVar) throws GeneralSecurityException, zzfyy {
        KeyFormatProtoT zzc = this.zza.zzc(zzfxjVar);
        this.zza.zzb(zzc);
        return this.zza.zzd(zzc);
    }
}
