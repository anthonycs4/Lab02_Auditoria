package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbks;
import com.google.android.gms.internal.ads.zzbun;
import com.google.android.gms.internal.ads.zzbvn;
import com.google.android.gms.internal.ads.zzcct;
import com.google.android.gms.internal.ads.zzcib;
import com.google.android.gms.internal.ads.zzcin;
import com.google.android.gms.internal.ads.zzcjn;
import com.google.android.gms.internal.ads.zzcjp;
import com.google.android.gms.internal.ads.zzcjr;
import com.google.android.gms.internal.ads.zzdxw;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzl extends zzbvn implements zzz {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcib zzd;
    zzi zze;
    zzq zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzh zzl;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    private final void zzG(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || (zzjVar2 = adOverlayInfoParcel2.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zzo = com.google.android.gms.ads.internal.zzs.zze().zzo(this.zzb, configuration);
        if ((this.zzk && !z3) || zzo) {
            z = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzg) {
            z2 = true;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzaL)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            window.getDecorView().setSystemUiVisibility(z ? z2 ? 5894 : 5380 : 256);
        } else if (z) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (Build.VERSION.SDK_INT < 19 || !z2) {
                return;
            }
            window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }

    private static final void zzH(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzs.zzr().zzj(iObjectWrapper, view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzA() {
        zzcib zzcibVar;
        zzo zzoVar;
        if (this.zzt) {
            return;
        }
        this.zzt = true;
        zzcib zzcibVar2 = this.zzd;
        if (zzcibVar2 != null) {
            this.zzl.removeView(zzcibVar2.zzH());
            zzi zziVar = this.zze;
            if (zziVar != null) {
                this.zzd.zzai(zziVar.zzd);
                this.zzd.zzag(false);
                ViewGroup viewGroup = this.zze.zzc;
                View zzH = this.zzd.zzH();
                zzi zziVar2 = this.zze;
                viewGroup.addView(zzH, zziVar2.zza, zziVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzai(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbD(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcibVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzH(zzcibVar.zzV(), this.zzc.zzd.zzH());
    }

    public final void zzB() {
        if (this.zzm) {
            this.zzm = false;
            zzC();
        }
    }

    protected final void zzC() {
        this.zzd.zzK();
    }

    public final void zzD() {
        this.zzl.zzb = true;
    }

    public final void zzE() {
        synchronized (this.zzo) {
            this.zzq = true;
            if (this.zzp != null) {
                com.google.android.gms.ads.internal.util.zzr.zza.removeCallbacks(this.zzp);
                com.google.android.gms.ads.internal.util.zzr.zza.post(this.zzp);
            }
        }
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.zzb.overridePendingTransition(0, 0);
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzw(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final void zzd() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zze() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzf() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zzbB();
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final boolean zzg() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfU)).booleanValue() || !this.zzd.canGoBack()) {
            boolean zzZ = this.zzd.zzZ();
            if (!zzZ) {
                this.zzd.zze("onbackblocked", Collections.emptyMap());
            }
            return zzZ;
        }
        this.zzd.goBack();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[Catch: zzg -> 0x00e3, TryCatch #0 {zzg -> 0x00e3, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0077, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:41:0x0088, B:42:0x008b, B:49:0x00ba, B:51:0x00be, B:52:0x00c5, B:53:0x00c6, B:55:0x00ca, B:57:0x00d7, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:59:0x00db, B:60:0x00e2), top: B:64:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7 A[Catch: zzg -> 0x00e3, TryCatch #0 {zzg -> 0x00e3, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0077, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:41:0x0088, B:42:0x008b, B:49:0x00ba, B:51:0x00be, B:52:0x00c5, B:53:0x00c6, B:55:0x00ca, B:57:0x00d7, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:59:0x00db, B:60:0x00e2), top: B:64:0x0017 }] */
    @Override // com.google.android.gms.internal.ads.zzbvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzh(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzh(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzj() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdb)).booleanValue()) {
            zzcib zzcibVar = this.zzd;
            if (zzcibVar == null || zzcibVar.zzX()) {
                com.google.android.gms.ads.internal.util.zze.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzk() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbT();
        }
        zzG(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdb)).booleanValue()) {
            return;
        }
        zzcib zzcibVar = this.zzd;
        if (zzcibVar == null || zzcibVar.zzX()) {
            com.google.android.gms.ads.internal.util.zze.zzi("The webview does not exist. Ignoring action.");
        } else {
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzl() {
        zzo zzoVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbC();
        }
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzdb)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzm(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzn(IObjectWrapper iObjectWrapper) {
        zzG((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzp() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdb)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzq() {
        zzcib zzcibVar = this.zzd;
        if (zzcibVar != null) {
            try {
                this.zzl.removeView(zzcibVar.zzH());
            } catch (NullPointerException unused) {
            }
        }
        zzz();
    }

    public final void zzr(boolean z) {
        int intValue = ((Integer) zzbba.zzc().zzb(zzbfq.zzdd)).intValue();
        zzp zzpVar = new zzp();
        zzpVar.zzd = 50;
        zzpVar.zza = true != z ? 0 : intValue;
        zzpVar.zzb = true != z ? intValue : 0;
        zzpVar.zzc = intValue;
        this.zzf = new zzq(this.zzb, zzpVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z ? 9 : 11);
        zzt(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzs() {
        this.zzr = true;
    }

    public final void zzt(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzbba.zzc().zzb(zzbfq.zzaJ)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) zzbba.zzc().zzb(zzbfq.zzaK)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbun(this.zzd, "useCustomClose").zzf("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzq zzqVar = this.zzf;
        if (zzqVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzqVar.zza(z3);
        }
    }

    public final void zzu(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    public final void zzv() {
        this.zzl.removeView(this.zzf);
        zzr(true);
    }

    public final void zzw(int i) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzbba.zzc().zzb(zzbfq.zzeg)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzbba.zzc().zzb(zzbfq.zzeh)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzbba.zzc().zzb(zzbfq.zzei)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzbba.zzc().zzb(zzbfq.zzej)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzs.zzg().zzh(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzx(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    protected final void zzy(boolean z) throws zzg {
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window == null) {
            throw new zzg("Invalid activity, no window available.");
        }
        zzcib zzcibVar = this.zzc.zzd;
        zzcjp zzR = zzcibVar != null ? zzcibVar.zzR() : null;
        boolean z2 = zzR != null && zzR.zzc();
        this.zzm = false;
        if (z2) {
            int i = this.zzc.zzj;
            if (i == 6) {
                r4 = this.zzb.getResources().getConfiguration().orientation == 1;
                this.zzm = r4;
            } else if (i == 7) {
                r4 = this.zzb.getResources().getConfiguration().orientation == 2;
                this.zzm = r4;
            }
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(r4);
        com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        zzw(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.zze.zzd("Hardware acceleration on the AdActivity window enabled.");
        if (!this.zzk) {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        } else {
            this.zzl.setBackgroundColor(zza);
        }
        this.zzb.setContentView(this.zzl);
        this.zzr = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzs.zzd();
                Activity activity = this.zzb;
                zzcib zzcibVar2 = this.zzc.zzd;
                zzcjr zzP = zzcibVar2 != null ? zzcibVar2.zzP() : null;
                zzcib zzcibVar3 = this.zzc.zzd;
                String zzQ = zzcibVar3 != null ? zzcibVar3.zzQ() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                zzcct zzcctVar = adOverlayInfoParcel.zzm;
                zzcib zzcibVar4 = adOverlayInfoParcel.zzd;
                zzcib zza2 = zzcin.zza(activity, zzP, zzQ, true, z2, null, null, zzcctVar, null, null, zzcibVar4 != null ? zzcibVar4.zzk() : null, zzavg.zza(), null, null);
                this.zzd = zza2;
                zzcjp zzR2 = zza2.zzR();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                zzbkq zzbkqVar = adOverlayInfoParcel2.zzp;
                zzbks zzbksVar = adOverlayInfoParcel2.zze;
                zzv zzvVar = adOverlayInfoParcel2.zzi;
                zzcib zzcibVar5 = adOverlayInfoParcel2.zzd;
                zzR2.zzM(null, zzbkqVar, null, zzbksVar, zzvVar, true, null, zzcibVar5 != null ? zzcibVar5.zzR().zzb() : null, null, null, null, null, null, null, null);
                this.zzd.zzR().zzw(new zzcjn(this) { // from class: com.google.android.gms.ads.internal.overlay.zzd
                    private final zzl zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // com.google.android.gms.internal.ads.zzcjn
                    public final void zza(boolean z3) {
                        zzcib zzcibVar6 = this.zza.zzd;
                        if (zzcibVar6 != null) {
                            zzcibVar6.zzK();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.zzd.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 != null) {
                        this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", "UTF-8", null);
                    } else {
                        throw new zzg("No URL or HTML to display in ad overlay.");
                    }
                }
                zzcib zzcibVar6 = this.zzc.zzd;
                if (zzcibVar6 != null) {
                    zzcibVar6.zzam(this);
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Error obtaining webview.", e);
                throw new zzg("Could not obtain webview for the overlay.");
            }
        } else {
            zzcib zzcibVar7 = this.zzc.zzd;
            this.zzd = zzcibVar7;
            zzcibVar7.zzai(this.zzb);
        }
        this.zzd.zzae(this);
        zzcib zzcibVar8 = this.zzc.zzd;
        if (zzcibVar8 != null) {
            zzH(zzcibVar8.zzV(), this.zzl);
        }
        if (this.zzc.zzk != 5) {
            ViewParent parent = this.zzd.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzd.zzH());
            }
            if (this.zzk) {
                this.zzd.zzas();
            }
            this.zzl.addView(this.zzd.zzH(), -1, -1);
        }
        if (!z && !this.zzm) {
            zzC();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
        if (adOverlayInfoParcel4.zzk != 5) {
            zzr(z2);
            if (this.zzd.zzT()) {
                zzt(z2, true);
                return;
            }
            return;
        }
        zzdxw.zzc(this.zzb, this, adOverlayInfoParcel4.zzu, adOverlayInfoParcel4.zzr, adOverlayInfoParcel4.zzs, adOverlayInfoParcel4.zzt, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzv);
    }

    protected final void zzz() {
        if (!this.zzb.isFinishing() || this.zzs) {
            return;
        }
        this.zzs = true;
        zzcib zzcibVar = this.zzd;
        if (zzcibVar != null) {
            int i = this.zzn;
            if (i != 0) {
                zzcibVar.zzJ(i - 1);
                synchronized (this.zzo) {
                    if (!this.zzq && this.zzd.zzaa()) {
                        this.zzp = new Runnable(this) { // from class: com.google.android.gms.ads.internal.overlay.zze
                            private final zzl zza;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zza = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzA();
                            }
                        };
                        com.google.android.gms.ads.internal.util.zzr.zza.postDelayed(this.zzp, ((Long) zzbba.zzc().zzb(zzbfq.zzaI)).longValue());
                        return;
                    }
                }
            } else {
                throw null;
            }
        }
        zzA();
    }
}
