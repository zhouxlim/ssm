package com.zhouxl.ssm.dto;

import com.zhouxl.ssm.entity.Appointment;
import com.zhouxl.ssm.enums.AppointStateEnum;

public class AppointExecution {

		private long bookId;
		
		private int state;
		
		private String stateInfo;
		
		private Appointment appointment;
		
		public AppointExecution() {
			
		}
		
		public AppointExecution(long bookId,AppointStateEnum stateEnum) {
			this.bookId = bookId;
			this.state = state;
			this.stateInfo = stateInfo;
		}
		
		public AppointExecution(long bookId, AppointStateEnum stateEnum, Appointment appointment) {
			this.bookId = bookId;
			this.state = state;
			this.stateInfo = stateInfo;
			this.appointment = appointment;
		}
		
		@Override
		public String toString() {
			return "AppointExecution [bookId=" + bookId + ", state=" + state + ", stateInfo=" + stateInfo + ", appointment="
					+ appointment + "]";
		}
}
