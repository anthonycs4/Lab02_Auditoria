package com.google.android.gms.ads.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzo extends ConnectivityManager.NetworkCallback {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(zzr zzrVar) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        synchronized (zzr.class) {
            boolean unused = zzr.zzd = true;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzr.class) {
            boolean unused = zzr.zzd = false;
        }
    }
}
