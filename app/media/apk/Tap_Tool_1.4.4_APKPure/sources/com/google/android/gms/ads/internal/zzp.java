package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzfb;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzp extends AsyncTask<Void, Void, String> {
    final /* synthetic */ zzr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzp(zzr zzrVar, zzm zzmVar) {
        this.zza = zzrVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        WebView webView;
        WebView webView2;
        String str2 = str;
        webView = this.zza.zzf;
        if (webView == null || str2 == null) {
            return;
        }
        webView2 = this.zza.zzf;
        webView2.loadUrl(str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        Future future;
        try {
            zzr zzrVar = this.zza;
            future = zzrVar.zzc;
            zzrVar.zzh = (zzfb) future.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            zzccn.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        } catch (ExecutionException e2) {
            e = e2;
            zzccn.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        } catch (TimeoutException e3) {
            zzccn.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e3);
        }
        return this.zza.zzM();
    }
}
