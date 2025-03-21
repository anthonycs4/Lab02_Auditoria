package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzahg implements Comparator {
    static final Comparator zza = new zzahg();

    private zzahg() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((zzahi) obj).zzc, ((zzahi) obj2).zzc);
    }
}
