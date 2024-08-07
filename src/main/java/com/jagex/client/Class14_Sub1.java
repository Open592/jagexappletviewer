package com.jagex.client;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class14_Sub1 extends Class14 implements MouseWheelListener {

	@OriginalMember(owner = "client!as", name = "j", descriptor = "I")
	private int anInt269 = 0;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)I")
	@Override
	public synchronized int method212() {
		@Pc(2) int local2 = this.anInt269;
		this.anInt269 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!as", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt269 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method209(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method213(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
