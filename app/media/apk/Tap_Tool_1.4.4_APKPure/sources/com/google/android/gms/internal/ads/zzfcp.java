package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfcp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfcp> CREATOR = new zzfcq();
    public final int zza;
    private zzdc zzb = null;
    private byte[] zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfcp(int i, byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzdc zzdcVar = this.zzb;
        if (zzdcVar != null || this.zzc == null) {
            if (zzdcVar == null || this.zzc != null) {
                if (zzdcVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzdcVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzao();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzdc zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzdc.zzi(this.zzc, zzfxy.zza());
                this.zzc = null;
            } catch (zzfyy | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }
}
