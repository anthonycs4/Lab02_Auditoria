package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzbkx implements zzfei {
    static final zzfei zza = new zzbkx();

    private zzbkx() {
    }

    @Override // com.google.android.gms.internal.ads.zzfei
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        zzblp<zzcib> zzblpVar = zzblo.zza;
        if (zzbhc.zzj.zze().booleanValue()) {
            com.google.android.gms.ads.internal.zzs.zzg().zzg(th, "prepareClickUrl.attestation1");
            return "failure_click_attok";
        }
        return "failure_click_attok";
    }
}
