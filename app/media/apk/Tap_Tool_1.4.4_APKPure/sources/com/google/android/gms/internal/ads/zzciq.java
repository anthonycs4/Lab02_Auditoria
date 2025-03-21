package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzciq extends FrameLayout implements zzcib {
    private final zzcib zza;
    private final zzcej zzb;
    private final AtomicBoolean zzc;

    public zzciq(zzcib zzcibVar) {
        super(zzcibVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcibVar;
        this.zzb = new zzcej(zzcibVar.zzM(), this, this);
        addView((View) zzcibVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void destroy() {
        final IObjectWrapper zzV = zzV();
        if (zzV != null) {
            com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(zzV) { // from class: com.google.android.gms.internal.ads.zzcio
                private final IObjectWrapper zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzV;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzs.zzr().zzi(this.zza);
                }
            });
            zzfdx zzfdxVar = com.google.android.gms.ads.internal.util.zzr.zza;
            zzcib zzcibVar = this.zza;
            zzcibVar.getClass();
            zzfdxVar.postDelayed(zzcip.zza(zzcibVar), ((Integer) zzbba.zzc().zzb(zzbfq.zzdl)).intValue());
            return;
        }
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void onAdClicked() {
        zzcib zzcibVar = this.zza;
        if (zzcibVar != null) {
            zzcibVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void onPause() {
        this.zzb.zzd();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcib
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcib
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final void zzA() {
        this.zza.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final void zzB(int i) {
        this.zza.zzB(i);
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final void zzC(int i) {
        this.zza.zzC(i);
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final int zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final int zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzchs
    public final zzess zzF() {
        return this.zza.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzcjm
    public final View zzH() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzI() {
        this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzJ(int i) {
        this.zza.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzK() {
        this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzL() {
        zzcib zzcibVar = this.zza;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzs.zzh().zzd()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzs.zzh().zzb()));
        zzciu zzciuVar = (zzciu) zzcibVar;
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzad.zze(zzciuVar.getContext())));
        zzciuVar.zze("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final Context zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final com.google.android.gms.ads.internal.overlay.zzl zzN() {
        return this.zza.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final com.google.android.gms.ads.internal.overlay.zzl zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzcjj
    public final zzcjr zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final String zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final zzcjp zzR() {
        return ((zzciu) this.zza).zzaQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final WebViewClient zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final boolean zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzcjk
    public final zzfb zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final IObjectWrapper zzV() {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final boolean zzW() {
        return this.zza.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final boolean zzX() {
        return this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzY() {
        this.zzb.zze();
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final boolean zzZ() {
        return this.zza.zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zza(String str) {
        ((zzciu) this.zza).zzaN(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final boolean zzaA() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzciy
    public final zzesv zzaB() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzaC(zzess zzessVar, zzesv zzesvVar) {
        this.zza.zzaC(zzessVar, zzesvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzaD(boolean z) {
        this.zza.zzaD(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final zzfla<String> zzaE() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzaF(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zza.zzaF(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzaG(boolean z, int i) {
        this.zza.zzaG(z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzaH(boolean z, int i, String str) {
        this.zza.zzaH(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzaI(boolean z, int i, String str, String str2) {
        this.zza.zzaI(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzaJ(com.google.android.gms.ads.internal.util.zzbs zzbsVar, zzdxo zzdxoVar, zzdpn zzdpnVar, zzexv zzexvVar, String str, String str2, int i) {
        this.zza.zzaJ(zzbsVar, zzdxoVar, zzdpnVar, zzexvVar, str, str2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final boolean zzaa() {
        return this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzab(String str, zzblp<? super zzcib> zzblpVar) {
        this.zza.zzab(str, zzblpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzac(String str, zzblp<? super zzcib> zzblpVar) {
        this.zza.zzac(str, zzblpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzad(String str, Predicate<zzblp<? super zzcib>> predicate) {
        this.zza.zzad(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzae(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzae(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzaf(zzcjr zzcjrVar) {
        this.zza.zzaf(zzcjrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzag(boolean z) {
        this.zza.zzag(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzah() {
        this.zza.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzai(Context context) {
        this.zza.zzai(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzaj(boolean z) {
        this.zza.zzaj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzak(IObjectWrapper iObjectWrapper) {
        this.zza.zzak(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzal(int i) {
        this.zza.zzal(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzam(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzam(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzan(boolean z) {
        this.zza.zzan(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzao() {
        this.zza.zzao();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzap(zzbhw zzbhwVar) {
        this.zza.zzap(zzbhwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final zzbhw zzaq() {
        return this.zza.zzaq();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzar(boolean z) {
        this.zza.zzar(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzas() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzat(String str, String str2, String str3) {
        this.zza.zzat(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzau() {
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzs.zzc();
        textView.setText(com.google.android.gms.ads.internal.util.zzr.zzC());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzav(boolean z) {
        this.zza.zzav(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzaw(zzbht zzbhtVar) {
        this.zza.zzaw(zzbhtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzax(zzatv zzatvVar) {
        this.zza.zzax(zzatvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final zzatv zzay() {
        return this.zza.zzay();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final boolean zzaz(boolean z, int i) {
        if (this.zzc.compareAndSet(false, true)) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzax)).booleanValue()) {
                return false;
            }
            if (this.zza.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
            }
            this.zza.zzaz(z, i);
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbv() {
        this.zza.zzbv();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbw() {
        this.zza.zzbw();
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzc(zzash zzashVar) {
        this.zza.zzc(zzashVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzd(String str, JSONObject jSONObject) {
        this.zza.zzd(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zze(String str, Map<String, ?> map) {
        this.zza.zze(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final zzcej zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final void zzg(boolean z) {
        this.zza.zzg(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzceu
    public final zzcix zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final zzbgc zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzcjd, com.google.android.gms.internal.ads.zzceu
    public final Activity zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzceu
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final void zzl() {
        this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final String zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final String zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final void zzo(int i) {
        this.zza.zzo(i);
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final int zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzceu
    public final zzbgd zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzr(String str, JSONObject jSONObject) {
        ((zzciu) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final zzcgs zzs(String str) {
        return this.zza.zzs(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzceu
    public final zzcct zzt() {
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzceu
    public final void zzu(String str, zzcgs zzcgsVar) {
        this.zza.zzu(str, zzcgsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final void zzv(boolean z, long j) {
        this.zza.zzv(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final void zzw(int i) {
        this.zzb.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzceu
    public final void zzx(zzcix zzcixVar) {
        this.zza.zzx(zzcixVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final int zzy() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzch)).booleanValue()) {
            return this.zza.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final int zzz() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzch)).booleanValue()) {
            return this.zza.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }
}
