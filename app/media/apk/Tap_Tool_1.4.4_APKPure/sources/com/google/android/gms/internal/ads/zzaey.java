package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzaey extends IOException {
    public final zzaej zza;

    public zzaey(IOException iOException, zzaej zzaejVar, int i) {
        super(iOException);
        this.zza = zzaejVar;
    }

    public zzaey(String str, zzaej zzaejVar, int i) {
        super(str);
        this.zza = zzaejVar;
    }

    public zzaey(String str, IOException iOException, zzaej zzaejVar, int i) {
        super(str, iOException);
        this.zza = zzaejVar;
    }
}
