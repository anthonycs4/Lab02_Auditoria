package com.google.android.gms.internal.ads;

import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbqs extends zzccs {
    private final zzbqr zza;

    public zzbqs(zzbqr zzbqrVar, String str) {
        super(str);
        this.zza = zzbqrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccs, com.google.android.gms.internal.ads.zzccf
    public final void zza(String str) {
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return;
        }
        super.zza(str);
    }
}
