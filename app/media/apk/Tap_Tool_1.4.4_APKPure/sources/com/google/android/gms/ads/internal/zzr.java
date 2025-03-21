package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaue;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzazx;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbe;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbbt;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbcb;
import com.google.android.gms.internal.ads.zzbcf;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzbdn;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbgl;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzbvy;
import com.google.android.gms.internal.ads.zzbyb;
import com.google.android.gms.internal.ads.zzccg;
import com.google.android.gms.internal.ads.zzcct;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzfc;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzr extends zzbbt {
    private final zzcct zza;
    private final zzazx zzb;
    private final Future<zzfb> zzc = zzccz.zza.zzb(new zzo(this));
    private final Context zzd;
    private final zzq zze;
    private WebView zzf;
    private zzbbh zzg;
    private zzfb zzh;
    private AsyncTask<Void, Void, String> zzi;

    public zzr(Context context, zzazx zzazxVar, String str, zzcct zzcctVar) {
        this.zzd = context;
        this.zza = zzcctVar;
        this.zzb = zzazxVar;
        this.zzf = new WebView(context);
        this.zze = new zzq(context, str);
        zzL(0);
        this.zzf.setVerticalScrollBarEnabled(false);
        this.zzf.getSettings().setJavaScriptEnabled(true);
        this.zzf.setWebViewClient(new zzm(this));
        this.zzf.setOnTouchListener(new zzn(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzT(zzr zzrVar, String str) {
        if (zzrVar.zzh == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = zzrVar.zzh.zze(parse, zzrVar.zzd, null, null);
        } catch (zzfc e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzU(zzr zzrVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzrVar.zzd.startActivity(intent);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final boolean zzA() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzB(zzbyb zzbybVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzC(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzD(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbdj zzE() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzF(zzbey zzbeyVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzG(zzbdn zzbdnVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzH(zzbad zzbadVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzI(zzaue zzaueVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzJ(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzK(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                zzbay.zza();
                return zzccg.zzs(this.zzd, Integer.parseInt(queryParameter));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzL(int i) {
        if (this.zzf == null) {
            return;
        }
        this.zzf.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzM() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(zzbgu.zzd.zze());
        builder.appendQueryParameter(SearchIntents.EXTRA_QUERY, this.zze.zzb());
        builder.appendQueryParameter("pubId", this.zze.zzc());
        Map<String, String> zzd = this.zze.zzd();
        for (String str : zzd.keySet()) {
            builder.appendQueryParameter(str, zzd.get(str));
        }
        Uri build = builder.build();
        zzfb zzfbVar = this.zzh;
        if (zzfbVar != null) {
            try {
                build = zzfbVar.zzc(build, this.zzd);
            } catch (zzfc e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Unable to process ad data", e);
            }
        }
        String zzN = zzN();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(zzN).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(zzN);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzN() {
        String zza = this.zze.zza();
        if (true == TextUtils.isEmpty(zza)) {
            zza = "www.google.com";
        }
        String zze = zzbgu.zzd.zze();
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 8 + String.valueOf(zze).length());
        sb.append("https://");
        sb.append(zza);
        sb.append(zze);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzO(zzbdd zzbddVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzP(zzazs zzazsVar, zzbbk zzbbkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzQ(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzR(zzbci zzbciVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzab(zzbcf zzbcfVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final IObjectWrapper zzb() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final boolean zzbS() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzc() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzi.cancel(true);
        this.zzc.cancel(true);
        this.zzf.destroy();
        this.zzf = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final boolean zze(zzazs zzazsVar) throws RemoteException {
        Preconditions.checkNotNull(this.zzf, "This Search Ad has already been torn down");
        this.zze.zze(zzazsVar, this.zza);
        this.zzi = new zzp(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzf() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzg() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzh(zzbbh zzbbhVar) throws RemoteException {
        this.zzg = zzbbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzi(zzbcb zzbcbVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzj(zzbby zzbbyVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final Bundle zzk() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzl() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzm() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzazx zzn() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzo(zzazx zzazxVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzp(zzbvv zzbvvVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzq(zzbvy zzbvyVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final String zzr() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final String zzs() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbdg zzt() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final String zzu() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbcb zzv() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbbh zzw() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzx(zzbgl zzbglVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzy(zzbbe zzbbeVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzz(boolean z) throws RemoteException {
    }
}
