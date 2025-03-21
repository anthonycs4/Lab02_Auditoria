package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzat {
    protected static final Comparator<byte[]> zza = new zzas();
    private final List<byte[]> zzb = new ArrayList();
    private final List<byte[]> zzc = new ArrayList(64);
    private int zzd = 0;

    public zzat(int i) {
    }

    private final synchronized void zzc() {
        while (this.zzd > 4096) {
            byte[] remove = this.zzb.remove(0);
            this.zzc.remove(remove);
            this.zzd -= remove.length;
        }
    }

    public final synchronized byte[] zza(int i) {
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            byte[] bArr = this.zzc.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.zzd -= length;
                this.zzc.remove(i2);
                this.zzb.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public final synchronized void zzb(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.zzb.add(bArr);
                int binarySearch = Collections.binarySearch(this.zzc, bArr, zza);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.zzc.add(binarySearch, bArr);
                this.zzd += length;
                zzc();
            }
        }
    }
}
