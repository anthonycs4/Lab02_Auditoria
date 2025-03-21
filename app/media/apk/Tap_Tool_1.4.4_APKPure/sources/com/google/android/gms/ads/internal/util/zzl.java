package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbgo;
import com.google.android.gms.internal.ads.zzgec;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzl implements zzbgm {
    final /* synthetic */ zzbgo zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(zzr zzrVar, zzbgo zzbgoVar, Context context, Uri uri) {
        this.zza = zzbgoVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zza() {
        CustomTabsIntent build = new CustomTabsIntent.Builder(this.zza.zzc()).build();
        build.intent.setPackage(zzgec.zza(this.zzb));
        build.launchUrl(this.zzb, this.zzc);
        this.zza.zzb((Activity) this.zzb);
    }
}
