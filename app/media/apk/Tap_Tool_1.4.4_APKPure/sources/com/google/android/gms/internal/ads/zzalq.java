package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzalq implements Comparator<zzalp>, Parcelable {
    public static final Parcelable.Creator<zzalq> CREATOR = new zzaln();
    public final int zza;
    private final zzalp[] zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalq(Parcel parcel) {
        zzalp[] zzalpVarArr = (zzalp[]) parcel.createTypedArray(zzalp.CREATOR);
        this.zzb = zzalpVarArr;
        this.zza = zzalpVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzalp zzalpVar, zzalp zzalpVar2) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        UUID uuid4;
        zzalp zzalpVar3 = zzalpVar;
        zzalp zzalpVar4 = zzalpVar2;
        UUID uuid5 = zzaje.zzb;
        uuid = zzalpVar3.zze;
        if (uuid5.equals(uuid)) {
            UUID uuid6 = zzaje.zzb;
            uuid4 = zzalpVar4.zze;
            return !uuid6.equals(uuid4) ? 1 : 0;
        }
        uuid2 = zzalpVar3.zze;
        uuid3 = zzalpVar4.zze;
        return uuid2.compareTo(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzalq) obj).zzb);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzb);
            this.zzc = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.zzb, 0);
    }

    public final zzalp zza(int i) {
        return this.zzb[i];
    }

    public zzalq(List<zzalp> list) {
        this(false, (zzalp[]) list.toArray(new zzalp[list.size()]));
    }

    private zzalq(boolean z, zzalp... zzalpVarArr) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        zzalpVarArr = z ? (zzalp[]) zzalpVarArr.clone() : zzalpVarArr;
        Arrays.sort(zzalpVarArr, this);
        int i = 1;
        while (true) {
            int length = zzalpVarArr.length;
            if (i >= length) {
                this.zzb = zzalpVarArr;
                this.zza = length;
                return;
            }
            uuid = zzalpVarArr[i - 1].zze;
            uuid2 = zzalpVarArr[i].zze;
            if (uuid.equals(uuid2)) {
                uuid3 = zzalpVarArr[i].zze;
                String valueOf = String.valueOf(uuid3);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            i++;
        }
    }

    public zzalq(zzalp... zzalpVarArr) {
        this(true, zzalpVarArr);
    }
}
