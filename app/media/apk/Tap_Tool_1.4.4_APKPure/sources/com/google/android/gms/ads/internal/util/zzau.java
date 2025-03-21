package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzdsf;
import com.google.android.gms.internal.ads.zzflb;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzau {
    private final Context zza;
    private final zzdsf zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzau(Context context) {
        this.zzg = 0;
        this.zzl = new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzae
            private final zzau zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzr();
            }
        };
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzs.zzq().zza();
        this.zzk = com.google.android.gms.ads.internal.zzs.zzq().zzb();
        this.zzb = com.google.android.gms.ads.internal.zzs.zzm().zzb();
    }

    private final boolean zzs(float f, float f2, float f3, float f4) {
        return Math.abs(this.zzi.x - f) < ((float) this.zzh) && Math.abs(this.zzi.y - f2) < ((float) this.zzh) && Math.abs(this.zzj.x - f3) < ((float) this.zzh) && Math.abs(this.zzj.y - f4) < ((float) this.zzh);
    }

    private final void zzt(Context context) {
        ArrayList arrayList = new ArrayList();
        int zzu = zzu(arrayList, "None", true);
        final int zzu2 = zzu(arrayList, "Shake", true);
        final int zzu3 = zzu(arrayList, "Flick", true);
        zzdsb zzdsbVar = zzdsb.NONE;
        int ordinal = this.zzb.zzf().ordinal();
        final int i = ordinal != 1 ? ordinal != 2 ? zzu : zzu3 : zzu2;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, com.google.android.gms.ads.internal.zzs.zze().zzm());
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builder.setTitle("Setup gesture");
        builder.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener(atomicInteger) { // from class: com.google.android.gms.ads.internal.util.zzam
            private final AtomicInteger zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = atomicInteger;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.zza.set(i2);
            }
        });
        builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener(this) { // from class: com.google.android.gms.ads.internal.util.zzan
            private final zzau zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.zza.zzb();
            }
        });
        builder.setPositiveButton("Save", new DialogInterface.OnClickListener(this, atomicInteger, i, zzu2, zzu3) { // from class: com.google.android.gms.ads.internal.util.zzao
            private final zzau zza;
            private final AtomicInteger zzb;
            private final int zzc;
            private final int zzd;
            private final int zze;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = atomicInteger;
                this.zzc = i;
                this.zzd = zzu2;
                this.zze = zzu3;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.zza.zzp(this.zzb, this.zzc, this.zzd, this.zze, dialogInterface, i2);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: com.google.android.gms.ads.internal.util.zzap
            private final zzau zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzb();
            }
        });
        builder.create().show();
    }

    private static final int zzu(List<String> list, String str, boolean z) {
        if (z) {
            list.add(str);
            return list.size() - 1;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzc);
        sb.append(",DebugSignal: ");
        sb.append(this.zzf);
        sb.append(",AFMA Version: ");
        sb.append(this.zze);
        sb.append(",Ad Unit ID: ");
        sb.append(this.zzd);
        sb.append("}");
        return sb.toString();
    }

    public final void zza(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.zzg;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.zzg = 5;
                this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.zzk.postDelayed(this.zzl, ((Long) zzbba.zzc().zzb(zzbfq.zzcS)).longValue());
            }
        } else if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !zzs(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (zzs(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.zzg = -1;
            this.zzk.removeCallbacks(this.zzl);
        }
    }

    public final void zzb() {
        try {
            if (this.zza instanceof Activity) {
                String str = "Creative preview (enabled)";
                if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzs.zzm().zzi())) {
                    str = "Creative preview";
                }
                String str2 = true != com.google.android.gms.ads.internal.zzs.zzm().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
                ArrayList arrayList = new ArrayList();
                final int zzu = zzu(arrayList, "Ad information", true);
                final int zzu2 = zzu(arrayList, str, true);
                final int zzu3 = zzu(arrayList, str2, true);
                boolean booleanValue = ((Boolean) zzbba.zzc().zzb(zzbfq.zzgj)).booleanValue();
                final int zzu4 = zzu(arrayList, "Open ad inspector", booleanValue);
                final int zzu5 = zzu(arrayList, "Ad inspector settings", booleanValue);
                AlertDialog.Builder builder = new AlertDialog.Builder(this.zza, com.google.android.gms.ads.internal.zzs.zze().zzm());
                builder.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener(this, zzu, zzu2, zzu3, zzu4, zzu5) { // from class: com.google.android.gms.ads.internal.util.zzal
                    private final zzau zza;
                    private final int zzb;
                    private final int zzc;
                    private final int zzd;
                    private final int zze;
                    private final int zzf;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                        this.zzb = zzu;
                        this.zzc = zzu2;
                        this.zzd = zzu3;
                        this.zze = zzu4;
                        this.zzf = zzu5;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, dialogInterface, i);
                    }
                });
                builder.create().show();
                return;
            }
            zze.zzh("Can not create dialog without Activity Context");
        } catch (WindowManager.BadTokenException e) {
            zze.zzb(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    public final void zzc(String str) {
        this.zzd = str;
    }

    public final void zzd(String str) {
        this.zze = str;
    }

    public final void zze(String str) {
        this.zzc = str;
    }

    public final void zzf(String str) {
        this.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        zzay zzm = com.google.android.gms.ads.internal.zzs.zzm();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        String str3 = this.zzf;
        boolean zzm2 = zzm.zzm();
        zzm.zzl(zzm.zze(context, str, str2));
        if (zzm.zzm()) {
            if (!zzm2 && !TextUtils.isEmpty(str3)) {
                zzm.zzh(context, str2, str3, str);
            }
            zze.zzd("Device is linked for debug signals.");
            zzm.zzn(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzm.zzf(context, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        zzay zzm = com.google.android.gms.ads.internal.zzs.zzm();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        if (!zzm.zzd(context, str, str2)) {
            zzm.zzn(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(zzm.zza)) {
            zze.zzd("Creative is not pushed for this device.");
            zzm.zzn(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzm.zza)) {
            zze.zzd("The app is not linked for creative preview.");
            zzm.zzf(context, str, str2);
        } else if ("0".equals(zzm.zza)) {
            zze.zzd("Device is linked for in app preview.");
            zzm.zzn(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzflb zzflbVar) {
        if (!com.google.android.gms.ads.internal.zzs.zzm().zze(this.zza, this.zzd, this.zze)) {
            com.google.android.gms.ads.internal.zzs.zzm().zzf(this.zza, this.zzd, this.zze);
        } else {
            zzflbVar.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzaj
                private final zzau zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj() {
        zzt(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        zzt(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzflb zzflbVar) {
        if (!com.google.android.gms.ads.internal.zzs.zzm().zze(this.zza, this.zzd, this.zze)) {
            com.google.android.gms.ads.internal.zzs.zzm().zzf(this.zza, this.zzd, this.zze);
        } else {
            zzflbVar.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzak
                private final zzau zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        com.google.android.gms.ads.internal.zzs.zzm().zzc(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn() {
        com.google.android.gms.ads.internal.zzs.zzm().zzc(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(String str, DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzs.zzc();
        zzr.zzO(this.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.zzb.zze(zzdsb.SHAKE);
            } else if (atomicInteger.get() == i3) {
                this.zzb.zze(zzdsb.FLICK);
            } else {
                this.zzb.zze(zzdsb.NONE);
            }
        }
        zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 != i) {
            if (i6 == i2) {
                zze.zzd("Debug mode [Creative Preview] selected.");
                zzccz.zza.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzah
                    private final zzau zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzh();
                    }
                });
            } else if (i6 == i3) {
                zze.zzd("Debug mode [Troubleshooting] selected.");
                zzccz.zza.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzai
                    private final zzau zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzg();
                    }
                });
            } else if (i6 == i4) {
                final zzflb zzflbVar = zzccz.zze;
                zzflb zzflbVar2 = zzccz.zza;
                if (this.zzb.zzn()) {
                    zzflbVar.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzas
                        private final zzau zza;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzn();
                        }
                    });
                } else {
                    zzflbVar2.execute(new Runnable(this, zzflbVar) { // from class: com.google.android.gms.ads.internal.util.zzat
                        private final zzau zza;
                        private final zzflb zzb;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                            this.zzb = zzflbVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzl(this.zzb);
                        }
                    });
                }
            } else if (i6 == i5) {
                final zzflb zzflbVar3 = zzccz.zze;
                zzflb zzflbVar4 = zzccz.zza;
                if (this.zzb.zzn()) {
                    zzflbVar3.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzaf
                        private final zzau zza;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzk();
                        }
                    });
                } else {
                    zzflbVar4.execute(new Runnable(this, zzflbVar3) { // from class: com.google.android.gms.ads.internal.util.zzag
                        private final zzau zza;
                        private final zzflb zzb;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                            this.zzb = zzflbVar3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzi(this.zzb);
                        }
                    });
                }
            }
        } else if (!(this.zza instanceof Activity)) {
            zze.zzh("Can not create dialog without Activity Context");
        } else {
            String str = this.zzc;
            final String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                com.google.android.gms.ads.internal.zzs.zzc();
                Map<String, String> zzQ = zzr.zzQ(build);
                for (String str3 : zzQ.keySet()) {
                    sb.append(str3);
                    sb.append(" = ");
                    sb.append(zzQ.get(str3));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.zza);
            builder.setMessage(str2);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new DialogInterface.OnClickListener(this, str2) { // from class: com.google.android.gms.ads.internal.util.zzaq
                private final zzau zza;
                private final String zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = str2;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i7) {
                    this.zza.zzo(this.zzb, dialogInterface2, i7);
                }
            });
            builder.setNegativeButton("Close", zzar.zza);
            builder.create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzr() {
        this.zzg = 4;
        zzb();
    }

    public zzau(Context context, String str) {
        this(context);
        this.zzc = str;
    }
}
