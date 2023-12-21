package net.luke.shipments;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Shipments implements ModInitializer {
	public static final String modId = "shipments";
    public static final Logger LOGGER = LoggerFactory.getLogger(modId);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}