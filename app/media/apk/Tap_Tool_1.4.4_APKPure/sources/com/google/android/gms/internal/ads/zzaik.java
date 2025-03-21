package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaik implements DisplayManager.DisplayListener {
    final /* synthetic */ zzaim zza;
    private final DisplayManager zzb;

    public zzaik(zzaim zzaimVar, DisplayManager displayManager) {
        this.zza = zzaimVar;
        this.zzb = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.zza.zzq();
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    public final void zza() {
        this.zzb.registerDisplayListener(this, zzaht.zzh(null));
    }

    public final void zzb() {
        this.zzb.unregisterDisplayListener(this);
    }
}
