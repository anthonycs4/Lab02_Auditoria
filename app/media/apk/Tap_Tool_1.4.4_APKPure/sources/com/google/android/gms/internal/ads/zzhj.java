package com.google.android.gms.internal.ads;

import androidx.room.RoomDatabase;
import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzhj implements zzfyo {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    UNKNOWN(RoomDatabase.MAX_BIND_PARAMETER_CNT);
    
    private static final zzfyp<zzhj> zzg = new zzfyp<zzhj>() { // from class: com.google.android.gms.internal.ads.zzhi
    };
    private final int zzh;

    zzhj(int i) {
        this.zzh = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + Typography.greater;
    }

    public final int zza() {
        return this.zzh;
    }
}
