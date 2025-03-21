package com.google.android.gms.ads.internal.util;

import android.os.Environment;
import android.os.StatFs;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzac
    public boolean zzg(View view) {
        return super.zzg(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final int zzh() {
        return 14;
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final long zzi() {
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
    }
}
