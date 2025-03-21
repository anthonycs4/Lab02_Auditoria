package com.google.android.gms.internal.ads;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzezv implements zzezt {
    private final zzezt zza;

    public zzezv(zzezt zzeztVar) {
        this.zza = zzeztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezt
    public final JSONObject zza(View view) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzezt
    public final void zzb(View view, JSONObject jSONObject, zzezs zzezsVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        zzezk zza = zzezk.zza();
        if (zza != null) {
            Collection<zzeyz> zzf = zza.zzf();
            int size = zzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (zzeyz zzeyzVar : zzf) {
                View zzj = zzeyzVar.zzj();
                if (zzj != null && (Build.VERSION.SDK_INT < 19 || zzj.isAttachedToWindow())) {
                    if (zzj.isShown()) {
                        View view2 = zzj;
                        while (true) {
                            if (view2 != null) {
                                if (view2.getAlpha() != 0.0f) {
                                    ViewParent parent = view2.getParent();
                                    view2 = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                View rootView = zzj.getRootView();
                                if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                    identityHashMap.put(rootView, rootView);
                                    float zza2 = zzfae.zza(rootView);
                                    int size2 = arrayList.size();
                                    while (size2 > 0) {
                                        int i = size2 - 1;
                                        if (zzfae.zza((View) arrayList.get(i)) <= zza2) {
                                            break;
                                        }
                                        size2 = i;
                                    }
                                    arrayList.add(size2, rootView);
                                }
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzezsVar.zza((View) arrayList.get(i2), this.zza, jSONObject);
        }
    }
}
