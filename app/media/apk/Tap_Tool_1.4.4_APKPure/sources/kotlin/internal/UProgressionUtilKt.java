package kotlin.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UnsignedKt;
/* compiled from: UProgressionUtil.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getProgressionLastElement-Nkh28Cs", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA  reason: not valid java name */
    private static final int m1210differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int m370uintRemainderJ1ME1BU = UnsignedKt.m370uintRemainderJ1ME1BU(i, i3);
        int m370uintRemainderJ1ME1BU2 = UnsignedKt.m370uintRemainderJ1ME1BU(i2, i3);
        int uintCompare = UnsignedKt.uintCompare(m370uintRemainderJ1ME1BU, m370uintRemainderJ1ME1BU2);
        int m116constructorimpl = UInt.m116constructorimpl(m370uintRemainderJ1ME1BU - m370uintRemainderJ1ME1BU2);
        return uintCompare >= 0 ? m116constructorimpl : UInt.m116constructorimpl(m116constructorimpl + i3);
    }

    /* renamed from: differenceModulo-sambcqE  reason: not valid java name */
    private static final long m1211differenceModulosambcqE(long j, long j2, long j3) {
        long m372ulongRemaindereb3DHEI = UnsignedKt.m372ulongRemaindereb3DHEI(j, j3);
        long m372ulongRemaindereb3DHEI2 = UnsignedKt.m372ulongRemaindereb3DHEI(j2, j3);
        int ulongCompare = UnsignedKt.ulongCompare(m372ulongRemaindereb3DHEI, m372ulongRemaindereb3DHEI2);
        long m194constructorimpl = ULong.m194constructorimpl(m372ulongRemaindereb3DHEI - m372ulongRemaindereb3DHEI2);
        return ulongCompare >= 0 ? m194constructorimpl : ULong.m194constructorimpl(m194constructorimpl + j3);
    }

    /* renamed from: getProgressionLastElement-Nkh28Cs  reason: not valid java name */
    public static final int m1213getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            return UnsignedKt.uintCompare(i, i2) >= 0 ? i2 : UInt.m116constructorimpl(i2 - m1210differenceModuloWZ9TVnA(i2, i, UInt.m116constructorimpl(i3)));
        } else if (i3 < 0) {
            return UnsignedKt.uintCompare(i, i2) <= 0 ? i2 : UInt.m116constructorimpl(i2 + m1210differenceModuloWZ9TVnA(i, i2, UInt.m116constructorimpl(-i3)));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    /* renamed from: getProgressionLastElement-7ftBX0g  reason: not valid java name */
    public static final long m1212getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            return UnsignedKt.ulongCompare(j, j2) >= 0 ? j2 : ULong.m194constructorimpl(j2 - m1211differenceModulosambcqE(j2, j, ULong.m194constructorimpl(j3)));
        } else if (i < 0) {
            return UnsignedKt.ulongCompare(j, j2) <= 0 ? j2 : ULong.m194constructorimpl(j2 + m1211differenceModulosambcqE(j, j2, ULong.m194constructorimpl(-j3)));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
