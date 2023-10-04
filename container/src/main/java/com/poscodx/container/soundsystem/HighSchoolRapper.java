package com.poscodx.container.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class HighSchoolRapper implements CompactDisc {
	@Override
	public String play() {
		return "Playing 붕붕 by 김하온" ;
	}

}
