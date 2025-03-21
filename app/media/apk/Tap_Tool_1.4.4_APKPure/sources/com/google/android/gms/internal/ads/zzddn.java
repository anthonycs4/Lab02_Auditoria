package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzddn implements zzdbd {
    static final zzdbd zza = new zzddn();

    private zzddn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbd
    public final void zza(Object obj) {
        ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
    }
}
