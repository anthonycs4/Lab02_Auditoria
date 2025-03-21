package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzahj {
    private static final Comparator<zzahi> zza = zzahf.zza;
    private static final Comparator<zzahi> zzb = zzahg.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzahi[] zzd = new zzahi[5];
    private final ArrayList<zzahi> zzc = new ArrayList<>();
    private int zze = -1;

    public zzahj(int i) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i, float f) {
        zzahi zzahiVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzahi[] zzahiVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzahiVar = zzahiVarArr[i3];
        } else {
            zzahiVar = new zzahi(null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzahiVar.zza = i4;
        zzahiVar.zzb = i;
        zzahiVar.zzc = f;
        this.zzc.add(zzahiVar);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            zzahi zzahiVar2 = this.zzc.get(0);
            int i7 = zzahiVar2.zzb;
            if (i7 <= i6) {
                this.zzg -= i7;
                this.zzc.remove(0);
                int i8 = this.zzh;
                if (i8 < 5) {
                    zzahi[] zzahiVarArr2 = this.zzd;
                    this.zzh = i8 + 1;
                    zzahiVarArr2[i8] = zzahiVar2;
                }
            } else {
                zzahiVar2.zzb = i7 - i6;
                this.zzg -= i6;
            }
        }
    }

    public final float zzc(float f) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            zzahi zzahiVar = this.zzc.get(i2);
            i += zzahiVar.zzb;
            if (i >= f2) {
                return zzahiVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<zzahi> arrayList = this.zzc;
        return arrayList.get(arrayList.size() - 1).zzc;
    }
}
