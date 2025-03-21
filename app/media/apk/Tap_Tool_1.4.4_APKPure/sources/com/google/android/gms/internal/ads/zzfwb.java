package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfwb extends ThreadLocal<Mac> {
    final /* synthetic */ zzfwc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwb(zzfwc zzfwcVar) {
        this.zza = zzfwcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzfvo<zzfvt, Mac> zzfvoVar = zzfvo.zzb;
            str = this.zza.zzb;
            Mac zza = zzfvoVar.zza(str);
            key = this.zza.zzc;
            zza.init(key);
            return zza;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
