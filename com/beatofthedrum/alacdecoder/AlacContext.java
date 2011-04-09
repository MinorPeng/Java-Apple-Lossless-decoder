/*
** AlacContext.java
**
** Copyright (c) 2011 Peter McQuillan
**
** All Rights Reserved.
**                       
** Distributed under the BSD Software License (see license.txt)  
**
*/

package com.beatofthedrum.alacdecoder;

public class AlacContext
{
	DemuxResT demux_res = new DemuxResT();
	AlacFile alac = new AlacFile();
	AlacInputStream input_stream;
	int current_sample_block = 0;
    int offset;
	public boolean error;
	public String error_message = "";
}