package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdhk {
    public static final zzdhk zza = new zzdhk(new zzdhj());
    private final zzbjh zzb;
    private final zzbje zzc;
    private final zzbju zzd;
    private final zzbjr zze;
    private final zzboe zzf;
    private final SimpleArrayMap<String, zzbjn> zzg;
    private final SimpleArrayMap<String, zzbjk> zzh;

    private zzdhk(zzdhj zzdhjVar) {
        this.zzb = zzdhjVar.zza;
        this.zzc = zzdhjVar.zzb;
        this.zzd = zzdhjVar.zzc;
        this.zzg = new SimpleArrayMap<>(zzdhjVar.zzf);
        this.zzh = new SimpleArrayMap<>(zzdhjVar.zzg);
        this.zze = zzdhjVar.zzd;
        this.zzf = zzdhjVar.zze;
    }

    public final zzbjh zza() {
        return this.zzb;
    }

    public final zzbje zzb() {
        return this.zzc;
    }

    public final zzbju zzc() {
        return this.zzd;
    }

    public final zzbjr zzd() {
        return this.zze;
    }

    public final zzboe zze() {
        return this.zzf;
    }

    public final zzbjn zzf(String str) {
        return this.zzg.get(str);
    }

    public final zzbjk zzg(String str) {
        return this.zzh.get(str);
    }

    public final ArrayList<String> zzh() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.zzg.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> zzi() {
        ArrayList<String> arrayList = new ArrayList<>(this.zzg.size());
        for (int i = 0; i < this.zzg.size(); i++) {
            arrayList.add(this.zzg.keyAt(i));
        }
        return arrayList;
    }
}
