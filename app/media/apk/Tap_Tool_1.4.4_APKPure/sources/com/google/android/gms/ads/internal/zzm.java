package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzeuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzm extends WebViewClient {
    final /* synthetic */ zzr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(zzr zzrVar) {
        this.zza = zzrVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzbbh zzbbhVar;
        zzbbh zzbbhVar2;
        zzbbh zzbbhVar3;
        zzbbh zzbbhVar4;
        zzbbhVar = this.zza.zzg;
        if (zzbbhVar != null) {
            try {
                zzbbhVar2 = this.zza.zzg;
                zzbbhVar2.zzd(zzeuf.zzd(1, null, null));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
            }
        }
        zzbbhVar3 = this.zza.zzg;
        if (zzbbhVar3 != null) {
            try {
                zzbbhVar4 = this.zza.zzg;
                zzbbhVar4.zzc(0);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzbbh zzbbhVar;
        zzbbh zzbbhVar2;
        zzbbh zzbbhVar3;
        zzbbh zzbbhVar4;
        zzbbh zzbbhVar5;
        zzbbh zzbbhVar6;
        zzbbh zzbbhVar7;
        zzbbh zzbbhVar8;
        zzbbh zzbbhVar9;
        zzbbh zzbbhVar10;
        zzbbh zzbbhVar11;
        zzbbh zzbbhVar12;
        if (str.startsWith(this.zza.zzN())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzbbhVar9 = this.zza.zzg;
            if (zzbbhVar9 != null) {
                try {
                    zzbbhVar10 = this.zza.zzg;
                    zzbbhVar10.zzd(zzeuf.zzd(3, null, null));
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
                }
            }
            zzbbhVar11 = this.zza.zzg;
            if (zzbbhVar11 != null) {
                try {
                    zzbbhVar12 = this.zza.zzg;
                    zzbbhVar12.zzc(3);
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e2);
                }
            }
            this.zza.zzL(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzbbhVar5 = this.zza.zzg;
            if (zzbbhVar5 != null) {
                try {
                    zzbbhVar6 = this.zza.zzg;
                    zzbbhVar6.zzd(zzeuf.zzd(1, null, null));
                } catch (RemoteException e3) {
                    com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e3);
                }
            }
            zzbbhVar7 = this.zza.zzg;
            if (zzbbhVar7 != null) {
                try {
                    zzbbhVar8 = this.zza.zzg;
                    zzbbhVar8.zzc(0);
                } catch (RemoteException e4) {
                    com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e4);
                }
            }
            this.zza.zzL(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            zzbbhVar3 = this.zza.zzg;
            if (zzbbhVar3 != null) {
                try {
                    zzbbhVar4 = this.zza.zzg;
                    zzbbhVar4.zzf();
                } catch (RemoteException e5) {
                    com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e5);
                }
            }
            this.zza.zzL(this.zza.zzK(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            zzbbhVar = this.zza.zzg;
            if (zzbbhVar != null) {
                try {
                    zzbbhVar2 = this.zza.zzg;
                    zzbbhVar2.zze();
                } catch (RemoteException e6) {
                    com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e6);
                }
            }
            zzr.zzU(this.zza, zzr.zzT(this.zza, str));
            return true;
        }
    }
}
