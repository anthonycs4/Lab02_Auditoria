package com.google.android.gms.internal.ads;

import android.os.Trace;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzahr {
    public static void zza(String str) {
        if (zzaht.zza >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void zzb() {
        if (zzaht.zza >= 18) {
            Trace.endSection();
        }
    }
}
