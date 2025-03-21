package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaib extends Surface {
    private static int zza;
    private static boolean zzb;
    private final zzaia zzc;
    private boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaib(zzaia zzaiaVar, SurfaceTexture surfaceTexture, boolean z, zzahz zzahzVar) {
        super(surfaceTexture);
        this.zzc = zzaiaVar;
    }

    public static synchronized boolean zza(Context context) {
        int i;
        String eglQueryString;
        String eglQueryString2;
        synchronized (zzaib.class) {
            if (!zzb) {
                int i2 = 2;
                if (zzaht.zza >= 24 && ((zzaht.zza >= 26 || (!"samsung".equals(zzaht.zzc) && !"XT1650".equals(zzaht.zzd))) && ((zzaht.zza >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    if (zzaht.zza >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i2 = 1;
                    }
                    zza = i2;
                    zzb = true;
                }
                i2 = 0;
                zza = i2;
                zzb = true;
            }
            i = zza;
        }
        return i != 0;
    }

    public static zzaib zzb(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zza(context)) {
            z2 = false;
        }
        zzafs.zzd(z2);
        return new zzaia().zza(z ? zza : 0);
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
