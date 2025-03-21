package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzarp extends Surface {
    private static boolean zza;
    private static boolean zzb;
    private final zzaro zzc;
    private boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzarp(zzaro zzaroVar, SurfaceTexture surfaceTexture, boolean z, zzarn zzarnVar) {
        super(surfaceTexture);
        this.zzc = zzaroVar;
    }

    public static synchronized boolean zza(Context context) {
        boolean z;
        synchronized (zzarp.class) {
            if (!zzb) {
                if (zzarj.zza >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content") && (zzarj.zza != 24 || ((!zzarj.zzd.startsWith("SM-G950") && !zzarj.zzd.startsWith("SM-G955")) || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")))) {
                        z2 = true;
                    }
                    zza = z2;
                }
                zzb = true;
            }
            z = zza;
        }
        return z;
    }

    public static zzarp zzb(Context context, boolean z) {
        if (zzarj.zza >= 17) {
            boolean z2 = true;
            if (z && !zza(context)) {
                z2 = false;
            }
            zzaqu.zzd(z2);
            return new zzaro().zza(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzc) {
            if (!this.zzd) {
                this.zzc.zzb();
                this.zzd = true;
            }
        }
    }
}
