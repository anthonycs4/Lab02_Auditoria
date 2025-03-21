package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzacf implements Parcelable {
    public static final Parcelable.Creator<zzacf> CREATOR = new zzace();
    public final int zza;
    private final zzjq[] zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacf(Parcel parcel) {
        int readInt = parcel.readInt();
        this.zza = readInt;
        this.zzb = new zzjq[readInt];
        for (int i = 0; i < this.zza; i++) {
            this.zzb[i] = (zzjq) parcel.readParcelable(zzjq.class.getClassLoader());
        }
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
    }

    private static void zzd(String str, String str2, String str3, int i) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 78 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        zzagm.zzb("TrackGroup", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new IllegalStateException(sb.toString()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzacf zzacfVar = (zzacf) obj;
            if (this.zza == zzacfVar.zza && Arrays.equals(this.zzb, zzacfVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + 527;
            this.zzc = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        for (int i2 = 0; i2 < this.zza; i2++) {
            parcel.writeParcelable(this.zzb[i2], 0);
        }
    }

    public final zzjq zza(int i) {
        return this.zzb[i];
    }

    public final int zzb(zzjq zzjqVar) {
        int i = 0;
        while (true) {
            zzjq[] zzjqVarArr = this.zzb;
            if (i >= zzjqVarArr.length) {
                return -1;
            }
            if (zzjqVar == zzjqVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public zzacf(zzjq... zzjqVarArr) {
        int length = zzjqVarArr.length;
        int i = 1;
        zzafs.zzd(length > 0);
        this.zzb = zzjqVarArr;
        this.zza = length;
        String zzc = zzc(zzjqVarArr[0].zzc);
        int i2 = zzjqVarArr[0].zze | 16384;
        while (true) {
            zzjq[] zzjqVarArr2 = this.zzb;
            if (i >= zzjqVarArr2.length) {
                return;
            }
            if (zzc.equals(zzc(zzjqVarArr2[i].zzc))) {
                zzjq[] zzjqVarArr3 = this.zzb;
                if (i2 != (zzjqVarArr3[i].zze | 16384)) {
                    zzd("role flags", Integer.toBinaryString(zzjqVarArr3[0].zze), Integer.toBinaryString(this.zzb[i].zze), i);
                    return;
                }
                i++;
            } else {
                zzjq[] zzjqVarArr4 = this.zzb;
                zzd("languages", zzjqVarArr4[0].zzc, zzjqVarArr4[i].zzc, i);
                return;
            }
        }
    }
}
