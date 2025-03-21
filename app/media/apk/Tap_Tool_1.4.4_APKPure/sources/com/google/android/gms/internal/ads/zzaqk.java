package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzaqk extends IOException {
    public final zzaqg zza;

    public zzaqk(IOException iOException, zzaqg zzaqgVar, int i) {
        super(iOException);
        this.zza = zzaqgVar;
    }

    public zzaqk(String str, zzaqg zzaqgVar, int i) {
        super(str);
        this.zza = zzaqgVar;
    }

    public zzaqk(String str, IOException iOException, zzaqg zzaqgVar, int i) {
        super(str, iOException);
        this.zza = zzaqgVar;
    }
}
