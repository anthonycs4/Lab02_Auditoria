package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzegd implements zzeld<zzege> {
    private final zzflb zza;
    private final Context zzb;
    private final zzetk zzc;
    private final View zzd;

    public zzegd(zzflb zzflbVar, Context context, zzetk zzetkVar, ViewGroup viewGroup) {
        this.zza = zzflbVar;
        this.zzb = context;
        this.zzc = zzetkVar;
        this.zzd = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzege> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzegc
            private final zzegd zza;

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
    public final /* synthetic */ zzege zzb() throws Exception {
        Context context = this.zzb;
        zzazx zzazxVar = this.zzc.zze;
        ArrayList arrayList = new ArrayList();
        View view = this.zzd;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzege(context, zzazxVar, arrayList);
    }
}
