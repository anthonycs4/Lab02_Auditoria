package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdsz implements zzgdq<zzfla<String>> {
    private final zzgeb<zzexl> zza;
    private final zzgeb<Context> zzb;

    public zzdsz(zzgeb<zzexl> zzgebVar, zzgeb<Context> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        final CookieManager zzk = com.google.android.gms.ads.internal.zzs.zze().zzk(this.zzb.zzb());
        zzexf zzexfVar = zzexf.WEBVIEW_COOKIE;
        return zzeww.zzb(new Callable(zzk) { // from class: com.google.android.gms.internal.ads.zzdsv
            private final CookieManager zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzk;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = this.zza;
                if (cookieManager == null) {
                    return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                return cookieManager.getCookie((String) zzbba.zzc().zzb(zzbfq.zzaz));
            }
        }, zzexfVar, this.zza.zzb()).zzh(1L, TimeUnit.SECONDS).zzf(Exception.class, zzdsw.zza).zzi();
    }
}
