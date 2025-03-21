package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzaoo {
    private final zzalu[] zza;
    private final zzalv zzb;
    private zzalu zzc;

    public zzaoo(zzalu[] zzaluVarArr, zzalv zzalvVar) {
        this.zza = zzaluVarArr;
        this.zzb = zzalvVar;
    }

    public final void zza() {
        if (this.zzc != null) {
            this.zzc = null;
        }
    }

    public final zzalu zzb(zzalt zzaltVar, Uri uri) throws IOException, InterruptedException {
        zzalu zzaluVar = this.zzc;
        if (zzaluVar != null) {
            return zzaluVar;
        }
        zzalu[] zzaluVarArr = this.zza;
        int length = zzaluVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzalu zzaluVar2 = zzaluVarArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                zzaltVar.zzg();
                throw th;
            }
            if (zzaluVar2.zzf(zzaltVar)) {
                this.zzc = zzaluVar2;
                zzaltVar.zzg();
                break;
            }
            continue;
            zzaltVar.zzg();
            i++;
        }
        zzalu zzaluVar3 = this.zzc;
        if (zzaluVar3 == null) {
            String zzn = zzarj.zzn(this.zza);
            StringBuilder sb = new StringBuilder(String.valueOf(zzn).length() + 58);
            sb.append("None of the available extractors (");
            sb.append(zzn);
            sb.append(") could read the stream.");
            throw new zzapm(sb.toString(), uri);
        }
        zzaluVar3.zzd(this.zzb);
        return this.zzc;
    }
}
