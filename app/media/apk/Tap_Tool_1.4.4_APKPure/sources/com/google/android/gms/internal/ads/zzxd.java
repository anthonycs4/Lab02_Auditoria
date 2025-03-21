package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzxd implements zzxm {
    static final zzxm zza = new zzxd();

    private zzxd() {
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final int zza(Object obj) {
        int i = zzxn.zza;
        String str = ((zzwx) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (zzaht.zza >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
