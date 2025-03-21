package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeiv implements zzeld<zzeiw> {
    private final zzflb zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set<String> zzd;

    public zzeiv(zzflb zzflbVar, ViewGroup viewGroup, Context context, Set<String> set) {
        this.zza = zzflbVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzeiw> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeiu
            private final zzeiv zza;

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
    public final /* synthetic */ zzeiw zzb() throws Exception {
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzec)).booleanValue() || this.zzb == null || !this.zzd.contains("banner")) {
            Boolean bool = null;
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzed)).booleanValue() && this.zzd.contains("native")) {
                Context context = this.zzc;
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    Window window = activity.getWindow();
                    boolean z = true;
                    if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                        try {
                            if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) == 0) {
                                z = false;
                            }
                            bool = Boolean.valueOf(z);
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    } else {
                        bool = true;
                    }
                    return new zzeiw(bool);
                }
            }
            return new zzeiw(null);
        }
        return new zzeiw(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
    }
}
