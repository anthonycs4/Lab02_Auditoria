package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdlc extends zzbiz {
    private final Context zza;
    private final zzdgz zzb;
    private zzdhy zzc;
    private zzdgu zzd;

    public zzdlc(Context context, zzdgz zzdgzVar, zzdhy zzdhyVar, zzdgu zzdguVar) {
        this.zza = context;
        this.zzb = zzdgzVar;
        this.zzc = zzdhyVar;
        this.zzd = zzdguVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final String zze(String str) {
        return this.zzb.zzY().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final zzbik zzf(String str) {
        return this.zzb.zzV().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final List<String> zzg() {
        SimpleArrayMap<String, zzbhu> zzV = this.zzb.zzV();
        SimpleArrayMap<String, String> zzY = this.zzb.zzY();
        String[] strArr = new String[zzV.size() + zzY.size()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzV.size()) {
            strArr[i3] = zzV.keyAt(i2);
            i2++;
            i3++;
        }
        while (i < zzY.size()) {
            strArr[i3] = zzY.keyAt(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final String zzh() {
        return this.zzb.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final void zzi(String str) {
        zzdgu zzdguVar = this.zzd;
        if (zzdguVar != null) {
            zzdguVar.zza(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final void zzj() {
        zzdgu zzdguVar = this.zzd;
        if (zzdguVar != null) {
            zzdguVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final zzbdj zzk() {
        return this.zzb.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final void zzl() {
        zzdgu zzdguVar = this.zzd;
        if (zzdguVar != null) {
            zzdguVar.zzR();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final boolean zzn(IObjectWrapper iObjectWrapper) {
        zzdhy zzdhyVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof ViewGroup) && (zzdhyVar = this.zzc) != null && zzdhyVar.zzd((ViewGroup) unwrap)) {
            this.zzb.zzR().zzap(new zzdlb(this));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final boolean zzo() {
        zzdgu zzdguVar = this.zzd;
        return (zzdguVar == null || zzdguVar.zzC()) && this.zzb.zzT() != null && this.zzb.zzR() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final boolean zzp() {
        IObjectWrapper zzU = this.zzb.zzU();
        if (zzU != null) {
            com.google.android.gms.ads.internal.zzs.zzr().zzh(zzU);
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzdq)).booleanValue() || this.zzb.zzT() == null) {
                return true;
            }
            this.zzb.zzT().zze("onSdkLoaded", new ArrayMap());
            return true;
        }
        com.google.android.gms.ads.internal.util.zze.zzi("Trying to start OMID session before creation.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzdgu zzdguVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzb.zzU() == null || (zzdguVar = this.zzd) == null) {
            return;
        }
        zzdguVar.zzD((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final void zzr() {
        String zzX = this.zzb.zzX();
        if ("Google".equals(zzX)) {
            com.google.android.gms.ads.internal.util.zze.zzi("Illegal argument specified for omid partner name.");
            return;
        }
        zzdgu zzdguVar = this.zzd;
        if (zzdguVar != null) {
            zzdguVar.zzB(zzX, false);
        }
    }
}
