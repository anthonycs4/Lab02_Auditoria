package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgg extends zzhg {
    private final Activity zzi;
    private final View zzj;

    public zzgg(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2, View view, Activity activity) {
        super(zzfyVar, "1qMISOTSx5LOeeGh6nSz8PYEzoejuRAC4EdfuciyBbkI+FHNWZcPaORqu4cM0K/u", "IM/hCZ+LcSDatkBfeN3nTF1nFLmV/4whLclWEAX4BNg=", zzcnVar, i, 62);
        this.zzj = view;
        this.zzi = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzj == null) {
            return;
        }
        boolean booleanValue = ((Boolean) zzbba.zzc().zzb(zzbfq.zzbD)).booleanValue();
        Object[] objArr = (Object[]) this.zzf.invoke(null, this.zzj, this.zzi, Boolean.valueOf(booleanValue));
        synchronized (this.zze) {
            this.zze.zzS(((Long) objArr[0]).longValue());
            this.zze.zzT(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.zze.zzU((String) objArr[2]);
            }
        }
    }
}
