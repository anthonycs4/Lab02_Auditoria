package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcis implements zzblp<zzcib> {
    final /* synthetic */ zzciu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcis(zzciu zzciuVar) {
        this.zza = zzciuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzcib zzcibVar, Map map) {
        int i;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zza) {
                    i = this.zza.zzG;
                    if (i != parseInt) {
                        this.zza.zzG = parseInt;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Exception occurred while getting webview content height", e);
            }
        }
    }
}
