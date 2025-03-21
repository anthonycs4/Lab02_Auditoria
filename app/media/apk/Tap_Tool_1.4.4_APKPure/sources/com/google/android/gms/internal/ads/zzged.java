package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzged extends CustomTabsServiceConnection {
    private final WeakReference<zzbgo> zza;

    public zzged(zzbgo zzbgoVar, byte[] bArr) {
        this.zza = new WeakReference<>(zzbgoVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbgo zzbgoVar = this.zza.get();
        if (zzbgoVar != null) {
            zzbgoVar.zzf(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbgo zzbgoVar = this.zza.get();
        if (zzbgoVar != null) {
            zzbgoVar.zzg();
        }
    }
}
