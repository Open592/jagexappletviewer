package com.jagex.client;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class57_Sub1_Sub2 extends Class57_Sub1 {

	@OriginalMember(owner = "client!nn", name = "E", descriptor = "[I")
	private final int[] anIntArray323;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!bc;[III)V")
	public Class57_Sub1_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anIntArray323 = arg1;
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!bc;[IIIII)V")
	public Class57_Sub1_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg4, arg5);
		this.anIntArray323 = new int[arg4 * arg5];
		@Pc(15) int local15 = arg3 - super.anInt7168;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < arg5; local19++) {
			for (@Pc(22) int local22 = 0; local22 < arg4; local22++) {
				this.anIntArray323[local17++] = arg1[arg2++];
			}
			arg2 += local15;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "([I[III)V")
	@Override
	protected void method5545(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass19_Sub1_11.anIntArray26;
		@Pc(217) int local217;
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		@Pc(29) int local29;
		@Pc(53) int local53;
		@Pc(58) int local58;
		@Pc(64) int local64;
		@Pc(111) int local111;
		@Pc(115) int local115;
		@Pc(119) int local119;
		@Pc(123) int local123;
		if (Static359.anInt7153 == 0) {
			if (Static359.anInt7164 == 0) {
				local9 = Static359.anInt7141;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static359.anInt7156;
						local25 = Static359.anInt7145;
						local27 = Static359.anInt7146;
						local29 = Static359.anInt7151;
						if (local25 >= 0 && local27 >= 0 && local25 - (super.anInt7168 << 12) < 0 && local27 - (super.anInt7144 << 12) < 0) {
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static359.anInt7156 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static359.anInt7153 * local64;
								local27 += Static359.anInt7164 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray323[(local27 >> 12) * super.anInt7168 + (local25 >> 12)];
								local115 = local111 >>> 24;
								local119 = 256 - local115;
								local123 = local3[local23];
								local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
								local29++;
							}
						}
					}
					local9++;
					Static359.anInt7156 += Static359.anInt7154;
				}
			} else if (Static359.anInt7164 < 0) {
				local9 = Static359.anInt7141;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static359.anInt7156;
						local25 = Static359.anInt7145;
						local27 = Static359.anInt7146 + Static359.anInt7142;
						local29 = Static359.anInt7151;
						if (local25 >= 0 && local25 - (super.anInt7168 << 12) < 0) {
							@Pc(210) int local210;
							if ((local210 = local27 - (super.anInt7144 << 12)) >= 0) {
								local217 = (Static359.anInt7164 - local210) / Static359.anInt7164;
								local29 += local217;
								local27 += Static359.anInt7164 * local217;
								local23 += local217;
							}
							@Pc(238) int local238;
							if ((local238 = (local27 - Static359.anInt7164) / Static359.anInt7164) > local29) {
								local29 = local238;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static359.anInt7156 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static359.anInt7153 * local64;
								local27 += Static359.anInt7164 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray323[(local27 >> 12) * super.anInt7168 + (local25 >> 12)];
								local115 = local111 >>> 24;
								local119 = 256 - local115;
								local123 = local3[local23];
								local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
								local27 += Static359.anInt7164;
								local29++;
							}
						}
					}
					local9++;
					Static359.anInt7145 += Static359.anInt7169;
					Static359.anInt7156 += Static359.anInt7154;
				}
			} else {
				local9 = Static359.anInt7141;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static359.anInt7156;
						local25 = Static359.anInt7145;
						local27 = Static359.anInt7146 + Static359.anInt7142;
						local29 = Static359.anInt7151;
						if (local25 >= 0 && local25 - (super.anInt7168 << 12) < 0) {
							if (local27 < 0) {
								local217 = (Static359.anInt7164 - local27 - 1) / Static359.anInt7164;
								local29 += local217;
								local27 += Static359.anInt7164 * local217;
								local23 += local217;
							}
							@Pc(441) int local441;
							if ((local441 = (local27 + 1 - (super.anInt7144 << 12) - Static359.anInt7164) / Static359.anInt7164) > local29) {
								local29 = local441;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static359.anInt7156 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static359.anInt7153 * local64;
								local27 += Static359.anInt7164 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray323[(local27 >> 12) * super.anInt7168 + (local25 >> 12)];
								local115 = local111 >>> 24;
								local119 = 256 - local115;
								local123 = local3[local23];
								local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
								local27 += Static359.anInt7164;
								local29++;
							}
						}
					}
					local9++;
					Static359.anInt7145 += Static359.anInt7169;
					Static359.anInt7156 += Static359.anInt7154;
				}
			}
		} else if (Static359.anInt7153 < 0) {
			if (Static359.anInt7164 == 0) {
				local9 = Static359.anInt7141;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static359.anInt7156;
						local25 = Static359.anInt7145 + Static359.anInt7143;
						local27 = Static359.anInt7146;
						local29 = Static359.anInt7151;
						if (local27 >= 0 && local27 - (super.anInt7144 << 12) < 0) {
							@Pc(618) int local618;
							if ((local618 = local25 - (super.anInt7168 << 12)) >= 0) {
								local217 = (Static359.anInt7153 - local618) / Static359.anInt7153;
								local29 += local217;
								local25 += Static359.anInt7153 * local217;
								local23 += local217;
							}
							@Pc(646) int local646;
							if ((local646 = (local25 - Static359.anInt7153) / Static359.anInt7153) > local29) {
								local29 = local646;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static359.anInt7156 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static359.anInt7153 * local64;
								local27 += Static359.anInt7164 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray323[(local27 >> 12) * super.anInt7168 + (local25 >> 12)];
								local115 = local111 >>> 24;
								local119 = 256 - local115;
								local123 = local3[local23];
								local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
								local25 += Static359.anInt7153;
								local29++;
							}
						}
					}
					local9++;
					Static359.anInt7146 += Static359.anInt7150;
					Static359.anInt7156 += Static359.anInt7154;
				}
			} else if (Static359.anInt7164 < 0) {
				local9 = Static359.anInt7141;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static359.anInt7156;
						local25 = Static359.anInt7145 + Static359.anInt7143;
						local27 = Static359.anInt7146 + Static359.anInt7142;
						local29 = Static359.anInt7151;
						@Pc(814) int local814;
						if ((local814 = local25 - (super.anInt7168 << 12)) >= 0) {
							local217 = (Static359.anInt7153 - local814) / Static359.anInt7153;
							local29 += local217;
							local25 += Static359.anInt7153 * local217;
							local27 += Static359.anInt7164 * local217;
							local23 += local217;
						}
						@Pc(848) int local848;
						if ((local848 = (local25 - Static359.anInt7153) / Static359.anInt7153) > local29) {
							local29 = local848;
						}
						@Pc(860) int local860;
						if ((local860 = local27 - (super.anInt7144 << 12)) >= 0) {
							local217 = (Static359.anInt7164 - local860) / Static359.anInt7164;
							local29 += local217;
							local25 += Static359.anInt7153 * local217;
							local27 += Static359.anInt7164 * local217;
							local23 += local217;
						}
						@Pc(894) int local894;
						if ((local894 = (local27 - Static359.anInt7164) / Static359.anInt7164) > local29) {
							local29 = local894;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static359.anInt7156 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static359.anInt7153 * local64;
							local27 += Static359.anInt7164 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray323[(local27 >> 12) * super.anInt7168 + (local25 >> 12)];
							local115 = local111 >>> 24;
							local119 = 256 - local115;
							local123 = local3[local23];
							local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
							local25 += Static359.anInt7153;
							local27 += Static359.anInt7164;
							local29++;
						}
					}
					local9++;
					Static359.anInt7145 += Static359.anInt7169;
					Static359.anInt7146 += Static359.anInt7150;
					Static359.anInt7156 += Static359.anInt7154;
				}
			} else {
				local9 = Static359.anInt7141;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static359.anInt7156;
						local25 = Static359.anInt7145 + Static359.anInt7143;
						local27 = Static359.anInt7146 + Static359.anInt7142;
						local29 = Static359.anInt7151;
						@Pc(1068) int local1068;
						if ((local1068 = local25 - (super.anInt7168 << 12)) >= 0) {
							local217 = (Static359.anInt7153 - local1068) / Static359.anInt7153;
							local29 += local217;
							local25 += Static359.anInt7153 * local217;
							local27 += Static359.anInt7164 * local217;
							local23 += local217;
						}
						@Pc(1102) int local1102;
						if ((local1102 = (local25 - Static359.anInt7153) / Static359.anInt7153) > local29) {
							local29 = local1102;
						}
						if (local27 < 0) {
							local217 = (Static359.anInt7164 - local27 - 1) / Static359.anInt7164;
							local29 += local217;
							local25 += Static359.anInt7153 * local217;
							local27 += Static359.anInt7164 * local217;
							local23 += local217;
						}
						@Pc(1150) int local1150;
						if ((local1150 = (local27 + 1 - (super.anInt7144 << 12) - Static359.anInt7164) / Static359.anInt7164) > local29) {
							local29 = local1150;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static359.anInt7156 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static359.anInt7153 * local64;
							local27 += Static359.anInt7164 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray323[(local27 >> 12) * super.anInt7168 + (local25 >> 12)];
							local115 = local111 >>> 24;
							local119 = 256 - local115;
							local123 = local3[local23];
							local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
							local25 += Static359.anInt7153;
							local27 += Static359.anInt7164;
							local29++;
						}
					}
					local9++;
					Static359.anInt7145 += Static359.anInt7169;
					Static359.anInt7146 += Static359.anInt7150;
					Static359.anInt7156 += Static359.anInt7154;
				}
			}
		} else if (Static359.anInt7164 == 0) {
			local9 = Static359.anInt7141;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static359.anInt7156;
					local25 = Static359.anInt7145 + Static359.anInt7143;
					local27 = Static359.anInt7146;
					local29 = Static359.anInt7151;
					if (local27 >= 0 && local27 - (super.anInt7144 << 12) < 0) {
						if (local25 < 0) {
							local217 = (Static359.anInt7153 - local25 - 1) / Static359.anInt7153;
							local29 += local217;
							local25 += Static359.anInt7153 * local217;
							local23 += local217;
						}
						@Pc(1363) int local1363;
						if ((local1363 = (local25 + 1 - (super.anInt7168 << 12) - Static359.anInt7153) / Static359.anInt7153) > local29) {
							local29 = local1363;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static359.anInt7156 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static359.anInt7153 * local64;
							local27 += Static359.anInt7164 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray323[(local27 >> 12) * super.anInt7168 + (local25 >> 12)];
							local115 = local111 >>> 24;
							local119 = 256 - local115;
							local123 = local3[local23];
							local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
							local25 += Static359.anInt7153;
							local29++;
						}
					}
				}
				local9++;
				Static359.anInt7145 += Static359.anInt7169;
				Static359.anInt7146 += Static359.anInt7150;
				Static359.anInt7156 += Static359.anInt7154;
			}
		} else if (Static359.anInt7164 < 0) {
			local9 = Static359.anInt7141;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static359.anInt7156;
					local25 = Static359.anInt7145 + Static359.anInt7143;
					local27 = Static359.anInt7146 + Static359.anInt7142;
					local29 = Static359.anInt7151;
					if (local25 < 0) {
						local217 = (Static359.anInt7153 - local25 - 1) / Static359.anInt7153;
						local29 += local217;
						local25 += Static359.anInt7153 * local217;
						local27 += Static359.anInt7164 * local217;
						local23 += local217;
					}
					@Pc(1571) int local1571;
					if ((local1571 = (local25 + 1 - (super.anInt7168 << 12) - Static359.anInt7153) / Static359.anInt7153) > local29) {
						local29 = local1571;
					}
					@Pc(1583) int local1583;
					if ((local1583 = local27 - (super.anInt7144 << 12)) >= 0) {
						local217 = (Static359.anInt7164 - local1583) / Static359.anInt7164;
						local29 += local217;
						local25 += Static359.anInt7153 * local217;
						local27 += Static359.anInt7164 * local217;
						local23 += local217;
					}
					@Pc(1617) int local1617;
					if ((local1617 = (local27 - Static359.anInt7164) / Static359.anInt7164) > local29) {
						local29 = local1617;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static359.anInt7156 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static359.anInt7153 * local64;
						local27 += Static359.anInt7164 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.anIntArray323[(local27 >> 12) * super.anInt7168 + (local25 >> 12)];
						local115 = local111 >>> 24;
						local119 = 256 - local115;
						local123 = local3[local23];
						local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
						local25 += Static359.anInt7153;
						local27 += Static359.anInt7164;
						local29++;
					}
				}
				local9++;
				Static359.anInt7145 += Static359.anInt7169;
				Static359.anInt7146 += Static359.anInt7150;
				Static359.anInt7156 += Static359.anInt7154;
			}
		} else {
			local9 = Static359.anInt7141;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static359.anInt7156;
					local25 = Static359.anInt7145 + Static359.anInt7143;
					local27 = Static359.anInt7146 + Static359.anInt7142;
					local29 = Static359.anInt7151;
					if (local25 < 0) {
						local217 = (Static359.anInt7153 - local25 - 1) / Static359.anInt7153;
						local29 += local217;
						local25 += Static359.anInt7153 * local217;
						local27 += Static359.anInt7164 * local217;
						local23 += local217;
					}
					@Pc(1827) int local1827;
					if ((local1827 = (local25 + 1 - (super.anInt7168 << 12) - Static359.anInt7153) / Static359.anInt7153) > local29) {
						local29 = local1827;
					}
					if (local27 < 0) {
						local217 = (Static359.anInt7164 - local27 - 1) / Static359.anInt7164;
						local29 += local217;
						local25 += Static359.anInt7153 * local217;
						local27 += Static359.anInt7164 * local217;
						local23 += local217;
					}
					@Pc(1875) int local1875;
					if ((local1875 = (local27 + 1 - (super.anInt7144 << 12) - Static359.anInt7164) / Static359.anInt7164) > local29) {
						local29 = local1875;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static359.anInt7156 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static359.anInt7153 * local64;
						local27 += Static359.anInt7164 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.anIntArray323[(local27 >> 12) * super.anInt7168 + (local25 >> 12)];
						local115 = local111 >>> 24;
						local119 = 256 - local115;
						local123 = local3[local23];
						local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
						local25 += Static359.anInt7153;
						local27 += Static359.anInt7164;
						local29++;
					}
				}
				local9++;
				Static359.anInt7145 += Static359.anInt7169;
				Static359.anInt7146 += Static359.anInt7150;
				Static359.anInt7156 += Static359.anInt7154;
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(13) int local13;
		@Pc(23) int local23;
		@Pc(25) int local25;
		if (arg2 == 0) {
			local5 = super.aClass19_Sub1_11.anIntArray26;
			for (local7 = 0; local7 < super.anInt7144; local7++) {
				local13 = local7 * super.anInt7168;
				local23 = (arg1 + local7) * super.aClass19_Sub1_11.anInt430 + arg0;
				for (local25 = 0; local25 < super.anInt7168; local25++) {
					this.anIntArray323[local13 + local25] = this.anIntArray323[local13 + local25] & 0xFFFFFF | (local5[local23 + local25] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 3) {
			local5 = super.aClass19_Sub1_11.anIntArray26;
			for (local7 = 0; local7 < super.anInt7144; local7++) {
				local13 = local7 * super.anInt7168;
				local23 = (arg1 + local7) * super.aClass19_Sub1_11.anInt430 + arg0;
				for (local25 = 0; local25 < super.anInt7168; local25++) {
					this.anIntArray323[local13 + local25] = this.anIntArray323[local13 + local25] & 0xFFFFFF | (local5[local23 + local25] == 0 ? 0 : -16777216);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "(IIIII)V")
	@Override
	public void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass19_Sub1_11.method489()) {
			throw new IllegalStateException();
		}
		@Pc(11) int local11 = super.aClass19_Sub1_11.anInt430;
		arg0 += super.anInt7157;
		arg1 += super.anInt7148;
		@Pc(27) int local27 = arg1 * local11 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = super.anInt7144;
		@Pc(35) int local35 = super.anInt7168;
		@Pc(39) int local39 = local11 - local35;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg1 < super.aClass19_Sub1_11.anInt425) {
			local52 = super.aClass19_Sub1_11.anInt425 - arg1;
			local32 -= local52;
			arg1 = super.aClass19_Sub1_11.anInt425;
			local29 += local52 * local35;
			local27 += local52 * local11;
		}
		if (arg1 + local32 > super.aClass19_Sub1_11.anInt421) {
			local32 -= arg1 + local32 - super.aClass19_Sub1_11.anInt421;
		}
		if (arg0 < super.aClass19_Sub1_11.lb) {
			local52 = super.aClass19_Sub1_11.lb - arg0;
			local35 -= local52;
			arg0 = super.aClass19_Sub1_11.lb;
			local29 += local52;
			local27 += local52;
			local41 += local52;
			local39 += local52;
		}
		if (arg0 + local35 > super.aClass19_Sub1_11.anInt402) {
			local52 = arg0 + local35 - super.aClass19_Sub1_11.anInt402;
			local35 -= local52;
			local41 += local52;
			local39 += local52;
		}
		if (local35 <= 0 || local32 <= 0) {
			return;
		}
		@Pc(160) int[] local160 = super.aClass19_Sub1_11.anIntArray26;
		@Pc(492) int local492;
		@Pc(496) int local496;
		@Pc(503) int local503;
		@Pc(507) int local507;
		@Pc(511) int local511;
		@Pc(515) int local515;
		if (arg2 == 1) {
			for (local492 = -local32; local492 < 0; local492++) {
				for (local496 = -local35; local496 < 0; local496++) {
					local503 = this.anIntArray323[local29++];
					local507 = local503 >>> 24;
					local511 = 256 - local507;
					local515 = local160[local27];
					local160[local27++] = ((local503 & 0xFF00FF) * local507 + (local515 & 0xFF00FF) * local511 & 0xFF00FF00) + ((local503 & 0xFF00) * local507 + (local515 & 0xFF00) * local511 & 0xFF0000) >> 8;
				}
				local27 += local39;
				local29 += local41;
			}
			return;
		}
		@Pc(690) int local690;
		@Pc(694) int local694;
		@Pc(705) int local705;
		@Pc(713) int local713;
		if (arg2 == 0) {
			if ((arg3 & 0xFFFFFF) == 16777215) {
				for (local492 = -local32; local492 < 0; local492++) {
					for (local496 = -local35; local496 < 0; local496++) {
						local503 = this.anIntArray323[local29++];
						local507 = (local503 >>> 24) * (arg3 >>> 24) >> 8;
						local511 = 256 - local507;
						local515 = local160[local27];
						local160[local27++] = ((local503 & 0xFF00FF) * local507 + (local515 & 0xFF00FF) * local511 & 0xFF00FF00) + ((local503 & 0xFF00) * local507 + (local515 & 0xFF00) * local511 & 0xFF0000) >> 8;
					}
					local27 += local39;
					local29 += local41;
				}
			} else {
				local492 = arg3 >> 16 & 0xFF;
				local496 = arg3 >> 8 & 0xFF;
				local503 = arg3 & 0xFF;
				for (local507 = -local32; local507 < 0; local507++) {
					for (local511 = -local35; local511 < 0; local511++) {
						local515 = this.anIntArray323[local29++];
						local690 = (local515 >>> 24) * (arg3 >>> 24) >> 8;
						local694 = 256 - local690;
						@Pc(721) int local721;
						if (local690 == 255) {
							local705 = (local515 & 0xFF0000) * local492 & 0xFF000000;
							local713 = (local515 & 0xFF00) * local496 & 0xFF0000;
							local721 = (local515 & 0xFF) * local503 & 0xFF00;
							local160[local27++] = (local705 | local713 | local721) >>> 8;
						} else {
							local705 = (local515 & 0xFF0000) * local492 & 0xFF000000;
							local713 = (local515 & 0xFF00) * local496 & 0xFF0000;
							local721 = (local515 & 0xFF) * local503 & 0xFF00;
							local515 = (local705 | local713 | local721) >>> 8;
							@Pc(733) int local733 = local160[local27];
							local160[local27++] = ((local515 & 0xFF00FF) * local690 + (local733 & 0xFF00FF) * local694 & 0xFF00FF00) + ((local515 & 0xFF00) * local690 + (local733 & 0xFF00) * local694 & 0xFF0000) >> 8;
						}
					}
					local27 += local39;
					local29 += local41;
				}
			}
		} else if (arg2 == 3) {
			for (local492 = -local32; local492 < 0; local492++) {
				for (local496 = -local35; local496 < 0; local496++) {
					local503 = this.anIntArray323[local29++];
					local507 = local503 + arg3;
					local511 = (local503 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local515 = (local511 & 0x1000100) + (local507 - local511 & 0x10000);
					local515 = local507 - local515 | local515 - (local515 >>> 8);
					local690 = (local515 >>> 24) * (arg3 >>> 24) >> 8;
					local694 = 256 - local690;
					if (local690 != 255) {
						local503 = local515;
						local515 = local160[local27];
						local515 = ((local503 & 0xFF00FF) * local690 + (local515 & 0xFF00FF) * local694 & 0xFF00FF00) + ((local503 & 0xFF00) * local690 + (local515 & 0xFF00) * local694 & 0xFF0000) >> 8;
					}
					local160[local27++] = local515;
				}
				local27 += local39;
				local29 += local41;
			}
		} else if (arg2 == 2) {
			local492 = arg3 >>> 24;
			local496 = 256 - local492;
			local503 = (arg3 & 0xFF00FF) * local496 & 0xFF00FF00;
			local507 = (arg3 & 0xFF00) * local496 & 0xFF0000;
			@Pc(972) int local972 = (local503 | local507) >>> 8;
			for (local511 = -local32; local511 < 0; local511++) {
				for (local515 = -local35; local515 < 0; local515++) {
					local690 = this.anIntArray323[local29++];
					local694 = local690 >>> 24;
					local705 = 256 - local694;
					local503 = (local690 & 0xFF00FF) * local492 & 0xFF00FF00;
					local507 = (local690 & 0xFF00) * local492 & 0xFF0000;
					@Pc(1018) int local1018 = ((local503 | local507) >>> 8) + local972;
					local713 = local160[local27];
					local160[local27++] = ((local1018 & 0xFF00FF) * local694 + (local713 & 0xFF00FF) * local705 & 0xFF00FF00) + ((local1018 & 0xFF00) * local694 + (local713 & 0xFF00) * local705 & 0xFF0000) >> 8;
				}
				local27 += local39;
				local29 += local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nn", name = "t", descriptor = "(IIIIII)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int[] local3 = super.aClass19_Sub1_11.anIntArray26;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(14) int local14 = (arg1 + local5) * arg2 + arg0;
			@Pc(22) int local22 = (arg5 + local5) * arg2 + arg4;
			for (@Pc(24) int local24 = 0; local24 < arg2; local24++) {
				this.anIntArray323[local14 + local24] = local3[local22 + local24] & 0xFFFFFF;
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IILclient!ma;II)V")
	@Override
	public void method5542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass19_Sub1_11.method489()) {
			throw new IllegalStateException();
		}
		arg0 += super.anInt7157;
		arg1 += super.anInt7148;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = super.aClass19_Sub1_11.anInt430;
		@Pc(26) int local26 = super.anInt7168;
		@Pc(29) int local29 = super.anInt7144;
		@Pc(33) int local33 = local23 - local26;
		@Pc(35) int local35 = 0;
		@Pc(41) int local41 = arg0 + arg1 * local23;
		@Pc(52) int local52;
		if (arg1 < super.aClass19_Sub1_11.anInt425) {
			local52 = super.aClass19_Sub1_11.anInt425 - arg1;
			local29 -= local52;
			arg1 = super.aClass19_Sub1_11.anInt425;
			local19 = local52 * local26;
			local41 += local52 * local23;
		}
		if (arg1 + local29 > super.aClass19_Sub1_11.anInt421) {
			local29 -= arg1 + local29 - super.aClass19_Sub1_11.anInt421;
		}
		if (arg0 < super.aClass19_Sub1_11.lb) {
			local52 = super.aClass19_Sub1_11.lb - arg0;
			local26 -= local52;
			arg0 = super.aClass19_Sub1_11.lb;
			local19 += local52;
			local41 += local52;
			local35 = local52;
			local33 += local52;
		}
		if (arg0 + local26 > super.aClass19_Sub1_11.anInt402) {
			local52 = arg0 + local26 - super.aClass19_Sub1_11.anInt402;
			local26 -= local52;
			local35 += local52;
			local33 += local52;
		}
		if (local26 <= 0 || local29 <= 0) {
			return;
		}
		@Pc(159) Class145_Sub2 local159 = (Class145_Sub2) arg2;
		@Pc(162) int[] local162 = local159.anIntArray554;
		@Pc(165) int[] local165 = local159.anIntArray553;
		@Pc(169) int[] local169 = super.aClass19_Sub1_11.anIntArray26;
		@Pc(171) int local171 = arg1;
		if (arg4 > arg1) {
			local171 = arg4;
			local41 += (arg4 - arg1) * local23;
			local19 += (arg4 - arg1) * super.anInt7168;
		}
		@Pc(210) int local210 = arg4 + local162.length < arg1 + local29 ? arg4 + local162.length : arg1 + local29;
		for (@Pc(212) int local212 = local171; local212 < local210; local212++) {
			@Pc(221) int local221 = local162[local212 - arg4] + arg3;
			@Pc(227) int local227 = local165[local212 - arg4];
			@Pc(229) int local229 = local26;
			@Pc(236) int local236;
			if (arg0 > local221) {
				local236 = arg0 - local221;
				if (local236 >= local227) {
					local19 += local26 + local35;
					local41 += local26 + local33;
					continue;
				}
				local227 -= local236;
			} else {
				local236 = local221 - arg0;
				if (local236 >= local26) {
					local19 += local26 + local35;
					local41 += local26 + local33;
					continue;
				}
				local19 += local236;
				local229 = local26 - local236;
				local41 += local236;
			}
			local236 = 0;
			if (local229 < local227) {
				local227 = local229;
			} else {
				local236 = local229 - local227;
			}
			for (@Pc(304) int local304 = -local227; local304 < 0; local304++) {
				@Pc(311) int local311 = this.anIntArray323[local19++];
				@Pc(315) int local315 = local311 >>> 24;
				@Pc(319) int local319 = 256 - local315;
				@Pc(323) int local323 = local169[local41];
				local169[local41++] = ((local311 & 0xFF00FF) * local315 + (local323 & 0xFF00FF) * local319 & 0xFF00FF00) + ((local311 & 0xFF00) * local315 + (local323 & 0xFF00) * local319 & 0xFF0000) >> 8;
			}
			local19 += local236 + local35;
			local41 += local236 + local33;
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)V")
	@Override
	protected void method5544(@OriginalArg(0) int arg0) {
		@Pc(3) int[] local3 = super.aClass19_Sub1_11.anIntArray26;
		@Pc(935) int local935;
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(48) int local48;
		@Pc(51) int local51;
		@Pc(209) int local209;
		@Pc(213) int local213;
		@Pc(217) int local217;
		@Pc(221) int local221;
		@Pc(334) int local334;
		@Pc(342) int local342;
		@Pc(354) int local354;
		if (Static359.anInt7153 == 0) {
			if (Static359.anInt7164 == 0) {
				local9 = Static359.anInt7141;
				while (local9 < 0) {
					local12 = Static359.anInt7156;
					local14 = Static359.anInt7145;
					local16 = Static359.anInt7146;
					local18 = Static359.anInt7151;
					if (local14 >= 0 && local16 >= 0 && local14 - (super.anInt7168 << 12) < 0 && local16 - (super.anInt7144 << 12) < 0) {
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7168 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray323[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else if (arg0 == 0) {
								local209 = this.anIntArray323[local48];
								local213 = (local209 >>> 24) * Static359.anInt7161 >> 8;
								local217 = 256 - local213;
								if ((Static359.anInt7160 & 0xFFFFFF) == 16777215) {
									local221 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
								} else if (local213 == 255) {
									local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
									local3[local51] = (local221 | local334 | local342) >>> 8;
								} else {
									local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
									local209 = (local221 | local334 | local342) >>> 8;
									local354 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray323[local48];
								local213 = Static359.anInt7160;
								local217 = local209 + local213;
								local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
								local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
								local334 = local217 - local334 | local334 - (local334 >>> 8);
								local342 = (local334 >>> 24) * Static359.anInt7161 >> 8;
								local354 = 256 - local342;
								if (local342 != 255) {
									local209 = local334;
									local334 = local3[local51];
									local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
								}
								local3[local51] = local334;
							} else if (arg0 == 2) {
								local209 = this.anIntArray323[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = (local209 & 0xFF00FF) * Static359.anInt7161 & 0xFF00FF00;
								local334 = (local209 & 0xFF00) * Static359.anInt7161 & 0xFF0000;
								local209 = ((local221 | local334) >>> 8) + Static359.anInt7152;
								local342 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local18++;
						}
					}
					local9++;
					Static359.anInt7156 += Static359.anInt7154;
				}
			} else if (Static359.anInt7164 < 0) {
				local9 = Static359.anInt7141;
				while (local9 < 0) {
					local12 = Static359.anInt7156;
					local14 = Static359.anInt7145;
					local16 = Static359.anInt7146 + Static359.anInt7142;
					local18 = Static359.anInt7151;
					if (local14 >= 0 && local14 - (super.anInt7168 << 12) < 0) {
						@Pc(928) int local928;
						if ((local928 = local16 - (super.anInt7144 << 12)) >= 0) {
							local935 = (Static359.anInt7164 - local928) / Static359.anInt7164;
							local18 += local935;
							local16 += Static359.anInt7164 * local935;
							local12 += local935;
						}
						@Pc(956) int local956;
						if ((local956 = (local16 - Static359.anInt7164) / Static359.anInt7164) > local18) {
							local18 = local956;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7168 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray323[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else if (arg0 == 0) {
								local209 = this.anIntArray323[local48];
								local213 = (local209 >>> 24) * Static359.anInt7161 >> 8;
								local217 = 256 - local213;
								if ((Static359.anInt7160 & 0xFFFFFF) == 16777215) {
									local221 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
								} else if (local213 == 255) {
									local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
									local3[local51] = (local221 | local334 | local342) >>> 8;
								} else {
									local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
									local209 = (local221 | local334 | local342) >>> 8;
									local354 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray323[local48];
								local213 = Static359.anInt7160;
								local217 = local209 + local213;
								local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
								local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
								local334 = local217 - local334 | local334 - (local334 >>> 8);
								local342 = (local334 >>> 24) * Static359.anInt7161 >> 8;
								local354 = 256 - local342;
								if (local342 != 255) {
									local209 = local334;
									local334 = local3[local51];
									local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
								}
								local3[local51] = local334;
							} else if (arg0 == 2) {
								local209 = this.anIntArray323[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = (local209 & 0xFF00FF) * Static359.anInt7161 & 0xFF00FF00;
								local334 = (local209 & 0xFF00) * Static359.anInt7161 & 0xFF0000;
								local209 = ((local221 | local334) >>> 8) + Static359.anInt7152;
								local342 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static359.anInt7164;
							local18++;
						}
					}
					local9++;
					Static359.anInt7145 += Static359.anInt7169;
					Static359.anInt7156 += Static359.anInt7154;
				}
			} else {
				local9 = Static359.anInt7141;
				while (local9 < 0) {
					local12 = Static359.anInt7156;
					local14 = Static359.anInt7145;
					local16 = Static359.anInt7146 + Static359.anInt7142;
					local18 = Static359.anInt7151;
					if (local14 >= 0 && local14 - (super.anInt7168 << 12) < 0) {
						if (local16 < 0) {
							local935 = (Static359.anInt7164 - local16 - 1) / Static359.anInt7164;
							local18 += local935;
							local16 += Static359.anInt7164 * local935;
							local12 += local935;
						}
						@Pc(1888) int local1888;
						if ((local1888 = (local16 + 1 - (super.anInt7144 << 12) - Static359.anInt7164) / Static359.anInt7164) > local18) {
							local18 = local1888;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7168 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray323[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else if (arg0 == 0) {
								local209 = this.anIntArray323[local48];
								local213 = (local209 >>> 24) * Static359.anInt7161 >> 8;
								local217 = 256 - local213;
								if ((Static359.anInt7160 & 0xFFFFFF) == 16777215) {
									local221 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
								} else if (local213 == 255) {
									local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
									local3[local51] = (local221 | local334 | local342) >>> 8;
								} else {
									local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
									local209 = (local221 | local334 | local342) >>> 8;
									local354 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray323[local48];
								local213 = Static359.anInt7160;
								local217 = local209 + local213;
								local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
								local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
								local334 = local217 - local334 | local334 - (local334 >>> 8);
								local342 = (local334 >>> 24) * Static359.anInt7161 >> 8;
								local354 = 256 - local342;
								if (local342 != 255) {
									local209 = local334;
									local334 = local3[local51];
									local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
								}
								local3[local51] = local334;
							} else if (arg0 == 2) {
								local209 = this.anIntArray323[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = (local209 & 0xFF00FF) * Static359.anInt7161 & 0xFF00FF00;
								local334 = (local209 & 0xFF00) * Static359.anInt7161 & 0xFF0000;
								local209 = ((local221 | local334) >>> 8) + Static359.anInt7152;
								local342 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static359.anInt7164;
							local18++;
						}
					}
					local9++;
					Static359.anInt7145 += Static359.anInt7169;
					Static359.anInt7156 += Static359.anInt7154;
				}
			}
		} else if (Static359.anInt7153 < 0) {
			if (Static359.anInt7164 == 0) {
				local9 = Static359.anInt7141;
				while (local9 < 0) {
					local12 = Static359.anInt7156;
					local14 = Static359.anInt7145 + Static359.anInt7143;
					local16 = Static359.anInt7146;
					local18 = Static359.anInt7151;
					if (local16 >= 0 && local16 - (super.anInt7144 << 12) < 0) {
						@Pc(2794) int local2794;
						if ((local2794 = local14 - (super.anInt7168 << 12)) >= 0) {
							local935 = (Static359.anInt7153 - local2794) / Static359.anInt7153;
							local18 += local935;
							local14 += Static359.anInt7153 * local935;
							local12 += local935;
						}
						@Pc(2822) int local2822;
						if ((local2822 = (local14 - Static359.anInt7153) / Static359.anInt7153) > local18) {
							local18 = local2822;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7168 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray323[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else if (arg0 == 0) {
								local209 = this.anIntArray323[local48];
								local213 = (local209 >>> 24) * Static359.anInt7161 >> 8;
								local217 = 256 - local213;
								if ((Static359.anInt7160 & 0xFFFFFF) == 16777215) {
									local221 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
								} else if (local213 == 255) {
									local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
									local3[local51] = (local221 | local334 | local342) >>> 8;
								} else {
									local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
									local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
									local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
									local209 = (local221 | local334 | local342) >>> 8;
									local354 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray323[local48];
								local213 = Static359.anInt7160;
								local217 = local209 + local213;
								local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
								local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
								local334 = local217 - local334 | local334 - (local334 >>> 8);
								local342 = (local334 >>> 24) * Static359.anInt7161 >> 8;
								local354 = 256 - local342;
								if (local342 != 255) {
									local209 = local334;
									local334 = local3[local51];
									local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
								}
								local3[local51] = local334;
							} else if (arg0 == 2) {
								local209 = this.anIntArray323[local48];
								local213 = local209 >>> 24;
								local217 = 256 - local213;
								local221 = (local209 & 0xFF00FF) * Static359.anInt7161 & 0xFF00FF00;
								local334 = (local209 & 0xFF00) * Static359.anInt7161 & 0xFF0000;
								local209 = ((local221 | local334) >>> 8) + Static359.anInt7152;
								local342 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local14 += Static359.anInt7153;
							local18++;
						}
					}
					local9++;
					Static359.anInt7146 += Static359.anInt7150;
					Static359.anInt7156 += Static359.anInt7154;
				}
			} else if (Static359.anInt7164 < 0) {
				local9 = Static359.anInt7141;
				while (local9 < 0) {
					local12 = Static359.anInt7156;
					local14 = Static359.anInt7145 + Static359.anInt7143;
					local16 = Static359.anInt7146 + Static359.anInt7142;
					local18 = Static359.anInt7151;
					@Pc(3719) int local3719;
					if ((local3719 = local14 - (super.anInt7168 << 12)) >= 0) {
						local935 = (Static359.anInt7153 - local3719) / Static359.anInt7153;
						local18 += local935;
						local14 += Static359.anInt7153 * local935;
						local16 += Static359.anInt7164 * local935;
						local12 += local935;
					}
					@Pc(3753) int local3753;
					if ((local3753 = (local14 - Static359.anInt7153) / Static359.anInt7153) > local18) {
						local18 = local3753;
					}
					@Pc(3765) int local3765;
					if ((local3765 = local16 - (super.anInt7144 << 12)) >= 0) {
						local935 = (Static359.anInt7164 - local3765) / Static359.anInt7164;
						local18 += local935;
						local14 += Static359.anInt7153 * local935;
						local16 += Static359.anInt7164 * local935;
						local12 += local935;
					}
					@Pc(3799) int local3799;
					if ((local3799 = (local16 - Static359.anInt7164) / Static359.anInt7164) > local18) {
						local18 = local3799;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt7168 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray323[local48];
							local213 = local209 >>> 24;
							local217 = 256 - local213;
							local221 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else if (arg0 == 0) {
							local209 = this.anIntArray323[local48];
							local213 = (local209 >>> 24) * Static359.anInt7161 >> 8;
							local217 = 256 - local213;
							if ((Static359.anInt7160 & 0xFFFFFF) == 16777215) {
								local221 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else if (local213 == 255) {
								local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
								local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
								local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
								local3[local51] = (local221 | local334 | local342) >>> 8;
							} else {
								local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
								local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
								local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
								local209 = (local221 | local334 | local342) >>> 8;
								local354 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray323[local48];
							local213 = Static359.anInt7160;
							local217 = local209 + local213;
							local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
							local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
							local334 = local217 - local334 | local334 - (local334 >>> 8);
							local342 = (local334 >>> 24) * Static359.anInt7161 >> 8;
							local354 = 256 - local342;
							if (local342 != 255) {
								local209 = local334;
								local334 = local3[local51];
								local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
							}
							local3[local51] = local334;
						} else if (arg0 == 2) {
							local209 = this.anIntArray323[local48];
							local213 = local209 >>> 24;
							local217 = 256 - local213;
							local221 = (local209 & 0xFF00FF) * Static359.anInt7161 & 0xFF00FF00;
							local334 = (local209 & 0xFF00) * Static359.anInt7161 & 0xFF0000;
							local209 = ((local221 | local334) >>> 8) + Static359.anInt7152;
							local342 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static359.anInt7153;
						local16 += Static359.anInt7164;
						local18++;
					}
					local9++;
					Static359.anInt7145 += Static359.anInt7169;
					Static359.anInt7146 += Static359.anInt7150;
					Static359.anInt7156 += Static359.anInt7154;
				}
			} else {
				local9 = Static359.anInt7141;
				while (local9 < 0) {
					local12 = Static359.anInt7156;
					local14 = Static359.anInt7145 + Static359.anInt7143;
					local16 = Static359.anInt7146 + Static359.anInt7142;
					local18 = Static359.anInt7151;
					@Pc(4702) int local4702;
					if ((local4702 = local14 - (super.anInt7168 << 12)) >= 0) {
						local935 = (Static359.anInt7153 - local4702) / Static359.anInt7153;
						local18 += local935;
						local14 += Static359.anInt7153 * local935;
						local16 += Static359.anInt7164 * local935;
						local12 += local935;
					}
					@Pc(4736) int local4736;
					if ((local4736 = (local14 - Static359.anInt7153) / Static359.anInt7153) > local18) {
						local18 = local4736;
					}
					if (local16 < 0) {
						local935 = (Static359.anInt7164 - local16 - 1) / Static359.anInt7164;
						local18 += local935;
						local14 += Static359.anInt7153 * local935;
						local16 += Static359.anInt7164 * local935;
						local12 += local935;
					}
					@Pc(4784) int local4784;
					if ((local4784 = (local16 + 1 - (super.anInt7144 << 12) - Static359.anInt7164) / Static359.anInt7164) > local18) {
						local18 = local4784;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt7168 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray323[local48];
							local213 = local209 >>> 24;
							local217 = 256 - local213;
							local221 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else if (arg0 == 0) {
							local209 = this.anIntArray323[local48];
							local213 = (local209 >>> 24) * Static359.anInt7161 >> 8;
							local217 = 256 - local213;
							if ((Static359.anInt7160 & 0xFFFFFF) == 16777215) {
								local221 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else if (local213 == 255) {
								local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
								local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
								local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
								local3[local51] = (local221 | local334 | local342) >>> 8;
							} else {
								local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
								local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
								local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
								local209 = (local221 | local334 | local342) >>> 8;
								local354 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray323[local48];
							local213 = Static359.anInt7160;
							local217 = local209 + local213;
							local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
							local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
							local334 = local217 - local334 | local334 - (local334 >>> 8);
							local342 = (local334 >>> 24) * Static359.anInt7161 >> 8;
							local354 = 256 - local342;
							if (local342 != 255) {
								local209 = local334;
								local334 = local3[local51];
								local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
							}
							local3[local51] = local334;
						} else if (arg0 == 2) {
							local209 = this.anIntArray323[local48];
							local213 = local209 >>> 24;
							local217 = 256 - local213;
							local221 = (local209 & 0xFF00FF) * Static359.anInt7161 & 0xFF00FF00;
							local334 = (local209 & 0xFF00) * Static359.anInt7161 & 0xFF0000;
							local209 = ((local221 | local334) >>> 8) + Static359.anInt7152;
							local342 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static359.anInt7153;
						local16 += Static359.anInt7164;
						local18++;
					}
					local9++;
					Static359.anInt7145 += Static359.anInt7169;
					Static359.anInt7146 += Static359.anInt7150;
					Static359.anInt7156 += Static359.anInt7154;
				}
			}
		} else if (Static359.anInt7164 == 0) {
			local9 = Static359.anInt7141;
			while (local9 < 0) {
				local12 = Static359.anInt7156;
				local14 = Static359.anInt7145 + Static359.anInt7143;
				local16 = Static359.anInt7146;
				local18 = Static359.anInt7151;
				if (local16 >= 0 && local16 - (super.anInt7144 << 12) < 0) {
					if (local14 < 0) {
						local935 = (Static359.anInt7153 - local14 - 1) / Static359.anInt7153;
						local18 += local935;
						local14 += Static359.anInt7153 * local935;
						local12 += local935;
					}
					@Pc(5726) int local5726;
					if ((local5726 = (local14 + 1 - (super.anInt7168 << 12) - Static359.anInt7153) / Static359.anInt7153) > local18) {
						local18 = local5726;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt7168 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray323[local48];
							local213 = local209 >>> 24;
							local217 = 256 - local213;
							local221 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else if (arg0 == 0) {
							local209 = this.anIntArray323[local48];
							local213 = (local209 >>> 24) * Static359.anInt7161 >> 8;
							local217 = 256 - local213;
							if ((Static359.anInt7160 & 0xFFFFFF) == 16777215) {
								local221 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
							} else if (local213 == 255) {
								local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
								local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
								local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
								local3[local51] = (local221 | local334 | local342) >>> 8;
							} else {
								local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
								local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
								local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
								local209 = (local221 | local334 | local342) >>> 8;
								local354 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray323[local48];
							local213 = Static359.anInt7160;
							local217 = local209 + local213;
							local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
							local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
							local334 = local217 - local334 | local334 - (local334 >>> 8);
							local342 = (local334 >>> 24) * Static359.anInt7161 >> 8;
							local354 = 256 - local342;
							if (local342 != 255) {
								local209 = local334;
								local334 = local3[local51];
								local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
							}
							local3[local51] = local334;
						} else if (arg0 == 2) {
							local209 = this.anIntArray323[local48];
							local213 = local209 >>> 24;
							local217 = 256 - local213;
							local221 = (local209 & 0xFF00FF) * Static359.anInt7161 & 0xFF00FF00;
							local334 = (local209 & 0xFF00) * Static359.anInt7161 & 0xFF0000;
							local209 = ((local221 | local334) >>> 8) + Static359.anInt7152;
							local342 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static359.anInt7153;
						local18++;
					}
				}
				local9++;
				Static359.anInt7145 += Static359.anInt7169;
				Static359.anInt7146 += Static359.anInt7150;
				Static359.anInt7156 += Static359.anInt7154;
			}
		} else if (Static359.anInt7164 < 0) {
			for (local9 = Static359.anInt7141; local9 < 0; local9++) {
				local12 = Static359.anInt7156;
				local14 = Static359.anInt7145 + Static359.anInt7143;
				local16 = Static359.anInt7146 + Static359.anInt7142;
				local18 = Static359.anInt7151;
				if (local14 < 0) {
					local935 = (Static359.anInt7153 - local14 - 1) / Static359.anInt7153;
					local18 += local935;
					local14 += Static359.anInt7153 * local935;
					local16 += Static359.anInt7164 * local935;
					local12 += local935;
				}
				@Pc(6663) int local6663;
				if ((local6663 = (local14 + 1 - (super.anInt7168 << 12) - Static359.anInt7153) / Static359.anInt7153) > local18) {
					local18 = local6663;
				}
				@Pc(6675) int local6675;
				if ((local6675 = local16 - (super.anInt7144 << 12)) >= 0) {
					local935 = (Static359.anInt7164 - local6675) / Static359.anInt7164;
					local18 += local935;
					local14 += Static359.anInt7153 * local935;
					local16 += Static359.anInt7164 * local935;
					local12 += local935;
				}
				@Pc(6709) int local6709;
				if ((local6709 = (local16 - Static359.anInt7164) / Static359.anInt7164) > local18) {
					local18 = local6709;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt7168 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local209 = this.anIntArray323[local48];
						local213 = local209 >>> 24;
						local217 = 256 - local213;
						local221 = local3[local51];
						local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
					} else if (arg0 == 0) {
						local209 = this.anIntArray323[local48];
						local213 = (local209 >>> 24) * Static359.anInt7161 >> 8;
						local217 = 256 - local213;
						if ((Static359.anInt7160 & 0xFFFFFF) == 16777215) {
							local221 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else if (local213 == 255) {
							local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
							local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
							local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
							local3[local51] = (local221 | local334 | local342) >>> 8;
						} else {
							local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
							local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
							local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
							local209 = (local221 | local334 | local342) >>> 8;
							local354 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
						}
					} else if (arg0 == 3) {
						local209 = this.anIntArray323[local48];
						local213 = Static359.anInt7160;
						local217 = local209 + local213;
						local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
						local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
						local334 = local217 - local334 | local334 - (local334 >>> 8);
						local342 = (local334 >>> 24) * Static359.anInt7161 >> 8;
						local354 = 256 - local342;
						if (local342 != 255) {
							local209 = local334;
							local334 = local3[local51];
							local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
						}
						local3[local51] = local334;
					} else if (arg0 == 2) {
						local209 = this.anIntArray323[local48];
						local213 = local209 >>> 24;
						local217 = 256 - local213;
						local221 = (local209 & 0xFF00FF) * Static359.anInt7161 & 0xFF00FF00;
						local334 = (local209 & 0xFF00) * Static359.anInt7161 & 0xFF0000;
						local209 = ((local221 | local334) >>> 8) + Static359.anInt7152;
						local342 = local3[local51];
						local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static359.anInt7153;
					local16 += Static359.anInt7164;
					local18++;
				}
				Static359.anInt7145 += Static359.anInt7169;
				Static359.anInt7146 += Static359.anInt7150;
				Static359.anInt7156 += Static359.anInt7154;
			}
		} else {
			for (local9 = Static359.anInt7141; local9 < 0; local9++) {
				local12 = Static359.anInt7156;
				local14 = Static359.anInt7145 + Static359.anInt7143;
				local16 = Static359.anInt7146 + Static359.anInt7142;
				local18 = Static359.anInt7151;
				if (local14 < 0) {
					local935 = (Static359.anInt7153 - local14 - 1) / Static359.anInt7153;
					local18 += local935;
					local14 += Static359.anInt7153 * local935;
					local16 += Static359.anInt7164 * local935;
					local12 += local935;
				}
				@Pc(7648) int local7648;
				if ((local7648 = (local14 + 1 - (super.anInt7168 << 12) - Static359.anInt7153) / Static359.anInt7153) > local18) {
					local18 = local7648;
				}
				if (local16 < 0) {
					local935 = (Static359.anInt7164 - local16 - 1) / Static359.anInt7164;
					local18 += local935;
					local14 += Static359.anInt7153 * local935;
					local16 += Static359.anInt7164 * local935;
					local12 += local935;
				}
				@Pc(7696) int local7696;
				if ((local7696 = (local16 + 1 - (super.anInt7144 << 12) - Static359.anInt7164) / Static359.anInt7164) > local18) {
					local18 = local7696;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt7168 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local209 = this.anIntArray323[local48];
						local213 = local209 >>> 24;
						local217 = 256 - local213;
						local221 = local3[local51];
						local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
					} else if (arg0 == 0) {
						local209 = this.anIntArray323[local48];
						local213 = (local209 >>> 24) * Static359.anInt7161 >> 8;
						local217 = 256 - local213;
						if ((Static359.anInt7160 & 0xFFFFFF) == 16777215) {
							local221 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local221 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local221 & 0xFF00) * local217 & 0xFF0000) >> 8;
						} else if (local213 == 255) {
							local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
							local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
							local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
							local3[local51] = (local221 | local334 | local342) >>> 8;
						} else {
							local221 = (local209 & 0xFF0000) * Static359.anInt7165 & 0xFF000000;
							local334 = (local209 & 0xFF00) * Static359.anInt7167 & 0xFF0000;
							local342 = (local209 & 0xFF) * Static359.anInt7158 & 0xFF00;
							local209 = (local221 | local334 | local342) >>> 8;
							local354 = local3[local51];
							local3[local51] = ((local209 & 0xFF00FF) * local213 + (local354 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local354 & 0xFF00) * local217 & 0xFF0000) >> 8;
						}
					} else if (arg0 == 3) {
						local209 = this.anIntArray323[local48];
						local213 = Static359.anInt7160;
						local217 = local209 + local213;
						local221 = (local209 & 0xFF00FF) + (local213 & 0xFF00FF);
						local334 = (local221 & 0x1000100) + (local217 - local221 & 0x10000);
						local334 = local217 - local334 | local334 - (local334 >>> 8);
						local342 = (local334 >>> 24) * Static359.anInt7161 >> 8;
						local354 = 256 - local342;
						if (local342 != 255) {
							local209 = local334;
							local334 = local3[local51];
							local334 = ((local209 & 0xFF00FF) * local342 + (local334 & 0xFF00FF) * local354 & 0xFF00FF00) + ((local209 & 0xFF00) * local342 + (local334 & 0xFF00) * local354 & 0xFF0000) >> 8;
						}
						local3[local51] = local334;
					} else if (arg0 == 2) {
						local209 = this.anIntArray323[local48];
						local213 = local209 >>> 24;
						local217 = 256 - local213;
						local221 = (local209 & 0xFF00FF) * Static359.anInt7161 & 0xFF00FF00;
						local334 = (local209 & 0xFF00) * Static359.anInt7161 & 0xFF0000;
						local209 = ((local221 | local334) >>> 8) + Static359.anInt7152;
						local342 = local3[local51];
						local3[local51] = ((local209 & 0xFF00FF) * local213 + (local342 & 0xFF00FF) * local217 & 0xFF00FF00) + ((local209 & 0xFF00) * local213 + (local342 & 0xFF00) * local217 & 0xFF0000) >> 8;
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static359.anInt7153;
					local16 += Static359.anInt7164;
					local18++;
				}
				Static359.anInt7145 += Static359.anInt7169;
				Static359.anInt7146 += Static359.anInt7150;
				Static359.anInt7156 += Static359.anInt7154;
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "s", descriptor = "(IIIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (super.aClass19_Sub1_11.method489()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(20) int local20 = super.aClass19_Sub1_11.anInt430;
			@Pc(29) int local29 = super.anInt7157 + super.anInt7168 + super.anInt7155;
			@Pc(38) int local38 = super.anInt7148 + super.anInt7144 + super.anInt7162;
			@Pc(44) int local44 = (local29 << 16) / arg2;
			@Pc(50) int local50 = (local38 << 16) / arg3;
			@Pc(64) int local64;
			if (super.anInt7157 > 0) {
				local64 = ((super.anInt7157 << 16) + local44 - 1) / local44;
				arg0 += local64;
				local14 += local64 * local44 - (super.anInt7157 << 16);
			}
			if (super.anInt7148 > 0) {
				local64 = ((super.anInt7148 << 16) + local50 - 1) / local50;
				arg1 += local64;
				local16 += local64 * local50 - (super.anInt7148 << 16);
			}
			if (super.anInt7168 < local29) {
				arg2 = ((super.anInt7168 << 16) + local44 - local14 - 1) / local44;
			}
			if (super.anInt7144 < local38) {
				arg3 = ((super.anInt7144 << 16) + local50 - local16 - 1) / local50;
			}
			local64 = arg0 + arg1 * local20;
			@Pc(152) int local152 = local20 - arg2;
			if (arg1 + arg3 > super.aClass19_Sub1_11.anInt421) {
				arg3 -= arg1 + arg3 - super.aClass19_Sub1_11.anInt421;
			}
			@Pc(180) int local180;
			if (arg1 < super.aClass19_Sub1_11.anInt425) {
				local180 = super.aClass19_Sub1_11.anInt425 - arg1;
				arg3 -= local180;
				local64 += local180 * local20;
				local16 += local50 * local180;
			}
			if (arg0 + arg2 > super.aClass19_Sub1_11.anInt402) {
				local180 = arg0 + arg2 - super.aClass19_Sub1_11.anInt402;
				arg2 -= local180;
				local152 += local180;
			}
			if (arg0 < super.aClass19_Sub1_11.lb) {
				local180 = super.aClass19_Sub1_11.lb - arg0;
				arg2 -= local180;
				local64 += local180;
				local14 += local44 * local180;
				local152 += local180;
			}
			@Pc(252) int[] local252 = super.aClass19_Sub1_11.anIntArray26;
			@Pc(259) int local259;
			@Pc(262) int local262;
			@Pc(270) int local270;
			@Pc(273) int local273;
			@Pc(330) int local330;
			@Pc(338) int local338;
			@Pc(341) int local341;
			@Pc(351) int local351;
			@Pc(359) int local359;
			@Pc(367) int local367;
			@Pc(375) int local375;
			@Pc(525) int local525;
			if (arg6 != 0) {
				@Pc(879) int local879;
				@Pc(887) int local887;
				@Pc(899) int local899;
				if (arg6 == 1) {
					if (arg4 == 1) {
						local259 = local14;
						for (local262 = -arg3; local262 < 0; local262++) {
							local270 = (local16 >> 16) * super.anInt7168;
							for (local273 = -arg2; local273 < 0; local273++) {
								local330 = this.anIntArray323[(local14 >> 16) + local270];
								local338 = local330 >>> 24;
								local341 = 256 - local338;
								local351 = local252[local64];
								local252[local64++] = ((local330 & 0xFF00FF) * local338 + (local351 & 0xFF00FF) * local341 & 0xFF00FF00) + ((local330 & 0xFF00) * local338 + (local351 & 0xFF00) * local341 & 0xFF0000) >> 8;
								local14 += local44;
							}
							local16 += local50;
							local14 = local259;
							local64 += local152;
						}
					} else if (arg4 == 0) {
						local259 = local14;
						if ((arg5 & 0xFFFFFF) == 16777215) {
							for (local262 = -arg3; local262 < 0; local262++) {
								local270 = (local16 >> 16) * super.anInt7168;
								for (local273 = -arg2; local273 < 0; local273++) {
									local330 = this.anIntArray323[(local14 >> 16) + local270];
									local338 = (local330 >>> 24) * (arg5 >>> 24) >> 8;
									local341 = 256 - local338;
									local351 = local252[local64];
									local252[local64++] = ((local330 & 0xFF00FF) * local338 + (local351 & 0xFF00FF) * local341 & 0xFF00FF00) + ((local330 & 0xFF00) * local338 + (local351 & 0xFF00) * local341 & 0xFF0000) >> 8;
									local14 += local44;
								}
								local16 += local50;
								local14 = local259;
								local64 += local152;
							}
						} else {
							local262 = arg5 >> 16 & 0xFF;
							local270 = arg5 >> 8 & 0xFF;
							local273 = arg5 & 0xFF;
							for (local330 = -arg3; local330 < 0; local330++) {
								local338 = (local16 >> 16) * super.anInt7168;
								for (local341 = -arg2; local341 < 0; local341++) {
									local351 = this.anIntArray323[(local14 >> 16) + local338];
									local359 = (local351 >>> 24) * (arg5 >>> 24) >> 8;
									local367 = 256 - local359;
									if (local359 == 255) {
										local375 = (local351 & 0xFF0000) * local262 & 0xFF000000;
										local879 = (local351 & 0xFF00) * local270 & 0xFF0000;
										local887 = (local351 & 0xFF) * local273 & 0xFF00;
										local252[local64++] = (local375 | local879 | local887) >>> 8;
									} else {
										local375 = (local351 & 0xFF0000) * local262 & 0xFF000000;
										local879 = (local351 & 0xFF00) * local270 & 0xFF0000;
										local887 = (local351 & 0xFF) * local273 & 0xFF00;
										local351 = (local375 | local879 | local887) >>> 8;
										local899 = local252[local64];
										local252[local64++] = ((local351 & 0xFF00FF) * local359 + (local899 & 0xFF00FF) * local367 & 0xFF00FF00) + ((local351 & 0xFF00) * local359 + (local899 & 0xFF00) * local367 & 0xFF0000) >> 8;
									}
									local14 += local44;
								}
								local16 += local50;
								local14 = local259;
								local64 += local152;
							}
						}
					} else if (arg4 == 3) {
						local259 = local14;
						for (local262 = -arg3; local262 < 0; local262++) {
							local270 = (local16 >> 16) * super.anInt7168;
							for (local273 = -arg2; local273 < 0; local273++) {
								local330 = this.anIntArray323[(local14 >> 16) + local270];
								local338 = local330 + arg5;
								local341 = (local330 & 0xFF00FF) + (arg5 & 0xFF00FF);
								local351 = (local341 & 0x1000100) + (local338 - local341 & 0x10000);
								local351 = local338 - local351 | local351 - (local351 >>> 8);
								local359 = (local351 >>> 24) * (arg5 >>> 24) >> 8;
								local367 = 256 - local359;
								if (local359 != 255) {
									local330 = local351;
									local351 = local252[local64];
									local351 = ((local330 & 0xFF00FF) * local359 + (local351 & 0xFF00FF) * local367 & 0xFF00FF00) + ((local330 & 0xFF00) * local359 + (local351 & 0xFF00) * local367 & 0xFF0000) >> 8;
								}
								local252[local64++] = local351;
								local14 += local44;
							}
							local16 += local50;
							local14 = local259;
							local64 += local152;
						}
					} else if (arg4 == 2) {
						local259 = arg5 >>> 24;
						local262 = 256 - local259;
						local270 = (arg5 & 0xFF00FF) * local262 & 0xFF00FF00;
						local273 = (arg5 & 0xFF00) * local262 & 0xFF0000;
						local525 = (local270 | local273) >>> 8;
						local330 = local14;
						for (local338 = -arg3; local338 < 0; local338++) {
							local341 = (local16 >> 16) * super.anInt7168;
							for (local351 = -arg2; local351 < 0; local351++) {
								local359 = this.anIntArray323[(local14 >> 16) + local341];
								local367 = local359 >>> 24;
								local375 = 256 - local367;
								local270 = (local359 & 0xFF00FF) * local259 & 0xFF00FF00;
								local273 = (local359 & 0xFF00) * local259 & 0xFF0000;
								local359 = ((local270 | local273) >>> 8) + local525;
								local879 = local252[local64];
								local252[local64++] = ((local359 & 0xFF00FF) * local367 + (local879 & 0xFF00FF) * local375 & 0xFF00FF00) + ((local359 & 0xFF00) * local367 + (local879 & 0xFF00) * local375 & 0xFF0000) >> 8;
								local14 += local44;
							}
							local16 += local50;
							local14 = local330;
							local64 += local152;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (arg6 != 2) {
					throw new IllegalArgumentException();
				} else if (arg4 == 1) {
					local259 = local14;
					for (local262 = -arg3; local262 < 0; local262++) {
						local270 = (local16 >> 16) * super.anInt7168;
						for (local273 = -arg2; local273 < 0; local273++) {
							local330 = this.anIntArray323[(local14 >> 16) + local270];
							if (local330 == 0) {
								local64++;
							} else {
								local338 = local252[local64];
								local341 = local330 + local338;
								local351 = (local330 & 0xFF00FF) + (local338 & 0xFF00FF);
								local338 = (local351 & 0x1000100) + (local341 - local351 & 0x10000);
								local252[local64++] = local341 - local338 | local338 - (local338 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local259;
						local64 += local152;
					}
				} else if (arg4 == 0) {
					local259 = local14;
					local262 = arg5 >> 16 & 0xFF;
					local270 = arg5 >> 8 & 0xFF;
					local273 = arg5 & 0xFF;
					for (local330 = -arg3; local330 < 0; local330++) {
						local338 = (local16 >> 16) * super.anInt7168;
						for (local341 = -arg2; local341 < 0; local341++) {
							local351 = this.anIntArray323[(local14 >> 16) + local338];
							if (local351 == 0) {
								local64++;
							} else {
								local359 = (local351 & 0xFF0000) * local262 & 0xFF000000;
								local367 = (local351 & 0xFF00) * local270 & 0xFF0000;
								local375 = (local351 & 0xFF) * local273 & 0xFF00;
								local351 = (local359 | local367 | local375) >>> 8;
								local879 = local252[local64];
								local887 = local351 + local879;
								local899 = (local351 & 0xFF00FF) + (local879 & 0xFF00FF);
								local879 = (local899 & 0x1000100) + (local887 - local899 & 0x10000);
								local252[local64++] = local887 - local879 | local879 - (local879 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local259;
						local64 += local152;
					}
				} else if (arg4 == 3) {
					local259 = local14;
					for (local262 = -arg3; local262 < 0; local262++) {
						local270 = (local16 >> 16) * super.anInt7168;
						for (local273 = -arg2; local273 < 0; local273++) {
							local330 = this.anIntArray323[(local14 >> 16) + local270];
							local338 = local330 + arg5;
							local341 = (local330 & 0xFF00FF) + (arg5 & 0xFF00FF);
							local351 = (local341 & 0x1000100) + (local338 - local341 & 0x10000);
							local330 = local338 - local351 | local351 - (local351 >>> 8);
							local351 = local252[local64];
							local338 = local330 + local351;
							local341 = (local330 & 0xFF00FF) + (local351 & 0xFF00FF);
							local351 = (local341 & 0x1000100) + (local338 - local341 & 0x10000);
							local252[local64++] = local338 - local351 | local351 - (local351 >>> 8);
							local14 += local44;
						}
						local16 += local50;
						local14 = local259;
						local64 += local152;
					}
				} else if (arg4 == 2) {
					local259 = arg5 >>> 24;
					local262 = 256 - local259;
					local270 = (arg5 & 0xFF00FF) * local262 & 0xFF00FF00;
					local273 = (arg5 & 0xFF00) * local262 & 0xFF0000;
					local525 = (local270 | local273) >>> 8;
					local330 = local14;
					for (local338 = -arg3; local338 < 0; local338++) {
						local341 = (local16 >> 16) * super.anInt7168;
						for (local351 = -arg2; local351 < 0; local351++) {
							local359 = this.anIntArray323[(local14 >> 16) + local341];
							if (local359 == 0) {
								local64++;
							} else {
								local270 = (local359 & 0xFF00FF) * local259 & 0xFF00FF00;
								local273 = (local359 & 0xFF00) * local259 & 0xFF0000;
								local359 = ((local270 | local273) >>> 8) + local525;
								local367 = local252[local64];
								local375 = local359 + local367;
								local879 = (local359 & 0xFF00FF) + (local367 & 0xFF00FF);
								@Pc(1750) int local1750 = (local879 & 0x1000100) + (local375 - local879 & 0x10000);
								local252[local64++] = local375 - local1750 | local1750 - (local1750 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local330;
						local64 += local152;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg4 == 1) {
				local259 = local14;
				for (local262 = -arg3; local262 < 0; local262++) {
					local270 = (local16 >> 16) * super.anInt7168;
					for (local273 = -arg2; local273 < 0; local273++) {
						local252[local64++] = this.anIntArray323[(local14 >> 16) + local270];
						local14 += local44;
					}
					local16 += local50;
					local14 = local259;
					local64 += local152;
				}
			} else if (arg4 == 0) {
				local259 = arg5 >> 16 & 0xFF;
				local262 = arg5 >> 8 & 0xFF;
				local270 = arg5 & 0xFF;
				local273 = local14;
				for (local330 = -arg3; local330 < 0; local330++) {
					local338 = (local16 >> 16) * super.anInt7168;
					for (local341 = -arg2; local341 < 0; local341++) {
						local351 = this.anIntArray323[(local14 >> 16) + local338];
						local359 = (local351 & 0xFF0000) * local259 & 0xFF000000;
						local367 = (local351 & 0xFF00) * local262 & 0xFF0000;
						local375 = (local351 & 0xFF) * local270 & 0xFF00;
						local252[local64++] = (local359 | local367 | local375) >>> 8;
						local14 += local44;
					}
					local16 += local50;
					local14 = local273;
					local64 += local152;
				}
			} else if (arg4 == 3) {
				local259 = local14;
				for (local262 = -arg3; local262 < 0; local262++) {
					local270 = (local16 >> 16) * super.anInt7168;
					for (local273 = -arg2; local273 < 0; local273++) {
						local330 = this.anIntArray323[(local14 >> 16) + local270];
						local338 = local330 + arg5;
						local341 = (local330 & 0xFF00FF) + (arg5 & 0xFF00FF);
						local351 = (local341 & 0x1000100) + (local338 - local341 & 0x10000);
						local252[local64++] = local338 - local351 | local351 - (local351 >>> 8);
						local14 += local44;
					}
					local16 += local50;
					local14 = local259;
					local64 += local152;
				}
			} else if (arg4 == 2) {
				local259 = arg5 >>> 24;
				local262 = 256 - local259;
				local270 = (arg5 & 0xFF00FF) * local262 & 0xFF00FF00;
				local273 = (arg5 & 0xFF00) * local262 & 0xFF0000;
				local525 = (local270 | local273) >>> 8;
				local330 = local14;
				for (local338 = -arg3; local338 < 0; local338++) {
					local341 = (local16 >> 16) * super.anInt7168;
					for (local351 = -arg2; local351 < 0; local351++) {
						local359 = this.anIntArray323[(local14 >> 16) + local341];
						local270 = (local359 & 0xFF00FF) * local259 & 0xFF00FF00;
						local273 = (local359 & 0xFF00) * local259 & 0xFF0000;
						local252[local64++] = ((local270 | local273) >>> 8) + local525;
						local14 += local44;
					}
					local16 += local50;
					local14 = local330;
					local64 += local152;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}
}
