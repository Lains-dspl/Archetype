package com.dspl.archetype;

import org.springframework.stereotype.Component;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo.InstanceStatus;
@Component
public class HealtCheck implements HealthCheckHandler{

	@Override
	public InstanceStatus getStatus(InstanceStatus currentStatus) {
		return null;
	}

}
