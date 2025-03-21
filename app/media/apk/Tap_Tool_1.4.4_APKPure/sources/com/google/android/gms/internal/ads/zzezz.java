package com.google.android.gms.internal.ads;

import android.webkit.WebView;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzezz implements Runnable {
    final /* synthetic */ zzfaa zza;
    private final WebView zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzezz(zzfaa zzfaaVar) {
        WebView webView;
        this.zza = zzfaaVar;
        webView = zzfaaVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
