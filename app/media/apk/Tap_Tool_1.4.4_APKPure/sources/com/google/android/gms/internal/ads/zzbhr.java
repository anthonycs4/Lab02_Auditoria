package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbhr extends zzbib {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private static final int zzd;
    private final String zze;
    private final List<zzbhu> zzf = new ArrayList();
    private final List<zzbik> zzg = new ArrayList();
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;

    static {
        int rgb = Color.rgb(12, 174, 206);
        zzc = rgb;
        int rgb2 = Color.rgb(204, 204, 204);
        zzd = rgb2;
        zza = rgb2;
        zzb = rgb;
    }

    public zzbhr(String str, List<zzbhu> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        int i3;
        int i4;
        this.zze = str;
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzbhu zzbhuVar = list.get(i5);
            this.zzf.add(zzbhuVar);
            this.zzg.add(zzbhuVar);
        }
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = zza;
        }
        this.zzh = i3;
        if (num2 != null) {
            i4 = num2.intValue();
        } else {
            i4 = zzb;
        }
        this.zzi = i4;
        this.zzj = num3 != null ? num3.intValue() : 12;
        this.zzk = i;
        this.zzl = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final String zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final List<zzbik> zzc() {
        return this.zzg;
    }

    public final List<zzbhu> zzd() {
        return this.zzf;
    }

    public final int zze() {
        return this.zzh;
    }

    public final int zzf() {
        return this.zzi;
    }

    public final int zzg() {
        return this.zzj;
    }

    public final int zzh() {
        return this.zzk;
    }

    public final int zzi() {
        return this.zzl;
    }
}
