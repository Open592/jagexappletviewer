package com.jagex.client;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class46_Sub4 extends Class46 {

	@OriginalMember(owner = "client!th", name = "B", descriptor = "Lclient!bc;")
	private final Class19_Sub1 aClass19_Sub1_10;

	@OriginalMember(owner = "client!th", name = "y", descriptor = "[I")
	private final int[] anIntArray493;

	@OriginalMember(owner = "client!th", name = "z", descriptor = "[I")
	private final int[] anIntArray494;

	@OriginalMember(owner = "client!th", name = "x", descriptor = "[[B")
	private final byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "[I")
	private final int[] anIntArray492;

	@OriginalMember(owner = "client!th", name = "A", descriptor = "[I")
	private final int[] anIntArray495;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!bc;Lclient!gt;[Lclient!bb;[I[I)V")
	public Class46_Sub4(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) Class18[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		super(arg0, arg1);
		this.aClass19_Sub1_10 = arg0;
		this.anIntArray493 = arg3;
		this.anIntArray494 = arg4;
		this.aByteArrayArray27 = new byte[arg2.length][];
		this.anIntArray492 = new int[arg2.length];
		this.anIntArray495 = new int[arg2.length];
		for (@Pc(29) int local29 = 0; local29 < arg2.length; local29++) {
			this.aByteArrayArray27[local29] = arg2[local29].aByteArray4;
			this.anIntArray492[local29] = arg2[local29].anInt370;
			this.anIntArray495[local29] = arg2[local29].anInt368;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([B[IIIIIIII)V")
	private void method5065(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			for (@Pc(69) int local69 = local9; local69 < 0; local69++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!th", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		arg1 += this.anIntArray495[arg0];
		arg2 += this.anIntArray492[arg0];
		@Pc(18) int local18 = this.anIntArray493[arg0];
		@Pc(23) int local23 = this.anIntArray494[arg0];
		@Pc(27) int local27 = this.aClass19_Sub1_10.anInt430;
		@Pc(33) int local33 = arg1 + arg2 * local27;
		@Pc(37) int local37 = local27 - local18;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg2 < this.aClass19_Sub1_10.anInt425) {
			local52 = this.aClass19_Sub1_10.anInt425 - arg2;
			local23 -= local52;
			arg2 = this.aClass19_Sub1_10.anInt425;
			local41 += local52 * local18;
			local33 += local52 * local27;
		}
		if (arg2 + local23 > this.aClass19_Sub1_10.anInt421) {
			local23 -= arg2 + local23 - this.aClass19_Sub1_10.anInt421;
		}
		if (arg1 < this.aClass19_Sub1_10.lb) {
			local52 = this.aClass19_Sub1_10.lb - arg1;
			local18 -= local52;
			arg1 = this.aClass19_Sub1_10.lb;
			local41 += local52;
			local33 += local52;
			local39 += local52;
			local37 += local52;
		}
		if (arg1 + local18 > this.aClass19_Sub1_10.anInt402) {
			local52 = arg1 + local18 - this.aClass19_Sub1_10.anInt402;
			local18 -= local52;
			local39 += local52;
			local37 += local52;
		}
		if (local18 <= 0 || local23 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method5065(this.aByteArrayArray27[arg0], this.aClass19_Sub1_10.anIntArray26, arg3, local41, local33, local18, local23, local37, local39);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method5068(this.aByteArrayArray27[arg0], this.aClass19_Sub1_10.anIntArray26, arg3, local41, local33, local18, local23, local37, local39);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(CIIIZLclient!ma;II)V")
	@Override
	protected void method5051(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class145 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg5 == null) {
			this.OA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray495[arg0];
		arg2 += this.anIntArray492[arg0];
		@Pc(28) int local28 = this.anIntArray493[arg0];
		@Pc(33) int local33 = this.anIntArray494[arg0];
		@Pc(37) int local37 = this.aClass19_Sub1_10.anInt430;
		@Pc(43) int local43 = arg1 + arg2 * local37;
		@Pc(47) int local47 = local37 - local28;
		@Pc(49) int local49 = 0;
		@Pc(51) int local51 = 0;
		@Pc(62) int local62;
		if (arg2 < this.aClass19_Sub1_10.anInt425) {
			local62 = this.aClass19_Sub1_10.anInt425 - arg2;
			local33 -= local62;
			arg2 = this.aClass19_Sub1_10.anInt425;
			local51 = local62 * local28;
			local43 += local62 * local37;
		}
		if (arg2 + local33 > this.aClass19_Sub1_10.anInt421) {
			local33 -= arg2 + local33 - this.aClass19_Sub1_10.anInt421;
		}
		if (arg1 < this.aClass19_Sub1_10.lb) {
			local62 = this.aClass19_Sub1_10.lb - arg1;
			local28 -= local62;
			arg1 = this.aClass19_Sub1_10.lb;
			local51 += local62;
			local43 += local62;
			local49 = local62;
			local47 += local62;
		}
		if (arg1 + local28 > this.aClass19_Sub1_10.anInt402) {
			local62 = arg1 + local28 - this.aClass19_Sub1_10.anInt402;
			local28 -= local62;
			local49 += local62;
			local47 += local62;
		}
		if (local28 <= 0 || local33 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method5066(this.aByteArrayArray27[arg0], this.aClass19_Sub1_10.anIntArray26, arg3, local51, local43, local28, local33, local47, local49, arg1, arg2, this.anIntArray493[arg0], arg5, arg6, arg7);
		} else {
			this.method5067(this.aByteArrayArray27[arg0], this.aClass19_Sub1_10.anIntArray26, arg3, local51, local43, local28, local33, local47, local49, arg1, arg2, this.anIntArray493[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([B[IIIIIIIIIIILclient!ma;II)V")
	private void method5066(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class145 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class145_Sub2 local2 = (Class145_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray554;
		@Pc(8) int[] local8 = local2.anIntArray553;
		@Pc(10) int local10 = arg10;
		if (arg14 > arg10) {
			local10 = arg14;
			arg4 += (arg14 - arg10) * this.aClass19_Sub1_10.anInt430;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(50) int local50 = arg14 + local5.length < arg10 + arg6 ? arg14 + local5.length : arg10 + arg6;
		for (@Pc(52) int local52 = local10; local52 < local50; local52++) {
			@Pc(61) int local61 = arg13 + local5[local52 - arg14];
			@Pc(67) int local67 = local8[local52 - arg14];
			@Pc(69) int local69 = arg5;
			@Pc(76) int local76;
			if (arg9 > local61) {
				local76 = arg9 - local61;
				if (local76 >= local67) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				local67 -= local76;
			} else {
				local76 = local61 - arg9;
				if (local76 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				arg3 += local76;
				local69 = arg5 - local76;
				arg4 += local76;
			}
			local76 = 0;
			if (local69 < local67) {
				local67 = local69;
			} else {
				local76 = local69 - local67;
			}
			for (@Pc(143) int local143 = 0; local143 < local67; local143++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += local76 + arg8;
			arg4 += local76 + arg7;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "([B[IIIIIIIIIIILclient!ma;II)V")
	private void method5067(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class145 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class145_Sub2 local2 = (Class145_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray554;
		@Pc(8) int[] local8 = local2.anIntArray553;
		@Pc(14) int local14 = arg9 - this.aClass19_Sub1_10.lb;
		@Pc(16) int local16 = arg10;
		if (arg14 > arg10) {
			local16 = arg14;
			arg4 += (arg14 - arg10) * this.aClass19_Sub1_10.anInt430;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(56) int local56 = arg14 + local5.length < arg10 + arg6 ? arg14 + local5.length : arg10 + arg6;
		@Pc(60) int local60 = arg2 >>> 24;
		@Pc(64) int local64 = 255 - local60;
		for (@Pc(66) int local66 = local16; local66 < local56; local66++) {
			@Pc(75) int local75 = local5[local66 - arg14] + arg13;
			@Pc(81) int local81 = local8[local66 - arg14];
			@Pc(83) int local83 = arg5;
			@Pc(90) int local90;
			if (local14 > local75) {
				local90 = local14 - local75;
				if (local90 >= local81) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				local81 -= local90;
			} else {
				local90 = local75 - local14;
				if (local90 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				arg3 += local90;
				local83 = arg5 - local90;
				arg4 += local90;
			}
			local90 = 0;
			if (local83 < local81) {
				local81 = local83;
			} else {
				local90 = local83 - local81;
			}
			for (@Pc(158) int local158 = -local81; local158 < 0; local158++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(182) int local182 = ((arg2 & 0xFF00FF) * local60 & 0xFF00FF00) + ((arg2 & 0xFF00) * local60 & 0xFF0000) >> 8;
					@Pc(186) int local186 = arg1[arg4];
					arg1[arg4++] = (((local186 & 0xFF00FF) * local64 & 0xFF00FF00) + ((local186 & 0xFF00) * local64 & 0xFF0000) >> 8) + local182;
				}
			}
			arg3 += local90 + arg8;
			arg4 += local90 + arg7;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "([B[IIIIIIII)V")
	private void method5068(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		for (@Pc(10) int local10 = -arg6; local10 < 0; local10++) {
			for (@Pc(14) int local14 = -arg5; local14 < 0; local14++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(38) int local38 = ((arg2 & 0xFF00FF) * local3 & 0xFF00FF00) + ((arg2 & 0xFF00) * local3 & 0xFF0000) >> 8;
					@Pc(42) int local42 = arg1[arg4];
					arg1[arg4++] = (((local42 & 0xFF00FF) * local7 & 0xFF00FF00) + ((local42 & 0xFF00) * local7 & 0xFF0000) >> 8) + local38;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}
}
