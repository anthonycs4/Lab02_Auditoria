package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeks implements zzeld<zzekt> {
    private final zzflb zza;
    private final Context zzb;
    private final zzcct zzc;

    public zzeks(zzflb zzflbVar, Context context, zzcct zzcctVar) {
        this.zza = zzflbVar;
        this.zzb = context;
        this.zzc = zzcctVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzekt> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzekr
            private final zzeks zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzekt zzb() throws Exception {
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzs.zzc();
        boolean zzH = com.google.android.gms.ads.internal.util.zzr.zzH(this.zzb);
        String str = this.zzc.zza;
        com.google.android.gms.ads.internal.zzs.zze();
        boolean zzu = com.google.android.gms.ads.internal.util.zzac.zzu();
        com.google.android.gms.ads.internal.zzs.zzc();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        return new zzekt(isCallerInstantApp, zzH, str, zzu, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.getRemoteVersion(this.zzb, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(this.zzb, ModuleDescriptor.MODULE_ID));
    }
}
