package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzate implements ValueCallback<String> {
    final /* synthetic */ zzatf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzate(zzatf zzatfVar) {
        this.zza = zzatfVar;
    }

    @Override // android.webkit.ValueCallback
    /* renamed from: zza */
    public final void onReceiveValue(String str) {
        zzatf zzatfVar = this.zza;
        zzatfVar.zze.zzd(zzatfVar.zzb, zzatfVar.zzc, str, zzatfVar.zzd);
    }
}
