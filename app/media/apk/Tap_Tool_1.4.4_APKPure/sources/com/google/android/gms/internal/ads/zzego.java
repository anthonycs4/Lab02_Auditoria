package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzego implements zzeld<zzegp> {
    private final zzeld<zzeli> zza;
    private final zzetk zzb;
    private final Context zzc;
    private final zzcby zzd;

    public zzego(zzehz<zzeli> zzehzVar, zzetk zzetkVar, Context context, zzcby zzcbyVar) {
        this.zza = zzehzVar;
        this.zzb = zzetkVar;
        this.zzc = context;
        this.zzd = zzcbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzegp> zza() {
        return zzfks.zzj(this.zza.zza(), new zzfei(this) { // from class: com.google.android.gms.internal.ads.zzegn
            private final zzego zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj) {
                return this.zza.zzb((zzeli) obj);
            }
        }, zzccz.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzegp zzb(zzeli zzeliVar) {
        String str;
        boolean z;
        String str2;
        float f;
        int i;
        int i2;
        int i3;
        DisplayMetrics displayMetrics;
        zzazx zzazxVar = this.zzb.zze;
        zzazx[] zzazxVarArr = zzazxVar.zzg;
        if (zzazxVarArr == null) {
            str = zzazxVar.zza;
            z = zzazxVar.zzi;
        } else {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzazx zzazxVar2 : zzazxVarArr) {
                boolean z4 = zzazxVar2.zzi;
                if (!z4 && !z2) {
                    str = zzazxVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (z3) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        } else {
            float f2 = displayMetrics.density;
            int i4 = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
            str2 = this.zzd.zzl().zzy();
            i = i4;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        zzazx[] zzazxVarArr2 = zzazxVar.zzg;
        if (zzazxVarArr2 != null) {
            boolean z5 = false;
            for (zzazx zzazxVar3 : zzazxVarArr2) {
                if (zzazxVar3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i5 = zzazxVar3.zze;
                    if (i5 == -1) {
                        i5 = f != 0.0f ? (int) (zzazxVar3.zzf / f) : -1;
                    }
                    sb.append(i5);
                    sb.append("x");
                    int i6 = zzazxVar3.zzb;
                    if (i6 == -2) {
                        i6 = f != 0.0f ? (int) (zzazxVar3.zzc / f) : -2;
                    }
                    sb.append(i6);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzegp(zzazxVar, str, z, sb.toString(), f, i, i2, str2, this.zzb.zzp);
    }
}
