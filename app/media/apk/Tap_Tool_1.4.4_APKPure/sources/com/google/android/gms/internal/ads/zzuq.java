package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzuq implements zzwe {
    private final List<zzjq> zza;

    public zzuq() {
        this(0);
    }

    private final zzvu zzb(zzwd zzwdVar) {
        return new zzvu(zzd(zzwdVar));
    }

    private final zzwi zzc(zzwd zzwdVar) {
        return new zzwi(zzd(zzwdVar));
    }

    private final List<zzjq> zzd(zzwd zzwdVar) {
        String str;
        int i;
        List<byte[]> list;
        zzahd zzahdVar = new zzahd(zzwdVar.zzd);
        List<zzjq> list2 = this.zza;
        while (zzahdVar.zzd() > 0) {
            int zzn = zzahdVar.zzn();
            int zzg = zzahdVar.zzg() + zzahdVar.zzn();
            if (zzn == 134) {
                list2 = new ArrayList<>();
                int zzn2 = zzahdVar.zzn() & 31;
                for (int i2 = 0; i2 < zzn2; i2++) {
                    String zzE = zzahdVar.zzE(3, zzfeg.zzc);
                    int zzn3 = zzahdVar.zzn();
                    int i3 = zzn3 & 128;
                    if (i3 != 0) {
                        i = zzn3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzn4 = (byte) zzahdVar.zzn();
                    zzahdVar.zzk(1);
                    if (i3 != 0) {
                        int i4 = zzafu.zza;
                        list = Collections.singletonList((zzn4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzjp zzjpVar = new zzjp();
                    zzjpVar.zzj(str);
                    zzjpVar.zzd(zzE);
                    zzjpVar.zzB(i);
                    zzjpVar.zzl(list);
                    list2.add(zzjpVar.zzD());
                }
            }
            zzahdVar.zzh(zzg);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final zzwg zza(int i, zzwd zzwdVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzvk(new zzvh(zzwdVar.zzb));
            }
            if (i != 21) {
                if (i != 27) {
                    if (i != 36) {
                        if (i != 89) {
                            if (i != 129) {
                                if (i == 138) {
                                    return new zzvk(new zzur(zzwdVar.zzb));
                                }
                                if (i == 172) {
                                    return new zzvk(new zzum(zzwdVar.zzb));
                                }
                                if (i == 257) {
                                    return new zzvt(new zzvj("application/vnd.dvb.ait"));
                                }
                                if (i == 134) {
                                    return new zzvt(new zzvj("application/x-scte35"));
                                }
                                if (i != 135) {
                                    switch (i) {
                                        case 15:
                                            return new zzvk(new zzup(false, zzwdVar.zzb));
                                        case 16:
                                            return new zzvk(new zzuy(zzc(zzwdVar)));
                                        case 17:
                                            return new zzvk(new zzvg(zzwdVar.zzb));
                                        default:
                                            return null;
                                    }
                                }
                            }
                            return new zzvk(new zzuj(zzwdVar.zzb));
                        }
                        return new zzvk(new zzus(zzwdVar.zzc));
                    }
                    return new zzvk(new zzve(zzb(zzwdVar)));
                }
                return new zzvk(new zzvc(zzb(zzwdVar), false, false));
            }
            return new zzvk(new zzvf());
        }
        return new zzvk(new zzuv(zzc(zzwdVar)));
    }

    public zzuq(int i) {
        this.zza = zzfgz.zzi();
    }
}
