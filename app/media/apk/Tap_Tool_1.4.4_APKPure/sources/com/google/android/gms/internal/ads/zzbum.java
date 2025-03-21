package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbum extends zzbun implements zzblp<zzcib> {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcib zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbfb zzk;
    private float zzl;
    private int zzm;

    public zzbum(zzcib zzcibVar, Context context, zzbfb zzbfbVar) {
        super(zzcibVar, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcibVar;
        this.zzi = context;
        this.zzk = zzbfbVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzcib zzcibVar, Map map) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObject;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        zzbay.zza();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzccg.zzq(displayMetrics, displayMetrics.widthPixels);
        zzbay.zza();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzccg.zzq(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzj = this.zzh.zzj();
        if (zzj == null || zzj.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzs.zzc();
            int[] zzS = com.google.android.gms.ads.internal.util.zzr.zzS(zzj);
            zzbay.zza();
            this.zzd = zzccg.zzq(this.zza, zzS[0]);
            zzbay.zza();
            this.zze = zzccg.zzq(this.zza, zzS[1]);
        }
        if (this.zzh.zzP().zzg()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzk(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbul zzbulVar = new zzbul();
        zzbfb zzbfbVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbulVar.zzb(zzbfbVar.zzc(intent));
        zzbfb zzbfbVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbulVar.zza(zzbfbVar2.zzc(intent2));
        zzbulVar.zzc(this.zzk.zzb());
        zzbulVar.zzd(this.zzk.zza());
        zzbulVar.zze(true);
        z = zzbulVar.zza;
        z2 = zzbulVar.zzb;
        z3 = zzbulVar.zzc;
        z4 = zzbulVar.zzd;
        z5 = zzbulVar.zze;
        zzcib zzcibVar2 = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzcibVar2.zzd("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(zzbay.zza().zza(this.zzi, iArr[0]), zzbay.zza().zza(this.zzi, iArr[1]));
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            com.google.android.gms.ads.internal.util.zze.zzh("Dispatching Ready Event.");
        }
        zzg(this.zzh.zzt().zza);
    }

    public final void zzb(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.zzi instanceof Activity) {
            com.google.android.gms.ads.internal.zzs.zzc();
            i3 = com.google.android.gms.ads.internal.util.zzr.zzU((Activity) this.zzi)[0];
        } else {
            i3 = 0;
        }
        if (this.zzh.zzP() == null || !this.zzh.zzP().zzg()) {
            int width = this.zzh.getWidth();
            int height = this.zzh.getHeight();
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzM)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzP() != null ? this.zzh.zzP().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzP() != null) {
                        i4 = this.zzh.zzP().zza;
                    }
                    this.zzf = zzbay.zza().zza(this.zzi, width);
                    this.zzg = zzbay.zza().zza(this.zzi, i4);
                }
            }
            i4 = height;
            this.zzf = zzbay.zza().zza(this.zzi, width);
            this.zzg = zzbay.zza().zza(this.zzi, i4);
        }
        zzi(i, i2 - i3, this.zzf, this.zzg);
        this.zzh.zzR().zzC(i, i2);
    }
}
