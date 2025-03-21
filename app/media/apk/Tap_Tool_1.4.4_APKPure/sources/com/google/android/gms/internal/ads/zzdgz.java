package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdgz {
    private int zza;
    private zzbdj zzb;
    private zzbic zzc;
    private View zzd;
    private List<?> zze;
    private zzbea zzg;
    private Bundle zzh;
    private zzcib zzi;
    private zzcib zzj;
    private zzcib zzk;
    private IObjectWrapper zzl;
    private View zzm;
    private View zzn;
    private IObjectWrapper zzo;
    private double zzp;
    private zzbik zzq;
    private zzbik zzr;
    private String zzs;
    private float zzv;
    private String zzw;
    private final SimpleArrayMap<String, zzbhu> zzt = new SimpleArrayMap<>();
    private final SimpleArrayMap<String, String> zzu = new SimpleArrayMap<>();
    private List<zzbea> zzf = Collections.emptyList();

    public static zzdgz zzaa(zzbrt zzbrtVar) {
        try {
            return zzaf(zzah(zzbrtVar.zzn(), zzbrtVar), zzbrtVar.zzo(), (View) zzag(zzbrtVar.zzp()), zzbrtVar.zze(), zzbrtVar.zzf(), zzbrtVar.zzg(), zzbrtVar.zzs(), zzbrtVar.zzi(), (View) zzag(zzbrtVar.zzq()), zzbrtVar.zzr(), zzbrtVar.zzl(), zzbrtVar.zzm(), zzbrtVar.zzk(), zzbrtVar.zzh(), zzbrtVar.zzj(), zzbrtVar.zzz());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static zzdgz zzab(zzbrq zzbrqVar) {
        try {
            zzdgy zzah = zzah(zzbrqVar.zzs(), null);
            zzbic zzt = zzbrqVar.zzt();
            String zze = zzbrqVar.zze();
            List<?> zzf = zzbrqVar.zzf();
            String zzg = zzbrqVar.zzg();
            Bundle zzp = zzbrqVar.zzp();
            String zzi = zzbrqVar.zzi();
            IObjectWrapper zzv = zzbrqVar.zzv();
            String zzj = zzbrqVar.zzj();
            zzbik zzh = zzbrqVar.zzh();
            zzdgz zzdgzVar = new zzdgz();
            zzdgzVar.zza = 1;
            zzdgzVar.zzb = zzah;
            zzdgzVar.zzc = zzt;
            zzdgzVar.zzd = (View) zzag(zzbrqVar.zzr());
            zzdgzVar.zzq("headline", zze);
            zzdgzVar.zze = zzf;
            zzdgzVar.zzq("body", zzg);
            zzdgzVar.zzh = zzp;
            zzdgzVar.zzq("call_to_action", zzi);
            zzdgzVar.zzm = (View) zzag(zzbrqVar.zzu());
            zzdgzVar.zzo = zzv;
            zzdgzVar.zzq("advertiser", zzj);
            zzdgzVar.zzr = zzh;
            return zzdgzVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdgz zzac(zzbrp zzbrpVar) {
        try {
            zzdgy zzah = zzah(zzbrpVar.zzt(), null);
            zzbic zzv = zzbrpVar.zzv();
            String zze = zzbrpVar.zze();
            List<?> zzf = zzbrpVar.zzf();
            String zzg = zzbrpVar.zzg();
            Bundle zzr = zzbrpVar.zzr();
            String zzi = zzbrpVar.zzi();
            IObjectWrapper zzx = zzbrpVar.zzx();
            String zzk = zzbrpVar.zzk();
            String zzl = zzbrpVar.zzl();
            double zzj = zzbrpVar.zzj();
            zzbik zzh = zzbrpVar.zzh();
            zzdgz zzdgzVar = new zzdgz();
            zzdgzVar.zza = 2;
            zzdgzVar.zzb = zzah;
            zzdgzVar.zzc = zzv;
            zzdgzVar.zzd = (View) zzag(zzbrpVar.zzu());
            zzdgzVar.zzq("headline", zze);
            zzdgzVar.zze = zzf;
            zzdgzVar.zzq("body", zzg);
            zzdgzVar.zzh = zzr;
            zzdgzVar.zzq("call_to_action", zzi);
            zzdgzVar.zzm = (View) zzag(zzbrpVar.zzw());
            zzdgzVar.zzo = zzx;
            zzdgzVar.zzq("store", zzk);
            zzdgzVar.zzq("price", zzl);
            zzdgzVar.zzp = zzj;
            zzdgzVar.zzq = zzh;
            return zzdgzVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdgz zzad(zzbrp zzbrpVar) {
        try {
            return zzaf(zzah(zzbrpVar.zzt(), null), zzbrpVar.zzv(), (View) zzag(zzbrpVar.zzu()), zzbrpVar.zze(), zzbrpVar.zzf(), zzbrpVar.zzg(), zzbrpVar.zzr(), zzbrpVar.zzi(), (View) zzag(zzbrpVar.zzw()), zzbrpVar.zzx(), zzbrpVar.zzk(), zzbrpVar.zzl(), zzbrpVar.zzj(), zzbrpVar.zzh(), null, 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdgz zzae(zzbrq zzbrqVar) {
        try {
            return zzaf(zzah(zzbrqVar.zzs(), null), zzbrqVar.zzt(), (View) zzag(zzbrqVar.zzr()), zzbrqVar.zze(), zzbrqVar.zzf(), zzbrqVar.zzg(), zzbrqVar.zzp(), zzbrqVar.zzi(), (View) zzag(zzbrqVar.zzu()), zzbrqVar.zzv(), null, null, -1.0d, zzbrqVar.zzh(), zzbrqVar.zzj(), 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdgz zzaf(zzbdj zzbdjVar, zzbic zzbicVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbik zzbikVar, String str6, float f) {
        zzdgz zzdgzVar = new zzdgz();
        zzdgzVar.zza = 6;
        zzdgzVar.zzb = zzbdjVar;
        zzdgzVar.zzc = zzbicVar;
        zzdgzVar.zzd = view;
        zzdgzVar.zzq("headline", str);
        zzdgzVar.zze = list;
        zzdgzVar.zzq("body", str2);
        zzdgzVar.zzh = bundle;
        zzdgzVar.zzq("call_to_action", str3);
        zzdgzVar.zzm = view2;
        zzdgzVar.zzo = iObjectWrapper;
        zzdgzVar.zzq("store", str4);
        zzdgzVar.zzq("price", str5);
        zzdgzVar.zzp = d;
        zzdgzVar.zzq = zzbikVar;
        zzdgzVar.zzq("advertiser", str6);
        zzdgzVar.zzs(f);
        return zzdgzVar;
    }

    private static <T> T zzag(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return (T) ObjectWrapper.unwrap(iObjectWrapper);
    }

    private static zzdgy zzah(zzbdj zzbdjVar, zzbrt zzbrtVar) {
        if (zzbdjVar == null) {
            return null;
        }
        return new zzdgy(zzbdjVar, zzbrtVar);
    }

    public final synchronized List<?> zzA() {
        return this.zze;
    }

    public final zzbik zzB() {
        List<?> list = this.zze;
        if (list != null && list.size() != 0) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbij.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized List<zzbea> zzC() {
        return this.zzf;
    }

    public final synchronized zzbea zzD() {
        return this.zzg;
    }

    public final synchronized String zzE() {
        return zzu("body");
    }

    public final synchronized Bundle zzF() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized String zzG() {
        return zzu("call_to_action");
    }

    public final synchronized View zzH() {
        return this.zzm;
    }

    public final synchronized View zzI() {
        return this.zzn;
    }

    public final synchronized IObjectWrapper zzJ() {
        return this.zzo;
    }

    public final synchronized String zzK() {
        return zzu("store");
    }

    public final synchronized String zzL() {
        return zzu("price");
    }

    public final synchronized double zzM() {
        return this.zzp;
    }

    public final synchronized zzbik zzN() {
        return this.zzq;
    }

    public final synchronized String zzO() {
        return zzu("advertiser");
    }

    public final synchronized zzbik zzP() {
        return this.zzr;
    }

    public final synchronized String zzQ() {
        return this.zzs;
    }

    public final synchronized zzcib zzR() {
        return this.zzi;
    }

    public final synchronized zzcib zzS() {
        return this.zzj;
    }

    public final synchronized zzcib zzT() {
        return this.zzk;
    }

    public final synchronized IObjectWrapper zzU() {
        return this.zzl;
    }

    public final synchronized SimpleArrayMap<String, zzbhu> zzV() {
        return this.zzt;
    }

    public final synchronized float zzW() {
        return this.zzv;
    }

    public final synchronized String zzX() {
        return this.zzw;
    }

    public final synchronized SimpleArrayMap<String, String> zzY() {
        return this.zzu;
    }

    public final synchronized void zzZ() {
        zzcib zzcibVar = this.zzi;
        if (zzcibVar != null) {
            zzcibVar.destroy();
            this.zzi = null;
        }
        zzcib zzcibVar2 = this.zzj;
        if (zzcibVar2 != null) {
            zzcibVar2.destroy();
            this.zzj = null;
        }
        zzcib zzcibVar3 = this.zzk;
        if (zzcibVar3 != null) {
            zzcibVar3.destroy();
            this.zzk = null;
        }
        this.zzl = null;
        this.zzt.clear();
        this.zzu.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzm = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
    }

    public final synchronized void zza(int i) {
        this.zza = i;
    }

    public final synchronized void zzb(zzbdj zzbdjVar) {
        this.zzb = zzbdjVar;
    }

    public final synchronized void zzc(zzbic zzbicVar) {
        this.zzc = zzbicVar;
    }

    public final synchronized void zzd(List<zzbhu> list) {
        this.zze = list;
    }

    public final synchronized void zze(List<zzbea> list) {
        this.zzf = list;
    }

    public final synchronized void zzf(zzbea zzbeaVar) {
        this.zzg = zzbeaVar;
    }

    public final synchronized void zzg(View view) {
        this.zzm = view;
    }

    public final synchronized void zzh(View view) {
        this.zzn = view;
    }

    public final synchronized void zzi(double d) {
        this.zzp = d;
    }

    public final synchronized void zzj(zzbik zzbikVar) {
        this.zzq = zzbikVar;
    }

    public final synchronized void zzk(zzbik zzbikVar) {
        this.zzr = zzbikVar;
    }

    public final synchronized void zzl(String str) {
        this.zzs = str;
    }

    public final synchronized void zzm(zzcib zzcibVar) {
        this.zzi = zzcibVar;
    }

    public final synchronized void zzn(zzcib zzcibVar) {
        this.zzj = zzcibVar;
    }

    public final synchronized void zzo(zzcib zzcibVar) {
        this.zzk = zzcibVar;
    }

    public final synchronized void zzp(IObjectWrapper iObjectWrapper) {
        this.zzl = iObjectWrapper;
    }

    public final synchronized void zzq(String str, String str2) {
        if (str2 == null) {
            this.zzu.remove(str);
        } else {
            this.zzu.put(str, str2);
        }
    }

    public final synchronized void zzr(String str, zzbhu zzbhuVar) {
        if (zzbhuVar == null) {
            this.zzt.remove(str);
        } else {
            this.zzt.put(str, zzbhuVar);
        }
    }

    public final synchronized void zzs(float f) {
        this.zzv = f;
    }

    public final synchronized void zzt(String str) {
        this.zzw = str;
    }

    public final synchronized String zzu(String str) {
        return this.zzu.get(str);
    }

    public final synchronized int zzv() {
        return this.zza;
    }

    public final synchronized zzbdj zzw() {
        return this.zzb;
    }

    public final synchronized zzbic zzx() {
        return this.zzc;
    }

    public final synchronized View zzy() {
        return this.zzd;
    }

    public final synchronized String zzz() {
        return zzu("headline");
    }
}
